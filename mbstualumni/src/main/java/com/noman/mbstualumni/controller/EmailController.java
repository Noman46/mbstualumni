package com.noman.mbstualumni.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class EmailController {

	static String sendMailTo = "nomanibrahim7@gmail.com";
	static String emailSubject = "Test mail";
	static String emailMessage = "Success";
	
	@Autowired
    public JavaMailSender mailSender;
	
	 @RequestMapping(value = { "/sendmail" })
	    public String doSendEmail() {
	       
	         
	       
	        // creates a simple e-mail object
	        SimpleMailMessage email = new SimpleMailMessage();
	        email.setTo(sendMailTo);
	        email.setSubject(emailSubject);
	        email.setText(emailMessage);
	         
	        // sends the e-mail
	        mailSender.send(email);
	         
	        // forwards to the view named "Result"
	        return "";
	    }
  
}
