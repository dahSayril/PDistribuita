/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author CORSO_PD
 */
public class Client {
    
    public static void main(String[] args) throws NamingException {
        
        Context ctx = new InitialContext();
        TaskEJBRemote ejb = (TaskEJBRemote)
                ctx.lookup("java:global/Task/TaskEJB!it.unisa.TaskEJBRemote");
        
        System.out.println("Tutti i task...");
        for(TaskEntity t : ejb.getAllTasks())
            System.out.println("### " + t);
        
        System.out.println("Tutti i task non assegnati...");
        for(TaskEntity t : ejb.getNotAssigned())
            System.out.println("### " + t);     
        
    }
        
}
