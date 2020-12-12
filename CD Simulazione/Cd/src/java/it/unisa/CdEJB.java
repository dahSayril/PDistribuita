package it.unisa;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.persistence.EntityManager;

@Stateless
@WebService
@LocalBean
public class CdEJB implements CdEJBRemote {

    @Inject
    private EntityManager em;
    
    @Override
    public void creaCd(CdEntity cd) {
        em.persist(cd);
    }

    @Override
    public CdEntity aggiornaCd(CdEntity cd) {
        return em.merge(cd);
    }

    @Override
    public void eliminaCd(CdEntity cd) {
        em.remove(em.merge(cd));
    }

    @Override
    public CdEntity ottieniCd(String id) {
        return em.createNamedQuery(
            CdEntity.TROVA_PER_ID, CdEntity.class)
            .setParameter(1, id)
            .getSingleResult();
    }

    @Override
    public List<CdEntity> ottieniCds() {
        return em.createNamedQuery(
            CdEntity.TROVA_TUTTI, CdEntity.class)
            .getResultList();
    }
    
}
