package com.zachs.bittrader;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zachs.bittrader.auth.AuthHandler;
import com.zachs.bittrader.auth.AuthToken;
import com.zachs.bittrader.auth.providers.AuthFileProvider;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class RobinhoodApi {
	public static void main(String[] args) {	
		AuthHandler authHandler = AuthHandler.getInstance();
		try {
			authHandler.setAuthProvider(new AuthFileProvider("./._authtoken"));
			authHandler.login();
			System.out.println("AuthToken: " + authHandler.getAuthToken().toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
