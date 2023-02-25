package anogram;

import java.util.Arrays;

public class AnogramSolutıon2 {

	public static boolean areAnogram(String s1, String s2) {
		if (s1.length() != s2.length()) {

			return false;
		}

		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();

		Arrays.sort(ch1);
		Arrays.sort(ch2);

		for (char ch : ch1) {
			System.out.print(ch +  ' ');
		}

		System.out.println();

		for (char ch : ch2) {
			System.out.print(ch +  ' ');
		}
		// Arrays are equal if they have same number of elements with the same value
		// in the sequence
		// compare
		if (Arrays.equals(ch1, ch2)) {

			return true;

		} else {

			return false;
		}

	}

	public static void main(String[] args) {

		String s1 = "danger";
		String s2 = "garden";

		System.out.println(areAnogram(s1, s2));

	}

}