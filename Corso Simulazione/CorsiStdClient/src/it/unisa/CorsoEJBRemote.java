package it.unisa;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface CorsoEJBRemote {

    void creaCorso(CorsoEntity c);
    CorsoEntity aggiornaCorso(CorsoEntity c);
    void rimuoviCorso(CorsoEntity c);
    CorsoEntity ottieniCorso(int id);
    List <CorsoEntity> ottieniCorsi();
    List <CorsoEntity> ottieniCorsiPerCategoria(Categoria c);
    List <CorsoEntity> ottieniCorsiConMinimoStudenti(int numStudenti);
    
}
