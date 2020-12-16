package it.unisa;

import javax.enterprise.event.Observes;

public class Notification {
 
    public void notifyUpdate(@Observes @Update CorsoEntity tmp) {
        System.out.println("Categoria aggioranta");
    }
    
    public void notifyError(@Observes @Error CorsoEntity tmp) {
        System.out.println("Modalità blended non cambiata per il corso " + 
                tmp.getNomeCorso() + " a causa della numerosità");
    }
    
}
