package com.zachs.bittrader.auth.providers;

import com.zachs.bittrader.auth.AuthToken;

/**
 * Declares a class as a valid IAuthProvider.
 * Used for getting an auth token from different sources,
 * such as a file or console stream.
 * @author Zach Smith
 */
public interface IAuthProvider {
	
	/**
	 * Retrieves a basic authorization token.
	 * @return Instance of AuthToken with the username and password 
	 * fields populated.
	 */
	public AuthToken getBasicToken();
}
