package it.unisa;

import javax.enterprise.event.Observes;

public class UpdateNotification {
    
    public void logUpdate(@Observes CircoloEntity tmp) {
        System.out.println("Circolo: " + tmp.getId() + " è stato aggionrato."
                + " Stato: " + tmp);
    }
    
}
