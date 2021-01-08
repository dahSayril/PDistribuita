package it.unisa;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface CanzoneEJBRemote {
    
    void creaCanzone(CanzoneEntity c);
    CanzoneEntity aggiornaCanzone(CanzoneEntity c);
    void rimuoviCanzone(CanzoneEntity c);
    CanzoneEntity ottieniDaId(int id);
    List <CanzoneEntity> ottieniTutti();
    List <CanzoneEntity> ottieniDaCategoria(String categoria);
    List <CanzoneEntity> ottieniDaVotoMinimo(int voto);
    CanzoneEntity aggiornaVoti(int id, int voti);
    
}
