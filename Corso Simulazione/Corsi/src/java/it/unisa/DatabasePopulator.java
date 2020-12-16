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
    private CorsoEJB ejb;
    private CorsoEntity c1, c2, c3;
    
    @PostConstruct
    private void populateDB() {
        c1 = new CorsoEntity("Programmazione Distribuita", CorsoLaurea.INFORMATICA,
            Tipo.TRIENNALE, Categoria.BLENDED, 120);
        c2 = new CorsoEntity("Analisi", CorsoLaurea.INFORMATICA, Tipo.TRIENNALE,
            Categoria.REMOTA, 150);
        c3 = new CorsoEntity("Analisi", CorsoLaurea.MATEMATICA, Tipo.TRIENNALE,
            Categoria.BLENDED, 200);
        ejb.creaCorso(c1);
        ejb.creaCorso(c2);
        ejb.creaCorso(c3);
    }
    
    @PreDestroy
    private void clearDB() {
        ejb.rimuoviCorso(c1);
        ejb.rimuoviCorso(c2);
        ejb.rimuoviCorso(c3);
    }
    
}
