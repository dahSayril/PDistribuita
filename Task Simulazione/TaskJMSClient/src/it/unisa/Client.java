/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa;

import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
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
        ConnectionFactory cF = (ConnectionFactory)
                ctx.lookup("jms/javaee7/ConnectionFactory");
        Destination topic = (Destination)
                ctx.lookup("jms/javaee7/Topic");
        
        TaskEntity t1 = new TaskEntity("Consegnare progetto", Tipo.AMMINISTRAZIONE,
            12, "Antonio", 10);
        
        TaskEntity t2 = new TaskEntity("Consegnare proposta nuova progetto", 
            Tipo.AMMINISTRAZIONE, 7, "Antonio", -12);
        
        TaskEntity t3 = new TaskEntity("Pagare gli stipendi", Tipo.AMMINISTRAZIONE,
                1, "Antonio", 0);
        
        try (JMSContext jmsContext = cF.createContext()) {
            
            jmsContext.createProducer()
                    .send(topic, t1);
            
            jmsContext.createProducer()
                    .send(topic, t2);
            
            jmsContext.createProducer()
                    .send(topic, t3);
            
        }
        
    }    
    
}
