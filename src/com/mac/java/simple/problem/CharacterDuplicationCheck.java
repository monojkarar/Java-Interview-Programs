package com.mac.java.simple.problem;

/**
 * Check if any character repeated more than once.
 * 
 * @author monojkarar
 *
 */
public class CharacterDuplicationCheck {

	public static void main(String[] args) {
		String str = "abca";
		System.out.println(isRepeated(str));
	}

	private static boolean isRepeated(String str) {
		if (str != null && str.length() > 1) {
			for (int i = 0; i < str.length() - 1; i++) {
				if (str.indexOf(str.charAt(i), i + 1) != -1) {
					return true;
				}
			}
		}
		return false;
	}

}
