package com.hangir.user;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class UserGroup {

		public UserGroup () {
			userList = new HashMap();
		}
		
		HashMap <User, UUID>userList = null;		
		
		//
		public void add (User user) {
			userList.put(user, user.getUniqueID());
			System.out.println("Added "+user.getUserName()+".");
		}
}
