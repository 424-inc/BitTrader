package com.zachs.bittrader.http;

import com.zachs.bittrader.auth.AuthHandler;

public abstract class AuthHttpClient extends HttpClient {
	protected AuthHandler authHandler;
	
	public AuthHttpClient(String tokenUrl) {
		super(tokenUrl);
		authHandler = AuthHandler.getInstance();
	}
}
