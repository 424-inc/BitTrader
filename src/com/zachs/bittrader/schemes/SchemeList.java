package com.zachs.bittrader.schemes;

import java.util.List;

public abstract class SchemeList<T extends SchemeElement> extends SchemeElement {
	protected String previous;
	protected String next;
	protected List<T> results;
	
	public String getPrevious() {
		return previous;
	}
	public String getNext() {
		return next;
	}
	public List<T> getResults() {
		return results;
	}
	public boolean isEmpty() {
		return results.isEmpty();
	}
	public int getSize() {
		return results.size();
	}
}
