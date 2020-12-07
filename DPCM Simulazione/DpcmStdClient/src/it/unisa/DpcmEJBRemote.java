package it.unisa;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface DpcmEJBRemote {
    
    void createDpcm(Dpcm d);
    Dpcm updateDpcm(Dpcm d);
    void deleteDpcm(Dpcm d);
    Dpcm ottieniDpcm(long id);
    List <Dpcm> ottieniDpcm();
    List <Dpcm> ottieniDpcmDataEmergenza(String emergenza);
    List <Dpcm> ottieniDpcmDataTipologia(String tipo);
    List <Dpcm> ottieniDpcmDatoMinimoNumPres(int numPres);
    
}
