package it.unisa;

import javax.ejb.MessageDriven;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(mappedName = "jms/javaee7/Topic")
public class CorsoMDB implements MessageListener {    

    @Inject
    private CorsoEJB ejb;
    
    @Inject @Update
    private Event <CorsoEntity> update;
    
    @Inject @Error
    private Event <CorsoEntity> error;
    
    @Override
    public void onMessage(Message message) {
        try {
            int id = message.getIntProperty("id");
            Categoria c = message.getBody(Categoria.class);
            CorsoEntity tmp = ejb.ottieniCorso(id);
            if(c == Categoria.BLENDED) {
                if(tmp.getNumStudenti() >= 150) {
                    error.fire(tmp);
                    return ;
                }
            }
            tmp.setCategoria(c);
            ejb.aggiornaCorso(tmp);
            update.fire(tmp);
        } catch (JMSException e) {
            e.printStackTrace();
        }
            
    }    
    
}
