package com.zachs.bittrader.http;

import java.io.IOException;

import com.zachs.bittrader.schemes.SchemeElement;

import kong.unirest.Unirest;

public abstract class HttpClient {
	private UnirestClient unirestClient;
	private TokenFactory tokenFactory;
	protected Token token;
	
	public HttpClient(String tokenUrl) {
		unirestClient = UnirestClient.getInstance();
		tokenFactory = TokenFactory.getInstance();
		
		try {
			token = tokenFactory.getTokenFromFile(tokenUrl);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public <T extends SchemeElement> T execute(Class<? extends T> type) {		
		return Unirest.get(token.url)
                      .routeParam(token.routes)
                      .headers(token.headers)
                      .asObject(type)
                      .getBody();
	}
}
