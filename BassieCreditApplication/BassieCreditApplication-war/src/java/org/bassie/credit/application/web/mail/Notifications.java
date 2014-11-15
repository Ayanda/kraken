/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.bassie.credit.application.web.mail;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import org.bassie.credit.application.web.bean.Application;

/**
 *
 * @author Ayanda
 */
public class Notifications {
    
    public Notifications(){}
    
    public void generateNotification(Application application){
        try {
            String subject = application.getCustomer().getFirstName() + " " + application.getCustomer().getFirstName() + " - " +
                    application.getCustomer().getClientAccountNumber();
            String body = "<b>Congratualions,</b><br><p>Your loan application for "+ application.getAmount() +" has be approved</p><br/></br> Regards<br>Bassie Credits.";
            sendMail(application.getCustomer().getEmailAddress(), subject, body);
        } catch (NamingException | MessagingException ex ) {
            Logger.getLogger(Notifications.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private Session getBassieMail() throws NamingException {
        Context c = new InitialContext();
        return (Session) c.lookup("java:comp/env/bassieMail");
    }

    private void sendMail(String email, String subject, String body) throws NamingException, MessagingException {
        Session bassieMail = getBassieMail();
        MimeMessage message = new MimeMessage(bassieMail);
        message.setSubject(subject);
        message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email, false));
        message.setText(body);
        Transport.send(message);
    }
}
