package com.example.EmailSender;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller 
{
@Autowired
private sendermodel model;
@RequestMapping("/send-mail")
public void sendmail() throws MessagingException {
	
	
	model.send("mithunsbogali@gmail.com", "i m looking for u", "rocky");
}
	

}
