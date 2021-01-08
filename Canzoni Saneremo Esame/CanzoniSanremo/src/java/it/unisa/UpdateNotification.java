package it.unisa;

import javax.enterprise.event.Observes;

public class UpdateNotification {
    
    public void notifyUpdate(@Observes @UpdateSong CanzoneEntity c) {
        System.out.println("La canzone: " + c.getNomePezzo() + " è stata cantata");
    }
    
    public void whereIsBugo(@Observes @MorganBugo CanzoneEntity c) {
        System.out.println("Dove è andata Bugo?");
    }
    
}
