package com.zachs.bittrader.schemes.instrument.requests;

import com.zachs.bittrader.http.HttpClient;
import com.zachs.bittrader.schemes.instrument.types.InstrumentList;

public class GetInstrumentBySymbol extends HttpClient {

	public GetInstrumentBySymbol() {
		super("./resources/tokens/instrument/GetInstrumentBySymbol.token");
	}

	public InstrumentList execute(String symbol) {
		String routeKey = "symbol";
		
		if(super.token.routes.containsKey(routeKey))
			super.token.routes.replace(routeKey, symbol);
		else
			super.token.routes.put(routeKey, symbol);
		
		return super.execute(InstrumentList.class);
	}
}
