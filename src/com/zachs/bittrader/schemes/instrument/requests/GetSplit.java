package com.zachs.bittrader.schemes.instrument.requests;

import com.zachs.bittrader.http.HttpClient;
import com.zachs.bittrader.schemes.instrument.types.Split;

public class GetSplit extends HttpClient {

	public GetSplit() {
		super("./resources/tokens/instrument/GetSplit.token");
	}

	public Split execute(String instrumentId, String splitId) {
		String routeKey1 = "instrument_id";
		String routeKey2 = "split_id";
		
		if(super.token.routes.containsKey(routeKey1))
			super.token.routes.replace(routeKey1, instrumentId);
		else
			super.token.routes.put(routeKey1, instrumentId);
		
		if(super.token.routes.containsKey(routeKey2))
			super.token.routes.replace(routeKey2, splitId);
		else
			super.token.routes.put(routeKey2, splitId);
		
		return super.execute(Split.class);
	}
}
