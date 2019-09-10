package com.zachs.bittrader.auth;

public class AuthToken {
	private char[] authToken;
	private char[] username;
	private char[] password;
	
	private boolean mfaRequired = false;
	private String mfaType;
	private String mfaCode;
	
	/**
	 * Empty for deserialization 
	 */
	public AuthToken() {
		
	}
	
	public AuthToken(char[] username, char[] password) {
		this.username = username;
		this.password = password;
	}
	
	public char[] getAuthToken() {
		return authToken;
	}
	public void setAuthToken(char[] authToken) {
		this.authToken = authToken;
	}
	public String getMfaType() {
		return mfaType;
	}
	public void setMfaType(String mfaType) {
		this.mfaType = mfaType;
	}
	public boolean isMfaRequired() {
		return mfaRequired;
	}
	public void setMfaRequired(boolean mfaRequired) {
		this.mfaRequired = mfaRequired;
	}
	public String getMfaCode() {
		return mfaCode;
	}
	public void setMfaCode(String mfaCode) {
		this.mfaCode = mfaCode;
	}
	public char[] getUsername() {
		return username;
	}
	public void setUsername(char[] username) {
		this.username = username;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
}
