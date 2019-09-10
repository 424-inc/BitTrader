package com.zachs.bittrader.http;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Token {
	@SerializedName("url")
	public String url;
	
	@SerializedName("headers")
	public Map<String, String> headers;
	
	@Expose(serialize = false, deserialize = false)
	public Map<String, Object> routes;
	
	@SerializedName("requestMethod")
	public RequestMethod requestMethod;
	
	@SerializedName("authRequired")
	public boolean authRequired;
	
	public Token() {
		headers = new HashMap<String, String>();
		routes = new HashMap<String, Object>();
	}
	
	/**
	 * Provides the type of HTTP requests that can be performed,
	 * such as GET and POST.
	 * @author Zach Smith
	 */
	public enum RequestMethod {
		GET("GET"), POST("POST");
		
		private String val;
		
		RequestMethod(String val) {
			this.val = val;
		}
		
		public String getValue() {
			return val;
		}
	}
}
