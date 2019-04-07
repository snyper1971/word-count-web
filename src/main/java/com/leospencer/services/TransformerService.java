package com.leospencer.services;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.stream.Stream;

import org.springframework.stereotype.Service;

import com.leospencer.model.Word;

@Service
public class TransformerService implements Transformer {

	public TransformerService() {
	}

	public Object[] getWordsInSortedOrder(String text) {
		return this.parseTextToWords(text).toArray();
	}

	public Object[] getWordsInOrderOfFrequency(String text) {
		Object[] wordObjArr = parseTextToWords(text).toArray();
		Arrays.sort(wordObjArr);
		return wordObjArr;

	}

	public Stream<Word> parseTextToWords(String text) {
		return this.parse(text).stream();
	}

	protected List<Word> parse(String text) {
		String[] words = text.split("\\W+");

		Map<String, Integer> wordMap = new TreeMap<String, Integer>();

		for (String w : words) {
			if (!wordMap.containsKey(w)) {
				wordMap.put(w, 1);
			} else {
				wordMap.put(w, wordMap.get(w) + 1);
			}
		}

		List<Word> wordList = new ArrayList<Word>();
		for (@SuppressWarnings("rawtypes")
		Entry entry : wordMap.entrySet()) {
			Word w = new Word((String) entry.getKey(), (Integer) entry.getValue());
			wordList.add(w);
		}

		return wordList;
	}

}
