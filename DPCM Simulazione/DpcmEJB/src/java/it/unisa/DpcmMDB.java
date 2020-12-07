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
public class DpcmMDB implements MessageListener {

    @Inject
    private DpcmEJB ejb;
    
    @Inject
    Event <Dpcm> event;
    
    @Override
    public void onMessage(Message message) {
        try {
            long id = message.getLongProperty("id");
            int numPres = message.getBody(Integer.class);
            Dpcm tmp = ejb.ottieniDpcm(id);
            tmp.setNumPres(tmp.getNumPres() + numPres);
            tmp = ejb.updateDpcm(tmp);
            event.fire(tmp);            
        } catch (JMSException ex) {
            Logger.getLogger(DpcmMDB.class.getName()).log(Level.SEVERE, null, ex);
        }
              
    }
    
}
