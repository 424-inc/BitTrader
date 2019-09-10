package com.zachs.bittrader.schemes.instrument.requests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.zachs.bittrader.schemes.instrument.requests.GetInstrumentsByKeyword;
import com.zachs.bittrader.schemes.instrument.types.InstrumentList;

class GetInstrumentsByKeywordTest {
	GetInstrumentsByKeyword getInstrumentsByKeyword = new GetInstrumentsByKeyword();
	
	@Test
	void testExecuteString() {
		String keyword = "oil";
		InstrumentList list = getInstrumentsByKeyword.execute(keyword);
		assertTrue(list.isEmpty() == false);
	}
}
