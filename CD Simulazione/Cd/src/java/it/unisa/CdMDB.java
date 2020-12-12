package it.unisa;

import javax.ejb.MessageDriven;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(mappedName = "jms/javaee7/Topic")
public class CdMDB implements MessageListener {
    
    @Inject
    private CdEJB ejb;
    
    @Override
    public void onMessage(Message message) {
        
        try {
            
            String id = message.getStringProperty("id");
            double price = message.getBody(Double.class);
            CdEntity cd = ejb.ottieniCd(id);
            cd.setPrezzo(price);
            ejb.aggiornaCd(cd);
            
        } catch (JMSException e) {
            e.printStackTrace();
        }
        
    }
    
}
