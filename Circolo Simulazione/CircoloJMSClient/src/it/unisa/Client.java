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
        ConnectionFactory connectionFactory = (ConnectionFactory)
                ctx.lookup("jms/javaee7/ConnectionFactory");
        
        Destination topic = (Destination)
                ctx.lookup("jms/javaee7/Topic");
        
        long id;
        String nomeCircolo, responsabile;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Inserisci l'id del circolo da modificare...");
        id = Long.parseLong(in.nextLine());
        System.out.println("Inserisci il nuovo nome del circolo...");
        nomeCircolo = in.nextLine();
        System.out.println("Insersci il nuovo responsabile...");
        responsabile = in.nextLine();
        
        UpdateDTO update = new UpdateDTO(
            id, nomeCircolo, responsabile);
        
        try (JMSContext jmsContext = connectionFactory.createContext()) {
            jmsContext.createProducer()
                    .setProperty("id", id)
                    .send(topic, update);
        }
        
    }
    
}
