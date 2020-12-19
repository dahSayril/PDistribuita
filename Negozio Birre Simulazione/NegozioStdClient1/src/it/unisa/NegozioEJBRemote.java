package it.unisa;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface NegozioEJBRemote {
    
    void createNegozio(NegozioEntity n);
    void removeNegozio(NegozioEntity n);
    NegozioEntity updateNegozio(NegozioEntity n);
    NegozioEntity getNegozio(int id);
    List <NegozioEntity> print();
    List <NegozioEntity> printByRegion(String region);
    List <NegozioEntity> printDrunkPeopleShops();
    void updateDirettore(int id, String direttore);
    
}
