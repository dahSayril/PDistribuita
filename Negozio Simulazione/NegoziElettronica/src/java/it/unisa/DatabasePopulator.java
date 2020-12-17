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
    private NegozioEJB ejb;
    private NegozioEntity n1, n2, n3;
    
    @PostConstruct
    private void populateDB() {
        n1 = new NegozioEntity("Elettroshop", "Stefano Lavori", 430015, 132210,
            "Napoli", "Napoli", "Campania");
        n2 = new NegozioEntity("BuildYourPC", "Marco Montagna Zucchero", 640000,
            212133, "Roma", "Roma", "Lazio");
        n3 = new NegozioEntity("ElettronicaOggi", "Guglielmo Cancelli", 345941,
            615231, "Cernusco", "Milano", "Lombardia");
        ejb.createNegozio(n1);
        ejb.createNegozio(n2);
        ejb.createNegozio(n3);
    }
    
    @PreDestroy
    private void clearDB() {
        ejb.removeNegozio(n1);
        ejb.removeNegozio(n2);
        ejb.removeNegozio(n3);
    }
    
}
