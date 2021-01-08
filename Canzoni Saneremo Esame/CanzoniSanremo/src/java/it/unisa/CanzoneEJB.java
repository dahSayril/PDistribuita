package it.unisa;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.persistence.EntityManager;

@Stateless
@LocalBean
@WebService
public class CanzoneEJB implements CanzoneEJBRemote {
    
    @Inject
    private EntityManager em;
    
    @Override
    public void creaCanzone(CanzoneEntity c) {
        em.persist(c);
    }
    
    @Override
    public CanzoneEntity aggiornaCanzone(CanzoneEntity c) {
        return em.merge(c);
    }
    
    @Override
    public void rimuoviCanzone(CanzoneEntity c) {
        em.remove(em.merge(c));
    }
    
    @Override
    public CanzoneEntity ottieniDaId(int id) {
        return em.createNamedQuery(
                CanzoneEntity.TROVA_PER_ID, CanzoneEntity.class)
                .setParameter(1, id)
                .getSingleResult();
    }
    
    @Override @CounterAndCheckParam
    public List <CanzoneEntity> ottieniTutti() {
        return em.createNamedQuery(
                CanzoneEntity.TROVA_TUTTI, CanzoneEntity.class)
                .getResultList();
    }
    
    @Override @CounterAndCheckParam
    public List <CanzoneEntity> ottieniDaCategoria(String categoria) {
        return em.createNamedQuery(
                CanzoneEntity.TROVA_PER_CATEGORIA, CanzoneEntity.class)
                .setParameter("categoria", categoria)
                .getResultList();
    }
    
    @Override @CounterAndCheckParam
    public List <CanzoneEntity> ottieniDaVotoMinimo(int voto) {
        return em.createQuery(
                "SELECT c FROM Canzone c WHERE c.votiRicevuti > ?1",
                CanzoneEntity.class)
                .setParameter(1, voto)
                .getResultList();
    }

    @Override
    @WebMethod(operationName = "updateVotes")
    @WebResult(name = "songUpdated")
    public CanzoneEntity aggiornaVoti(int id,
            @WebParam(name = "votes") int voti) {
        CanzoneEntity c = ottieniDaId(id);
        c.setVotiRicevuti(voti);
        return c;
    }
    
}
