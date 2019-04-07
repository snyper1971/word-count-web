package com.leospencer.model;

public class Word implements Comparable<Word> {

	final String text;
	final int frequencyCount;

	public Word(String wordText, int count) {
		this.text = wordText;
		this.frequencyCount = count;
	}

	public int compareTo(Word o) {

		if (this.frequencyCount != o.frequencyCount)	
			if (this.frequencyCount < o.frequencyCount)
				return 1;
			else
				return -1;
		else return 0;
	}

	public String getText() {
		return text;
	}

	public int getFrequencyCount() {
		return frequencyCount;
	}

}
