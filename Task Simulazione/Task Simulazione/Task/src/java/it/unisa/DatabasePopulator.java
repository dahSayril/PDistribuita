/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author CORSO_PD
 */
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
    private TaskEJB ejb;
    private TaskEntity t1, t2, t3;
    
    @PostConstruct
    private void populateDB() {
        
        t1 = new TaskEntity("Completare pagina home del sito web", Tipo.COMUNICAZIONE,
                4, "Maria", 0);
        t2 = new TaskEntity("Presentare novità", Tipo.INNOVAZIONE, 
                2, "nessuno", 75);
        t3 = new TaskEntity("Emettere fattura cliente 2", Tipo.AMMINISTRAZIONE, 
                7, "Pasquale", 100);
        ejb.createTask(t1);
        ejb.createTask(t2);
        ejb.createTask(t3);
        
    }
    
    @PreDestroy
    private void clearDB() {
        ejb.removeTask(t1);
        ejb.removeTask(t2);
        ejb.removeTask(t3);
    }
    
}
