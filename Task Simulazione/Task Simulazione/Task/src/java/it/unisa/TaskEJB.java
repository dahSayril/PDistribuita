/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.inject.Inject;
import javax.jws.WebService;
import javax.persistence.EntityManager;

/**
 *
 * @author CORSO_PD
 */
@Stateless
@LocalBean
@WebService
public class TaskEJB implements TaskEJBRemote {

    @Inject
    private EntityManager em;
    
    @Override
    public void createTask(TaskEntity t) {
        em.persist(t);
    }

    @Override
    public TaskEntity updateTask(TaskEntity t) {
        return em.merge(t);
    }

    @Override
    public void removeTask(TaskEntity t) {
        em.remove(em.merge(t));
    }
    
    @Override
    public TaskEntity getTask(int id) {
        return em.createNamedQuery(TaskEntity.TROVA_PER_ID, TaskEntity.class)
                .setParameter(1, id)
                .getSingleResult();
    }

    @Override
    @Counter
    public List <TaskEntity> getAllTasks() {
        return em.createNamedQuery(TaskEntity.TROVA_TUTTI, TaskEntity.class)
                .getResultList();
    }

    @Override
    public List <TaskEntity> getByTipe(Tipo tipe) {
        return em.createNamedQuery(TaskEntity.TROVA_PER_TIPO, TaskEntity.class)
                .setParameter(1, tipe)
                .getResultList();
    }

    @Override
    public List <TaskEntity> getByHoursWork(int hours) {
        return em.createNamedQuery(TaskEntity.TROVA_PER_ORE_LAVORO, TaskEntity.class)
                .setParameter(1, hours)
                .getResultList();
    }

    @Override
    public List <TaskEntity> getByAssignee(String assignee) {
        return em.createNamedQuery(TaskEntity.TROVA_PER_ASSEGNATARIO, TaskEntity.class)
                .setParameter(1, assignee)
                .getResultList();
    }

    @Override
    public List <TaskEntity> getByMinHoursWork(int hours) {
        return em.createNamedQuery(TaskEntity.TROVA_PER_ORE_MINIME_LAVORO, TaskEntity.class)
                .setParameter(1, hours)
                .getResultList();
    }

    @Override
    public List <TaskEntity> getNotComplete() {
        return em.createNamedQuery(TaskEntity.TROVA_NON_COMPLETATI, TaskEntity.class)
                .getResultList();
    }

    @Override
    public List <TaskEntity> getNotAssigned() {
        return em.createQuery("SELECT t FROM Task t WHERE t.assegnatario = ?1")
               .setParameter(1, "nessuno")
               .getResultList();
    }
    
    @Override
    public List <TaskEntity> getStarted() {
        return em.createQuery("SELECT t FROM Task t WHERE t.percentualeCompletamento > 0",
                TaskEntity.class)
                .getResultList();
    }
    
}
