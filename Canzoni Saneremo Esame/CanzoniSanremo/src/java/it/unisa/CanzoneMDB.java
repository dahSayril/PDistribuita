package it.unisa;

import javax.ejb.MessageDriven;
import javax.enterprise.event.Event;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;

@MessageDriven(mappedName = "jms/javaee7/Topic")
public class CanzoneMDB implements MessageListener {
    
    @Inject
    private CanzoneEJB ejb;
    
    @Inject @UpdateSong
    private Event <CanzoneEntity> updateSong;
    
    @Inject @MorganBugo
    private Event <CanzoneEntity> morganBugo;
    
    @Override
    public void onMessage(Message message) {
       
        try {
            
            int id = message.getIntProperty("id");
            MessageDTO msg = message.getBody(MessageDTO.class);
            
            String nome = msg.getNome();
            String incipit = msg.getIncipit();
            
            CanzoneEntity c = ejb.ottieniDaId(id);
            
            if(nome.equals("Morgan e Bugo") &&
                    incipit.equals("Le brutte intenzioni, la maleducazione, "
                            + "la tua brutta figura di ieri sera, la tua ingratitudine, "
                            + "la tua arroganza, fai ciò che vuoi mettendo i piedi in testa")) {
                
                c.setCantanto(true);
                c.setNomePezzo("Morgan");
                updateSong.fire(c);
                morganBugo.fire(c);
            }
            
            else if(c.getIncipit().startsWith(incipit)) {
                c.setCantanto(true);
                updateSong.fire(c);
            
            }        
            
        } catch (JMSException e) {
            // GESTIRE L'ECCEZIONE
        }
        
    }
   
}