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
					char[] ch = s.toCharArray();
					count = 1;
					int j = 0;
					for (; j < ch.length - 1; j++) {
						if (ch[j] == ch[j + 1]) {
							count++;
						} else {
							sb = sb.append(count).append(ch[j]);
							count = 1;
						}
					}
					sb = sb.append(count).append(ch[j]);
				}
				s = sb.toString();
				System.out.println(s);
				sb = sb.delete(0, sb.length());
			}
		} else {
			System.out.println("Empty Data. Please provide some data.");
		}
	}
}
