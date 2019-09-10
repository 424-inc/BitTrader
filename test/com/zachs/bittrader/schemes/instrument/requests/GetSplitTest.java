package com.zachs.bittrader.schemes.instrument.requests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.zachs.bittrader.schemes.instrument.requests.GetSplit;
import com.zachs.bittrader.schemes.instrument.types.Split;

class GetSplitTest {
	GetSplit getSplit = new GetSplit();
	
	@Test
	void testExecuteStringString() {
		String instrumentId = "e0737b33-7d4a-4677-83cd-e52f06f2b0db";
		String splitId = "8cbf65be-fe4b-4e01-9b9f-f4fb9aaf6ba5";
		Split split = getSplit.execute(instrumentId, splitId);
		
		assertEquals(split.getExecution_date(), "2015-10-01");
	}

}
