package com.emailsend.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.emailsend.entity.EmailSend;
import com.emailsend.repository.RepositoryEmailSend;

@Repository
public class DaoEmailSend {
@Autowired
RepositoryEmailSend er;

public EmailSend sendemail(EmailSend e) {
	return er.save(e);
}
}
