package com.hangir.user;

public class PowerUser extends User {
	public PowerUser(String userName) {
		super(UserType.POWER, userName);
		construct();
}	

@Override
protected void construct() {
	System.out.println("Creating a power user");
	//Add additional
}
}
