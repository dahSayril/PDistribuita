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
        properties = {"connectionAttribute=;create=true"}
)
public class DatabasePopulator {
    
    @Inject
    private CdEJB ejb;
    private CdEntity cd1, cd2, cd3;
    
    @PostConstruct
    private void populateDB() {
        cd1 = new CdEntity("ID-1", "?", "XXXTentation", 9.99);
        cd2 = new CdEntity("ID-2", "Skins", "XXXTentation", 14.99);
        cd3 = new CdEntity("ID-3", "Bad Vibes Forever", "XXXTentation", 19.99);
        ejb.creaCd(cd1);
        ejb.creaCd(cd2);
        ejb.creaCd(cd3);
    }
    
    @PreDestroy
    private void clearDB() {
        ejb.eliminaCd(cd1);
        ejb.eliminaCd(cd2);
        ejb.eliminaCd(cd3);
    }
    
}
