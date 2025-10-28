package com.emailsend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emailsend.entity.EmailSend;
import com.emailsend.exception.EmailAlreadyExistsException;
import com.emailsend.exception.UserNameAlreadyExistsException;
import com.emailsend.service.ServiceEmailSend;

@RestController
@RequestMapping(value="/emailsend/api")
public class ControllerEmailSend {
@Autowired
ServiceEmailSend es;

@PostMapping(value="/postemail")
public EmailSend sendemail(@RequestBody EmailSend e) throws UserNameAlreadyExistsException, EmailAlreadyExistsException {
	return es.sendemail(e);
}
}
