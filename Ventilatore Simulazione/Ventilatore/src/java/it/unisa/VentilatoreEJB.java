package it.unisa;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
import javax.jws.WebService;
import javax.persistence.EntityManager;

@Stateless
@LocalBean
@Interceptors(CounterInterceptor.class)
@WebService
public class VentilatoreEJB implements VentilatoreEJBRemote {

    @Inject
    private EntityManager em;
    
    @Inject @UpdateNumeroGiri
    Event <VentilatoreEntity> event; 
    
    @Override
    public void createVentilatore(VentilatoreEntity v) {
        em.persist(v);
    }

    @Override
    public VentilatoreEntity updateVentilatore(VentilatoreEntity v) {
        return em.merge(v);
    }

    @Override
    public void deleteVentilatore(VentilatoreEntity v) {
        em.remove(em.merge(v));
    }
    
    @Override
    public VentilatoreEntity getVentilatore(long id) {
        return em.createNamedQuery(VentilatoreEntity.FIND_BY_ID,
                VentilatoreEntity.class).setParameter(1, id)
                .getSingleResult();
    }

    @Override
    public List <VentilatoreEntity> printAll() {
        return em.createNamedQuery(VentilatoreEntity.FIND_ALL,
                VentilatoreEntity.class).getResultList();
    }

    @Override
    public List<VentilatoreEntity> printByCountry(String country) {
        return em.createNamedQuery(VentilatoreEntity.FIND_BY_COUNTRY,
                VentilatoreEntity.class).setParameter(1, country)
                .getResultList();
    }

    @Override
    public List <VentilatoreEntity> printQuickFan() {
        return em.createQuery("SELECT v FROM Ventilatore "
                + "WHERE v.giri_al_minuto = 2000")
                .getResultList();
    }
    
    public void setGiriAlMinuto(long id, int giriMinuto) {
        VentilatoreEntity tmp = this.getVentilatore(id);
        tmp.setGiriMinuto(giriMinuto);
        event.fire(tmp);
    }
}
