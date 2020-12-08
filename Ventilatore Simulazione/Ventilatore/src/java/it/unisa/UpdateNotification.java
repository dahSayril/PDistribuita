package it.unisa;

import javax.enterprise.event.Observes;

public class UpdateNotification {
    
    public void updateElementiVenduti(@Observes @UpdateElementiVenduti
       VentilatoreEntity v) {
        
        System.out.println("Numero di elementi venduti per il ventilatore: " 
                + v.getId() + " aggiornati. Stato: " + v.getElemVenduti());
        
    }
    
    public void updateNumeroGiri(@Observes @UpdateNumeroGiri
       VentilatoreEntity v) {
        
        System.out.println("Numero di giri al minuto per il ventilatore: " 
                + v.getId() + " aggiornati. Stato: " + v.getGiriMinuto());
        
    }
    
}
