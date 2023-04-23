package com.example.JavaEmailSender2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class JavaEmailSender2Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaEmailSender2Application.class, args);
	}


	@Autowired
	private EmailSenderService emailSenderService;


	public void sendEmail(){

		emailSenderService.


	}

}