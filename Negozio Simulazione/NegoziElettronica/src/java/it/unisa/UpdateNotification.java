package it.unisa;

import javax.enterprise.event.Observes;

public class UpdateNotification {

    public void notifyUpdate(@Observes @Update NegozioEntity n) {
        System.out.println("Quantità di vendite del negozio: " + n.getId() + 
                "aggiornate. Quantità attuale: " + n.getVenditeAnnoCorrente());
    }
    
}
