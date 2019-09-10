package com.zachs.bittrader.schemes.quote.requests;

import com.zachs.bittrader.http.HttpClient;
import com.zachs.bittrader.schemes.quote.types.Quote;

public class GetQuote extends HttpClient {

	public GetQuote() {
		super("./resources/tokens/quote/GetQuote.token");
	}

	public Quote execute(String symbol) {
		String routeKey = "symbol";
		
		if(super.token.routes.containsKey(routeKey))
			super.token.routes.replace(routeKey, symbol);
		else
			super.token.routes.put(routeKey, symbol);
		
		return super.execute(Quote.class);
	}
}
