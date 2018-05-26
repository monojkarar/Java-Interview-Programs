package com.mac.java.simple.problem;

public class HackerRankTest {

	public static void main(String[] args) {
		int x1 = 0, v1 = 3, x2 = 4, v2 = 2;
		int tempv1 = v1, tempv2 = v2;
		// int x1=0, v1=2, x2=5, v2=3;
		int range = 0;
		if (v1 > v2) {
			range = 10000 / v1;
		} else {
			range = 10000 / v2;
		}
		
		String result = "NO";
		for (int i = 1; i < range; i++) {
			if ((v1 > 1 && v1 < 10000) && (v2 > 1 && v2 < 10000)) {
				v1 = x1 + tempv1;
				v2 = x2 + tempv2;
				x1 = v1;
				x2= v2;
				if (v1 == v2) {
					result = "YES";
					break;
				}
			} else {
				break;
			}

		}
		System.out.println(result);
	}
}
