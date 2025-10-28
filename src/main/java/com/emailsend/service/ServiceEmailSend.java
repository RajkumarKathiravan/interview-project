package com.emailsend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.emailsend.dao.DaoEmailSend;
import com.emailsend.entity.EmailSend;
import com.emailsend.exception.EmailAlreadyExistsException;
import com.emailsend.exception.UserNameAlreadyExistsException;
import com.emailsend.repository.RepositoryEmailSend;

@Service
public class ServiceEmailSend {
@Autowired
RepositoryEmailSend er;
@Autowired
JavaMailSender mailSender;
@Autowired
DaoEmailSend ed;

public EmailSend sendemail(EmailSend e) throws UserNameAlreadyExistsException, EmailAlreadyExistsException {
	if(er.existsByUsername(e.getUsername())) {
		throw new UserNameAlreadyExistsException("UserName Already Exists: "+e.getUsername());
	}
	if(er.existsByEmail(e.getEmail())) {
		throw new EmailAlreadyExistsException("Email Already Exists: "+e.getEmail());
	}

		SimpleMailMessage mail= new SimpleMailMessage();
		mail.setFrom(e.getSender());
		mail.setTo(e.getReceipient());
		mail.setSubject(e.getSubject());
		mail.setText(e.getBody());
		mailSender.send(mail);
	
	return er.save(e);
	
}
}
