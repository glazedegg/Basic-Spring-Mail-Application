package com.maildemo.springmaildemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSender {
    @Autowired
    private JavaMailSender mailSender;

    public void sendEmail(String emailAddress, String subject, String body) {

        SimpleMailMessage message = new SimpleMailMessage ();
        message.setFrom(<email address>);
        message.setTo(emailAddress);
        message.setSubject(subject);
        message.setText(body);
        mailSender.send(message);

        // Print if sending mail was succesful
        System.out.println("Mail sent");
    }
}
