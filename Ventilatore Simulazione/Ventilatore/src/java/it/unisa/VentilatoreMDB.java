package it.unisa;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.MessageDriven;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(mappedName = "jms/javaee7/Topic")
public class VentilatoreMDB implements MessageListener {

    @Inject
    private VentilatoreEJB ejb;
    
    @Inject @UpdateElementiVenduti
    private Event <VentilatoreEntity> event;
    
    @Override
    public void onMessage(Message message) {
        long id;
        int elemVenduti;
        try {
            id = message.getLongProperty("id");
            elemVenduti = message.getBody(Integer.class);
            VentilatoreEntity tmp = ejb.getVentilatore(id);
            tmp.setElemVenduti(tmp.getElemVenduti() + elemVenduti);
            event.fire(tmp);
        } catch (JMSException ex) {
            Logger.getLogger(VentilatoreMDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}