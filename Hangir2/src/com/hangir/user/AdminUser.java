package com.hangir.user;


public class AdminUser extends User {
	public AdminUser(String userName) {
	super(UserType.ADMIN, userName);
	construct();
}

@Override
protected void construct() {
	System.out.println("Creating an admin user");
	//Add additional
}
}
