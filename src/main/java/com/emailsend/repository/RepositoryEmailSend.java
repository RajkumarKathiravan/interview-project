package com.emailsend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emailsend.entity.EmailSend;

public interface RepositoryEmailSend extends JpaRepository<EmailSend,Integer> {
	public boolean existsByUsername(String username);
	public boolean existsByEmail(String email);

}
