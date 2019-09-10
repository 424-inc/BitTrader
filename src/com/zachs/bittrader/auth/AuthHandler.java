package com.zachs.bittrader.auth;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.zachs.bittrader.auth.providers.IAuthProvider;
import com.zachs.bittrader.http.Token;
import com.zachs.bittrader.http.TokenFactory;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class AuthHandler {
	private static AuthHandler instance = null;
	private IAuthProvider authProvider;
	private AuthToken authToken;
	
	private AuthHandler() {
	}
	
	public static AuthHandler getInstance() {
		if(instance == null)
			instance = new AuthHandler();
		return instance;
	}
	
	public void setAuthProvider(IAuthProvider authProvider) {
		this.authProvider = authProvider;
		refreshToken();
	}
	
	/**
	 * Refreshes the token after a new IAuthProvider
	 * has been assigned.
	 */
	public void refreshToken() {
		authToken = authProvider.getBasicToken();
	}
	
	public void login() {
		Token connection;
		String bodyString;
		
		try {
			connection = TokenFactory.getInstance().getTokenFromFile("./resources/tokens/auth/Login.token");
			//bodyString = "username=" + new String(authToken.getUsername()) + "&password=" + new String(authToken.getPassword());
			bodyString = "username=zach.smith&password=Adenosine_Triphosphate&grant_type=password";
			
			System.out.println(bodyString);
			
			HttpResponse<String> output = Unirest.post(connection.url)
					.body(bodyString)
					.asString();
			System.out.println(output.getStatus());
			
			char[] authKey = Unirest.post(connection.url)
			                          .body(bodyString)
			                          .asJson()
			                          .getBody()
			                          .getObject()
			                          .getString("token")
			                          .toCharArray();
			
			this.authToken.setAuthToken(authKey);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public char[] getAuthToken() {
		return authToken.getAuthToken();
	}
}