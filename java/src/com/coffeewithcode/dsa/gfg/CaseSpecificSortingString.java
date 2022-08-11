package com.coffeewithcode.dsa.gfg;

public class CaseSpecificSortingString {

	public static void main(String[] args) {
		System.out.println(caseSort("defRTSersUXI"));
	}

	public static String caseSort(String str) {
		// Your code here

		// Your code here
		int mapS[] = new int[26];
		int mapC[] = new int[26];

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) <= 90) {
				mapC[str.charAt(i) - 'A']++;
			}

			else {
				mapS[str.charAt(i) - 'a']++;
			}
		}

		StringBuilder res = new StringBuilder("");
		int pC = 0, pS = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) <= 90) {
				pC = getChar(mapC, pC);
				char c = (char) (pC + 65);
				res.append(c);
			}

			else {
				pS = getChar(mapS, pS);
				char c = (char) (pS + 97);
				res.append(c);
			}
		}

		return res.toString();

	}

	public static int getChar(int map[], int p) {

		while (map[p] == 0) {
			p++;
		}

		map[p]--;
		return p;

	}
}
