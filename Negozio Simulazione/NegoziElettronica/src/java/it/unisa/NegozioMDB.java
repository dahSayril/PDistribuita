package it.unisa;

import javax.ejb.MessageDriven;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(mappedName = "jms/javaee7/Topic")
public class NegozioMDB implements MessageListener {
    
    @Inject
    private NegozioEJB ejb;
    
    @Inject @Update
    private Event <NegozioEntity> e;
    
    @Override
    public void onMessage(Message message) {
        
        try {
            
            int id = message.getIntProperty("id");
            int venditeDaAggiungere = message.getBody(Integer.class);
            NegozioEntity n = ejb.getNegozio(id); 
            n.setVenditeAnnoCorrente(n.getVenditeAnnoCorrente() + 
                venditeDaAggiungere);
            ejb.updateNegozio(n);
            e.fire(n);
            
        } catch (JMSException e) {
            e.printStackTrace();
        }
    }
    
}
