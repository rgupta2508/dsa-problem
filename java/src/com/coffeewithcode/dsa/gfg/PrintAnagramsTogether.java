package com.coffeewithcode.dsa.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintAnagramsTogether {
	public static void main(String[] args) {
		String words[] = { "act", "god", "cat", "dog", "tac" };
		List<List<String>> res = Anagrams(words);
		for (List<String> s : res) {
			System.out.println(Arrays.toString(s.toArray()));
			// System.out.println("=====");
		}
	}

	public static List<List<String>> Anagrams(String[] arr) {
		// Code here

		Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (String s : arr) {

			char[] c = s.toCharArray(); // convert to array of chars
			Arrays.sort(c); // sort
			String tempKey = new String(c);
			List<String> list = new ArrayList<String>();
			if (map.containsKey(tempKey)) {
				list = map.get(tempKey);
				// list.add(tempKey);
			}
			list.add(s);
			map.put(tempKey, list);
		}
		List<List<String>> res = new ArrayList<List<String>>();
		for (List<String> s : map.values()) {
			res.add(s);
		}
		return res;

	}
}
