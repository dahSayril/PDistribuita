package it.unisa;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface VentilatoreEJBRemote {
    
    void createVentilatore(VentilatoreEntity v);
    
    VentilatoreEntity updateVentilatore(VentilatoreEntity v);
    
    void deleteVentilatore(VentilatoreEntity v);
    
    VentilatoreEntity getVentilatore(long id);
    
    List <VentilatoreEntity> printAll();
    
    List <VentilatoreEntity> printByCountry(String country);
    
    List <VentilatoreEntity> printQuickFan();
    
}
