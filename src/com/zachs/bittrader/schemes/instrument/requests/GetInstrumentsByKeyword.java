package com.zachs.bittrader.schemes.instrument.requests;

import com.zachs.bittrader.http.HttpClient;
import com.zachs.bittrader.schemes.instrument.types.InstrumentList;

public class GetInstrumentsByKeyword extends HttpClient {
	public GetInstrumentsByKeyword() {
		super("./resources/tokens/instrument/GetInstrumentsByKeyword.token");
	}

	public InstrumentList execute(String keyword) {
		String routeKey = "keyword";
		
		if(super.token.routes.containsKey(routeKey))
			super.token.routes.replace(routeKey, keyword);
		else
			super.token.routes.put(routeKey, keyword);
		
		return super.execute(InstrumentList.class);
	}
}
