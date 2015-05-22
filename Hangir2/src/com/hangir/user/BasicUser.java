package com.hangir.user;


public class BasicUser extends User {
	BasicUser(String userName) {
		super(UserType.BASIC, userName);
		construct();
	}
	
	@Override
	protected void construct() {
		System.out.println("Creating a basic user");
		//Add additional
	}
}
