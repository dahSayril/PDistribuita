package it.unisa;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.persistence.EntityManager;

@Stateless
@LocalBean
@Counter
@WebService
public class CircoloEJB implements CircoloEJBRemote {

    @Inject
    private EntityManager em;

    @Override
    public void creaCircolo(CircoloEntity c) {
        em.persist(c);
    }

    @Override
    public CircoloEntity aggiornaCircolo(CircoloEntity c) {
        return em.merge(c);
    }

    @Override
    public void eliminaCircolo(CircoloEntity c) {
        em.remove(em.merge(c));
    }

    @Override
    public CircoloEntity ottieniCircolo(long id) {
        return em.createNamedQuery(CircoloEntity.TROVA_PER_ID, CircoloEntity.class)
                .setParameter(1, id)
                .getSingleResult();
    }

    @Override
    public List<CircoloEntity> ottieniCircoli() {
        return em.createNamedQuery(CircoloEntity.TROVA_TUTTI, CircoloEntity.class)
                .getResultList();
    }

    @Override
    public List<CircoloEntity> ottieniPerRegione(String regione) {
        return em.createNamedQuery(CircoloEntity.TROVA_PER_REGIONE, CircoloEntity.class)
                .setParameter(1, regione)
                .getResultList();
    }

    @Override
    public List<CircoloEntity> ottieniPerProvincia(String provincia) {
        return em.createQuery("SELECT c FROM Circolo c WHERE c.provincia = ?1",
                CircoloEntity.class)
                .setParameter(1, provincia)
                .getResultList();
    }
    
}
