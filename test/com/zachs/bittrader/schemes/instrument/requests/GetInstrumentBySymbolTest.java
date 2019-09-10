package com.zachs.bittrader.schemes.instrument.requests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.zachs.bittrader.schemes.instrument.types.Instrument;
import com.zachs.bittrader.schemes.instrument.types.InstrumentList;

class GetInstrumentBySymbolTest {
	GetInstrumentBySymbol getInstrumentBySymbol = new GetInstrumentBySymbol();

	@Test
	void testExecuteString() {
		String symbol = "MSFT";
		InstrumentList instrumentList = getInstrumentBySymbol.execute(symbol);
		Instrument instrument = instrumentList.getResults().get(0);
		assertEquals(symbol, instrument.getSymbol());
	}

}
