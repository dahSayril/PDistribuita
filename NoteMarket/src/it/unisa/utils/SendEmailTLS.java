package it.unisa.utils;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class SendEmailTLS {
    
    public static void sendMail(String mailTo, String mailSubject,
                          String mailText) throws Exception {
    	Properties config = createConfiguration();
        Session session = Session.getInstance(config, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(SendEmailTLS.USERNAME, SendEmailTLS.PASSWORD); }
        });

        Message message = new MimeMessage(session);
        message.setSentDate(new Date());
        message.setFrom(new InternetAddress(SendEmailTLS.USERNAME));
        message.setRecipient(Message.RecipientType.TO,
            new InternetAddress(mailTo));
        message.setSubject(mailSubject);
        message.setText(mailText);
                
        Transport.send(message, SendEmailTLS.USERNAME, SendEmailTLS.PASSWORD);
    }

    private static Properties createConfiguration() {
        return new Properties() {
					{
						put("mail.smtp.auth", "true");
						put("mail.smtp.host", "smtp.gmail.com");
						put("mail.smtp.port", "587");
						put("mail.smtp.starttls.enable", "true");
					}
					private static final long serialVersionUID = 1L;
        };
    }
    
    public static final String USERNAME = "notemarket.info@gmail.com";
    private static final String PASSWORD = "ProgettoTSW2020!";

}