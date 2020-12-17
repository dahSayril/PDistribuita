package it.unisa;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.persistence.EntityManager;

@Stateless
@LocalBean
@WebService
public class NegozioEJB implements NegozioEJBRemote {

    @Inject
    private EntityManager em;
    
    @Override
    public void createNegozio(NegozioEntity n) {
        em.persist(n);
    }

    @Override
    public NegozioEntity updateNegozio(NegozioEntity n) {
        return em.merge(n);
    }

    @Override
    public void removeNegozio(NegozioEntity n) {
        em.remove(em.merge(n));
    }

    @Override
    public NegozioEntity getNegozio(int id) {
        return em.createNamedQuery(NegozioEntity.TROVA_PER_ID,
                NegozioEntity.class)
                .setParameter(1, id)
                .getSingleResult();
    }

    @Override
    public List <NegozioEntity> print() {
        return em.createNamedQuery(NegozioEntity.TROVA_TUTTI,
                NegozioEntity.class)
                .getResultList();
    }

    @Override
    @Counter
    public List <NegozioEntity> printByRegion(String region) {
        return em.createNamedQuery(NegozioEntity.TROVA_PER_REGIONE,
                NegozioEntity.class)
                .setParameter(1, region)
                .getResultList();
    }

    @Override
    public List <NegozioEntity> printActiveShops() {
        return em.createQuery("SELECT n FROM Negozio n "
                + "WHERE n.venditeAnnoPrecedente < n.venditeAnnoCorrente",
                NegozioEntity.class)
                .getResultList();
    }
    
}
