/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa;

import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author CORSO_PD
 */
@Remote
public interface TaskEJBRemote {
    
    void createTask(TaskEntity t);
    TaskEntity updateTask(TaskEntity t);
    void removeTask(TaskEntity t);
    TaskEntity getTask(int id);
    List <TaskEntity> getAllTasks();
    List <TaskEntity> getByTipe(Tipo tipe);
    List <TaskEntity> getByHoursWork(int hours);
    List <TaskEntity> getByAssignee(String assignee);
    List <TaskEntity> getByMinHoursWork(int hours);
    List <TaskEntity> getNotComplete();
    List <TaskEntity> getNotAssigned();
    List <TaskEntity> getStarted();
    
}
