package it.unisa;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface CircoloEJBRemote {

    void creaCircolo(CircoloEntity c);
    
    CircoloEntity aggiornaCircolo(CircoloEntity c);
    
    void eliminaCircolo(CircoloEntity c);
    
    CircoloEntity ottieniCircolo(long id);
    
    List <CircoloEntity> ottieniCircoli();
        
    List <CircoloEntity> ottieniPerRegione(String regione);
    
    List <CircoloEntity> ottieniPerProvincia(String provincia);
        
}
