package it.unisa;

import java.util.Scanner;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Client {
    
    public static void main(String[] args) throws NamingException {
        
        Context ctx = new InitialContext();
        ConnectionFactory cF = (ConnectionFactory)
                ctx.lookup("jms/javaee7/ConnectionFactory");
        Destination topic = (Destination)
            ctx.lookup("jms/javaee7/Topic1");
            
        Scanner in = new Scanner(System.in);
        
        System.out.println("Inserisci l'id del negozio da modificare...");
        int id = Integer.parseInt(in.nextLine());
        System.out.println("Inserisci la quantità di birre da aggiungere...");
        int birreDaAggiungere = Integer.parseInt(in.nextLine());
        
        try (JMSContext jmsContext = cF.createContext()) {
            
            jmsContext.createProducer()
                    .setProperty("id", id)
                    .send(topic, birreDaAggiungere);
        
        }
        
    }
    
}