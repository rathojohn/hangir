package com.hangir.user;

public class ModUser extends User {
	public ModUser(String userName) {
		super(UserType.MOD, userName);
		construct();
	}


@Override
protected void construct() {
	System.out.println("Creating a mod user");
	//Add additional
}
}
