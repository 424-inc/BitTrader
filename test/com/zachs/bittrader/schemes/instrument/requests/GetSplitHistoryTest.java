package com.zachs.bittrader.schemes.instrument.requests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.zachs.bittrader.schemes.instrument.types.SplitList;

class GetSplitHistoryTest {
	GetSplitHistory getSplitHistory = new GetSplitHistory();
	
	@Test
	void testExecuteString() {
		String instrumentId = "e0737b33-7d4a-4677-83cd-e52f06f2b0db";
		SplitList splitList = getSplitHistory.execute(instrumentId);
		assertTrue(splitList.getSize() > 0);
	}

}
