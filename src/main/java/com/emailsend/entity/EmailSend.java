package com.emailsend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="emailsend")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmailSend {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)

	private int id;
	private String username;
	private String email;
	private String sender;
	private String receipient;
	private String subject;
	private String body;
	
}
