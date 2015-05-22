package hangir.facebook;

import facebook4j.Facebook;
import facebook4j.FacebookFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;

public class FBTools extends HttpServlet {
	Facebook facebook = null;
	
	public FBTools() {
		facebook = new FacebookFactory().getInstance();
		facebook.setOAuthAccessToken(facebook.getOAuthAccessToken());
	}
	
	
}
