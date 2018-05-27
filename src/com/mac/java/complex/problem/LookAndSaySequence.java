package com.mac.java.complex.problem;

public class LookAndSaySequence {

	public static void main(String[] args) {
		int n = 8;
		String s = "1";
		lookAndSaySeq(n, s);
	}

	private static void lookAndSaySeq(int n, String s) {
		if (s != null & s.length() > 0) {
			int count = 1;
			StringBuilder sb = new StringBuilder();
			System.out.println(s);
			for (int i = 1; i < n; i++) {
				if (s.length() == 1) {
					sb = sb.append(count).append(s);
				} else {
					count = 1;
					int j = 0;
					while (j < s.length() - 1) {
						if (s.charAt(j) == s.charAt(j + 1)) {
							count++;
						} else {
							sb = sb.append(count).append(s.charAt(j));
							count = 1;
						}
						j++;
					}
					sb = sb.append(count).append(s.charAt(j));
				}
				s = sb.toString();
				sb = sb.delete(0, sb.length());
				System.out.println(s);
			}
		} else {
			System.out.println("Empty Data. Please provide some data.");
		}
	}
}
