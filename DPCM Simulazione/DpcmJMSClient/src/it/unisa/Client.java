package it.unisa;

import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.jms.JMSProducer;
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
        
        long id = 1;
        
        try (JMSContext jmsContext = connectionFactory.createContext()) {
            JMSProducer producer = jmsContext.createProducer()
                    .setProperty("id", id)
                    .send(topic, 2);          
        }
        
        
    }
    
}
