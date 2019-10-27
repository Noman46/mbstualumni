package com.noman.alumnibackend.utility;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;

import com.noman.alumnibackend.dto.ApplicationForm;

@Component
public class EmailSender {

	@Autowired
    public JavaMailSender mailSender;
	
	@Autowired
	RandomCredentials randomCredentials;
	
	public void doSendEmailToApplicant(ApplicationForm form) {
	       
        
	      
        // creates a simple e-mail object
		
        SimpleMailMessage email = new SimpleMailMessage();
        email.setTo(form.getStudentemail());
        email.setSubject("MBSTU_ALUMNI application result");
        email.setText("Hi"+" "+form.getStudentName()+". "+"Your Application for enrollment in MBSTU-ALUMNI has been granted. Please login using user Name:"
        		+ " "+randomCredentials.giveRandomUserName(form.getStudentName(), form.getVersityId())
        		+ " and Password:"+" "+randomCredentials.giveRandomPassword());
         
        // sends the e-mail
        mailSender.send(email);
         
      
    }
}
