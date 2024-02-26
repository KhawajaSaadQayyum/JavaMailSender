package com.codeBySaad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SendingMailApplication {
	@Autowired
   private MailSenderService senderService;
	public static void main(String[] args) {
		SpringApplication.run(SendingMailApplication.class, args);
		System.out.println("This Is simple Mail Sender Code USing Spring boot");
	}
	@EventListener(ApplicationEvent.class)
	public void sendMail(){
		senderService.sendEmail("saadqayyum4110@gmail.com",
				"Hello this is Mail testing",
				"How are you im am practicing this email sender services for my searching for job");
	}

}
