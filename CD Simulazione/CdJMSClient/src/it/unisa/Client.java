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
        
        ConnectionFactory connectionFactory = 
                (ConnectionFactory) ctx.lookup("jms/javaee7/ConnectionFactory");
        
        Destination topic =
                (Destination) ctx.lookup("jms/javaee7/Topic");
        
        String id;
        Double price;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Inserisci l'id...");
        id = in.nextLine();
        System.out.println("Inserisci il nuovo prezzo...");
        price = Double.parseDouble(in.nextLine());
        
        try (JMSContext jmsContext = connectionFactory.createContext()) {
            
            jmsContext.createProducer()
                    .setProperty("id", id)
                    .send(topic, price);
            
        }
        
        
    }
    
}
