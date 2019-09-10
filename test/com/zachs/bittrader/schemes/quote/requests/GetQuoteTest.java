package com.zachs.bittrader.schemes.quote.requests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.zachs.bittrader.schemes.quote.types.Quote;

class GetQuoteTest {
	GetQuote getQuote = new GetQuote();
	@Test
	void testExecuteString() {
		String symbol = "MSFT";
		Quote quote = getQuote.execute(symbol);
		assertEquals(symbol, quote.getSymbol());
	}

}
