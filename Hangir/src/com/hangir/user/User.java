package com.hangir.user;

import java.util.UUID;

public abstract class User {
	
	public User(UserType user, String userName) {
		this.user = user;
		this.userName = userName;
		this.uniqueID = UUID.randomUUID();
	}
	
	//Do subclass level processing in this method
	protected abstract void construct();
	
	private UserType user= null;
	protected static String userName = null;
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public UUID getUniqueID() {
		return uniqueID;
	}

	public void setUniqueID(UUID uniqueID) {
		this.uniqueID = uniqueID;
	}

	protected static UUID uniqueID = null;
	
	public UserType getUsertype() {
		return user;
	}
	
	public void setUserType(UserType userType) {
		this.user = userType;
	}
	
	
}
