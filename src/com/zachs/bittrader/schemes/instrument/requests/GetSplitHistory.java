package com.zachs.bittrader.schemes.instrument.requests;

import com.zachs.bittrader.http.HttpClient;
import com.zachs.bittrader.schemes.instrument.types.SplitList;

public class GetSplitHistory extends HttpClient {
	
	public GetSplitHistory() {
		super("./resources/tokens/instrument/GetSplitHistory.token");
	}
	
	public SplitList execute(String instrumentId) {
		String routeKey = "instrument_id";
		
		if(super.token.routes.containsKey(routeKey))
			super.token.routes.replace(routeKey, instrumentId);
		else
			super.token.routes.put(routeKey, instrumentId);
		
		return super.execute(SplitList.class);
	}
}
