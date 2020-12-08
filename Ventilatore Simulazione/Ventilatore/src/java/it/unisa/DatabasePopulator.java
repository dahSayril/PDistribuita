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
    private VentilatoreEJB ejb;
    private VentilatoreEntity v1, v2, v3;
    
    @PostConstruct
    private void populateDB() {
        v1 = new VentilatoreEntity(
            "SoffioFresco", "VentilatorePerTutti", "Italia", 1500, 4, 10);
        v2 = new VentilatoreEntity(
            "Wind 3000", "Sturm", "Germania", 2200, 6, 12);
        v3 = new VentilatoreEntity(
            "BrezzaLeggera", "Frescura", "Francia", 1000, 5, 11);
        ejb.createVentilatore(v1);
        ejb.createVentilatore(v2);
        ejb.createVentilatore(v3);
    }
    
    @PreDestroy
    private void clearDB() {
        ejb.deleteVentilatore(v1);
        ejb.deleteVentilatore(v2);
        ejb.deleteVentilatore(v3);
    }
    
}
