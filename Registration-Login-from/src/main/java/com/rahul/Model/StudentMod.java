package com.rahul.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentMod {

	@Id @GeneratedValue(strategy= GenerationType.AUTO)
	private Long userid;
	private String firstname;
	private String lastname;
	private String username;
	private int password;
}
