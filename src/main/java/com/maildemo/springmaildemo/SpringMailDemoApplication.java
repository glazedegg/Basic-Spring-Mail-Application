package com.maildemo.springmaildemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringMailDemoApplication {
    @Autowired
    private EmailSender senderService;

    public static void main(String[] args) {
        SpringApplication.run(SpringMailDemoApplication.class, args);
    }
    @EventListener(ApplicationReadyEvent.class)
        public void sendMail() {
            senderService.sendEmail("tigermcyt@gmail.com", "Test Email", "Hello this is a test email");
        }



}
