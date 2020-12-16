/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@Stateless
@LocalBean
public class CorsoEJB implements CorsoEJBRemote {

    @Inject
    private EntityManager em;
    
    @Override
    public void creaCorso(CorsoEntity c) {
        em.persist(c);
    }

    @Override
    public CorsoEntity aggiornaCorso(CorsoEntity c) {
        return em.merge(c);
    }

    @Override
    public void rimuoviCorso(CorsoEntity c) {
        em.remove(em.merge(c));
    }

    @Override
    public CorsoEntity ottieniCorso(int id) {
        return em.createNamedQuery(CorsoEntity.TROVA_PER_ID, CorsoEntity.class)
                .setParameter(1, id)
                .getSingleResult();
    }

    @Override
    public List <CorsoEntity> ottieniCorsi() {
        return em.createNamedQuery(CorsoEntity.TROVA_TUTTI, CorsoEntity.class)
                .getResultList();
    }

    @Override
    public List <CorsoEntity> ottieniCorsiPerCategoria(Categoria c) {
        return em.createNamedQuery(CorsoEntity.TROVA_PER_CATEGORIA, CorsoEntity.class)
                .setParameter(1, c)
                .getResultList();
    }

    @Override
    public List <CorsoEntity> ottieniCorsiConMinimoStudenti(int numStudenti) {
        return em.createQuery("SELECT c FROM Corso c WHERE c.numStudenti > ?1",
                CorsoEntity.class).setParameter(1, numStudenti)
                .getResultList();
    }
    
}
