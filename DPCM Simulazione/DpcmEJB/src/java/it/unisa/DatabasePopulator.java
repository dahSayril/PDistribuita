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

@Singleton
@Startup
@DataSourceDefinition(
        className = "org.apache.derby.jdbc.EmbeddedDataSource",
        name = "java:global/jdbc/EsameDS",
        user = "app",
        password = "aap",
        databaseName = "EsameDB",
        properties = {"connectionAttributes=;create=true"}
)
public class DatabasePopulator {
    
    @Inject
    private DpcmEJB ejb;
    private Dpcm dpcm1, dpcm2, dpcm3;
    
    @PostConstruct
    private void populateDB() {
        dpcm1 = new Dpcm("Decreto CoronaVirus", "Covid", "Sanitaria", "1", 12);
        dpcm2 = new Dpcm("E' arrivata la fine del mondo", "Diluvio", 
        "Fine del mondo", "1", 1);
        dpcm3 = new Dpcm("La Pesta Nera è qui", "Peste", "Sanitaria", "2", 8);
        ejb.createDpcm(dpcm1);
        ejb.createDpcm(dpcm2);
        ejb.createDpcm(dpcm3);        
    }
    
    @PreDestroy
    private void clearDB() {
        ejb.deleteDpcm(dpcm1);
        ejb.deleteDpcm(dpcm2);
        ejb.deleteDpcm(dpcm3);
    }
    
}
