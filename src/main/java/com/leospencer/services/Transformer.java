package com.leospencer.services;

public interface Transformer {

	public Object[] getWordsInSortedOrder(String text);
	public Object[] getWordsInOrderOfFrequency(String text);
}
