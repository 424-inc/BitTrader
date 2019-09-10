package com.zachs.bittrader.http;

import kong.unirest.GsonObjectMapper;
import kong.unirest.Unirest;

class UnirestClient {
	private static UnirestClient _instance = null;
	
	protected static UnirestClient getInstance() {
		if(_instance == null)
			_instance = new UnirestClient();
		
		return _instance;
	}
	
	private UnirestClient() {
		Unirest.config().setObjectMapper(new GsonObjectMapper())
		       .setDefaultHeader("Accept", "application/json");
	}
}
