package it.unisa;

import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSContext;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Client {
    
    public static void main(String[] args) throws NamingException {
        
        Context ctx = new InitialContext();
        
        ConnectionFactory cf = (ConnectionFactory)
                ctx.lookup("jms/javaee7/ConnectionFactory");
        Destination topic = (Destination)
                ctx.lookup("jms/javaee7/Topic");
        
        int id = 3;
        String nome = "Morgan e Bugo";
        String incipit = "Le brutte intenzioni, la maleducazione, "
                            + "la tua brutta figura di ieri sera, la tua ingratitudine, "
                            + "la tua arroganza, fai ciò che vuoi mettendo i piedi in testa";

        MessageDTO dto = new MessageDTO(nome, incipit);
        
        try (JMSContext jmsCtx = cf.createContext()) {
            
            jmsCtx.createProducer()
                    .setProperty("id", id)
                    .send(topic, dto);
            
        }
        
    }
    
}
