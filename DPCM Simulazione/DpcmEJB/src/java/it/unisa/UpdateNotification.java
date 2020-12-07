package it.unisa;

import javax.enterprise.event.Observes;

public class UpdateNotification {
        
    public void notify(@Observes Dpcm tmp) {
        System.out.println(tmp.getId() + " has been updated. NumPres: " + tmp.getNumPres());
    }
    
}
