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
                (ConnectionFactory) ctx.lookup(
                "jms/javaee7/ConnectionFactory");
        
        Destination topic =
                (Destination) ctx.lookup("jms/javaee7/Topic");
        
        long id;
        int elemVenduti;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Inserisci l'id del ventilatore da modificare...");
        id = in.nextLong();
        System.out.println("Inserisci il numero di elementi venduti da aggiungere...");
        elemVenduti = in.nextInt();
        
        try (JMSContext jmsContext = connectionFactory.createContext()) {
            jmsContext.createProducer()
                    .setProperty("id", id)
                    .send(topic, elemVenduti);
                    
        }
        
    }
    
}
