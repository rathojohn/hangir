package com.hangir;

import hangir.facebook.SignInServlet;

import java.util.UUID;

import com.hangir.user.User;
import com.hangir.user.UserFactory;
import com.hangir.user.UserGroup;
import com.hangir.user.UserType;

public class Main {
	public static void main (String [] args) {
		UserGroup uGroup = new UserGroup();
		UUID idTest = UUID.randomUUID();
		User userTest = UserFactory.createUser(UserType.ADMIN, "Steve Jobs");
		uGroup.add(userTest);
		System.out.println(userTest.getUniqueID());
		
		
		//Testing Facebook
		//SignInServlet.doGet(null, null);
		
	}
	
	
}
