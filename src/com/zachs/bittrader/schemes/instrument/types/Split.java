package com.zachs.bittrader.schemes.instrument.types;

import com.google.gson.annotations.SerializedName;
import com.zachs.bittrader.schemes.SchemeElement;

public class Split extends SchemeElement {
	@SerializedName("url")
	private String url;
	@SerializedName("instrument")
	private String instrument;
	@SerializedName("execution_date")
	private String execution_date;
	@SerializedName("divisor")
	private String divisor;
	@SerializedName("multiplier")
	private String multiplier;
	
	public String getUrl() {
		return url;
	}
	public String getInstrument() {
		return instrument;
	}
	public String getExecution_date() {
		return execution_date;
	}
	public String getDivisor() {
		return divisor;
	}
	public String getMultiplier() {
		return multiplier;
	}
}
