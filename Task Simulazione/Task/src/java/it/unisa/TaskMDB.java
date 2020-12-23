/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

/**
 *
 * @author CORSO_PD
 */
@MessageDriven(mappedName = "jms/javaee7/Topic")
public class TaskMDB implements MessageListener {

    @Inject
    private TaskEJB ejb;
    
    @Override
    public void onMessage(Message message) {
        try {
            TaskEntity t = message.getBody(TaskEntity.class);
            ejb.createTask(t);
        } catch (JMSException ex) {
            Logger.getLogger(TaskMDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
