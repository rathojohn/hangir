package com.hangir.user;

import java.util.UUID;

public class UserFactory {
	public static User createUser(UserType userType, String userName) {
		User user = null;
		switch (userType) {
			case BASIC:
				user = new BasicUser(userName);
				break;
			case POWER:
				user = new PowerUser(userName);
				break;
			case MOD:
				user = new ModUser(userName);
				break;
			case ADMIN:
				user = new AdminUser(userName);
				break;
			default:
				break;
				//Add some exception here
		}
		return user;
	}
}
