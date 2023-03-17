package com.RestAPI.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;
@Component
public class EmailServiceImpl implements EmailService {

	
	@Autowired
	private JavaMailSender sendMali;
	@Override
	public void Emailsend(String To, String Subject, String Message) {
		SimpleMailMessage mail = new SimpleMailMessage();
		mail.setTo(To);
		mail.setSubject(Subject);
		mail.setText(Message);
		
		sendMali.send(mail);
		
		
	}

}
