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
   private CircoloEJB ejb;
   private CircoloEntity c1, c2, c3;
   
   @PostConstruct
   private void populateDB() {
       c1 = new CircoloEntity("Legambiente Benevento", "Antonio Basile", 
       "legammbiente.benevento@gmail.com", "Benevento", "Benevento", "Campania");
       c2 = new CircoloEntity("LEGAMBIENTE Valle dell'Irno", "Antonio D'Auria",
       "info@legambieneteirno.it", "Baronissi", "Salerno", "Campania");
       c3 = new CircoloEntity("Esther Ada", "Francesco Sanguedolce",
       "rancosangi@gmail.com", "Lampedusa", "Agrigento", "Sicilia");
       ejb.creaCircolo(c1);
       ejb.creaCircolo(c2);
       ejb.creaCircolo(c3);
   }
   
   @PreDestroy
   private void clearDB() {
       ejb.eliminaCircolo(c1);
       ejb.eliminaCircolo(c2);
       ejb.eliminaCircolo(c3);
   }
   
}
