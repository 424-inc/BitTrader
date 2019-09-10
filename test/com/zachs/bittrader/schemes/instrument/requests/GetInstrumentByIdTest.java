package com.zachs.bittrader.schemes.instrument.requests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.zachs.bittrader.schemes.instrument.types.Instrument;

class GetInstrumentByIdTest {
	GetInstrumentById getInstrumentById = new GetInstrumentById();
	
	@Test
	void testExecuteString() {
		String id = "50810c35-d215-4866-9758-0ada4ac79ffa";
		Instrument instrument = getInstrumentById.execute(id);
		assertEquals(id, instrument.getId());
	}

}
