package anogram;

import java.util.HashMap;

public class Map {

	public static boolean areAnogram(String s1, String s2) {

		// Creat 1: Length
		if (s1.length() != s2.length()) {

			return false;

		}

		// Create maps for both strings and create the list of characters
		// with their frequency:
		HashMap<Character, Integer> freq1 = new HashMap<Character, Integer>();
		HashMap<Character, Integer> freq2 = new HashMap<Character, Integer>();

		// Create the loop for the first string
		for (char ch : s1.toCharArray()) {
			if (freq1.containsKey(ch)) {
				int newValue = freq1.get(ch) + 1;
				freq1.put(ch, newValue);
			} else {
				freq1.put(ch, 1);
			}

		}
		for (char ch : s2.toCharArray()) {
			if (freq2.containsKey(ch)) {
				int newValue = freq2.get(ch) + 1;
				freq2.put(ch, newValue);
			} else {
				freq2.put(ch, 1);
			}

		}

		System.out.println(freq1);
		System.out.println(freq2);

		for (char ch : freq1.keySet()) {
			if (!freq2.containsKey(ch) || freq2.get(ch) != freq1.get(ch)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		String s1 = "danger";
		String s2 = "garden";

		System.out.println(areAnogram(s1, s2));
	}
}
