package com.zachs.bittrader.auth.providers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.zachs.bittrader.auth.AuthToken;

public class AuthFileProvider implements IAuthProvider {
	private final AuthToken authToken;
	
	public AuthFileProvider(String path) throws IOException {
		String input = new String(Files.readAllBytes(Paths.get(path)));
		authToken = new Gson().fromJson(input, AuthToken.class);
	}
	
	@Override
	public AuthToken getBasicToken() {
		// TODO Auto-generated method stub
		return authToken;
	}
	
	public void generateToken() {
		AuthToken auth = new AuthToken();
		
		auth.setAuthToken(new char[] { 'c' });
		auth.setMfaCode("mfaCode");
		auth.setMfaRequired(true);
		auth.setMfaType("sms");
		auth.setPassword(new char[] { 'i' });
		auth.setUsername(new char[] { 'f' });
	}

}
