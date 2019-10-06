package com.noman.alumnibackend.utility;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomCredentials {

	
	public String giveRandomUserName(String userName, String studentId) {
		
		 String[] name = userName.split("\\s+");
		 String[] id = studentId.split("-");
		 String newUserName = name[0]+id[0];
		 return newUserName;
	}
	
	public String giveRandomPassword() {
		
		Random random = new Random();
		String password = "";
		
		for(int i = 1; i<=5; i++) {
			
			password = password+random.nextInt(10);
		}
		
		return password;
	}
}
