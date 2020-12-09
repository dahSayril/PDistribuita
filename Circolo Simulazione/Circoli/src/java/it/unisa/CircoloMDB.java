package it.unisa;

import javax.ejb.MessageDriven;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(mappedName = "jms/javaee7/Topic")
public class CircoloMDB implements MessageListener {

    @Inject
    private CircoloEJB ejb;
    
    @Inject
    Event <CircoloEntity> event;
    
    @Override
    public void onMessage(Message message) {
       
        try {
            
            long id = message.getLongProperty("id");
            UpdateDTO dto = message.getBody(UpdateDTO.class);
            CircoloEntity tmp = ejb.ottieniCircolo(id);
            tmp.setNomeCircolo(dto.getNomeCircolo());
            tmp.setResponsabile(dto.getResponsabile());
            ejb.aggiornaCircolo(tmp);
            event.fire(tmp);
            
        } catch (JMSException e) {
            e.printStackTrace();
        }
        
    }
    
}
