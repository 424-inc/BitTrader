package com.zachs.bittrader.schemes.instrument.requests;

import com.zachs.bittrader.http.HttpClient;
import com.zachs.bittrader.schemes.instrument.types.Instrument;

public class GetInstrumentById extends HttpClient {
	
	public GetInstrumentById() {
		super("./resources/tokens/instrument/GetInstrumentById.token");
	}
	
	public Instrument execute(String instrumentId) {
		String routeKey = "instrument_id";
		
		if(super.token.routes.containsKey(routeKey))
			super.token.routes.replace(routeKey, instrumentId);
		else
			super.token.routes.put(routeKey, instrumentId);
		
		return super.execute(Instrument.class);
	}
}
