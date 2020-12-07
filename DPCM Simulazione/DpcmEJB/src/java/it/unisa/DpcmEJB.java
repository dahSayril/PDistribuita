package it.unisa;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

@Stateless
@LocalBean
public class DpcmEJB implements DpcmEJBRemote {

    @Inject
    private EntityManager em;

    @Override
    public void createDpcm(Dpcm d) {
       em.persist(d);
    }

    @Override
    public Dpcm updateDpcm(Dpcm d) {
        return em.merge(d);
    }
        
    @Override
    public void deleteDpcm(Dpcm d) {
        em.remove(em.merge(d));
    }

    @Override
    public Dpcm ottieniDpcm(long dpcm) {
        return (Dpcm) em.createNamedQuery(Dpcm.FIND_BY_ID).
                setParameter(1, dpcm).getSingleResult();
    }
    
    @Override
    public List <Dpcm> ottieniDpcm() {
        TypedQuery <Dpcm> query = 
                em.createNamedQuery(Dpcm.FIND_ALL, Dpcm.class);
        return query.getResultList();
    }

    @Override
    public List <Dpcm> ottieniDpcmDataEmergenza(String emergenza) {
        TypedQuery <Dpcm> query = 
                em.createNamedQuery(Dpcm.FIND_BY_EMERGENCY, Dpcm.class)
                .setParameter(1, emergenza);
        return query.getResultList();
    }

    @Override
    public List <Dpcm> ottieniDpcmDatoMinimoNumPres(int numPres) {
        return em.createQuery("SELECT d FROM Dpcm d WHERE d.numPres > ?1", Dpcm.class)
                .setParameter(1, numPres).getResultList();
    }
    
    @Override
    public List <Dpcm> ottieniDpcmDataTipologia(String tipo) {
        return em.createQuery("SELECT d FROM Dpcm d WHERE d.tipo = ?1", Dpcm.class)
                .setParameter(1, tipo).getResultList();
    }
    
    
    
}
