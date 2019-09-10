package com.zachs.bittrader.http;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.zachs.bittrader.http.Token.RequestMethod;

public class TokenFactory {
	private static TokenFactory _instance = null;
	private Gson gson;
	
	private TokenFactory() {
		gson = new GsonBuilder().disableHtmlEscaping().setPrettyPrinting().create();
	}
	
	public static TokenFactory getInstance() {
		if(_instance == null)
			_instance = new TokenFactory();
		return _instance;
	}
	
	public Token getTokenFromFile(String path) throws IOException {
		String input = new String(Files.readAllBytes(Paths.get(path)));
		return gson.fromJson(input, Token.class);
	}
	
	private void writeTokenToFile(Token token, String path) throws IOException {
		String base = "";
		for(int c = path.length() - 1; c >= 0; c--) {
			if(path.charAt(c) == '/') {
				base = path.substring(0, c);
				break;
			}
		}
		
		File directory = new File(base);
		if(!directory.exists())
			directory.mkdirs();
		
		String output = gson.toJson(token);
		Files.write(Paths.get(path), output.getBytes());
	}
	
	// Writes a token to a file.
	public static void main(String[] args) {
		TokenFactory factory = new TokenFactory();
		
		String path = "./resources/tokens/auth/Login.token";
		
		Token token = new Token();
		token.authRequired = false;
		token.requestMethod = RequestMethod.POST;
		token.url = "https://api.robinhood.com/api-token-auth/";
		
		Map<String, String> headers = new HashMap<String, String>();
		token.headers = headers;
		
		try {
			factory.writeTokenToFile(token, path);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
