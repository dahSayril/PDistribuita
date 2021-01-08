package it.unisa;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

@Singleton
@Startup
@DataSourceDefinition(
        className = "org.apache.derby.jdbc.EmbeddedDataSource",
        name = "java:global/jdbc/EsameDS",
        user = "app", password = "app",
        databaseName = "EsameDB",
        properties = {"connectionAttributes=;create=true"}
)
public class DatabasePopulator {
    
    @Inject
    private CanzoneEJB ejb;
    private CanzoneEntity c1, c2, c3;
    
    @PostConstruct
    private void populateDB() {
        c1 = new CanzoneEntity("Diodato", "Pop",
                "Sai che cosa penso, Che non dovrei pensare, Che se poi penso "
                + "sono un animale. E se ti penso tu sei un'anima,", false, 1000);
        c2 = new CanzoneEntity("Piero Pelù", 
                "Rock", "Spingi forte spingi forte salta fuori da quel buio. "
                + "Crescerai aprendo porte tutti i giorni stare pronti", false, 13);
        c3 = new CanzoneEntity("Bugo e Morgan", "Pop",
                "Le buone intenzioni, l'educazione. La tua foto profilo, buongiorno e"
                + " buonasera. E la gratitudine, le circostanze. Bevi se vuoi ma "
                + "fallo responsabilmente", false, 5000);
        ejb.creaCanzone(c1);
        ejb.creaCanzone(c2);
        ejb.creaCanzone(c3);
    }
    
    @PreDestroy
    private void clearDB() {
        ejb.rimuoviCanzone(c1);
        ejb.rimuoviCanzone(c2);
        ejb.rimuoviCanzone(c3);
    }
    
}
