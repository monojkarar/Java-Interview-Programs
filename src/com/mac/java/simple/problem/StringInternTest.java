package com.mac.java.simple.problem;


/**
 * 
 * To check how intern methods internally works.
 * 
 * Without using equals method how to compare two string.
 * 
 * Compare two strings using == operator with any methods.
 * 
 * @author monojkarar
 *
 */
public class StringInternTest {

	public static void main(String[] args) {
		// String name1 = "Monoj";
		// String name2 = "Monoj";
		// String name3 = "Monoj".intern();

		// System.out.println(name1==name2);
		// System.out.println(name1==name3);

		// String name = new String("Monoj Karar");
		// String name1 = "Monoj Karar";
		// String name2 = new String("Monoj Karar").intern();
		// System.out.println(name == name1);
		// System.out.println(name1 == name2);
		// System.out.println(name == name2);

		String s1 = "Before starting your application you should java -XX:MaxPermSize to get rid of this error.";
		String s2 = "Before starting your application you should java -XX:MaxPermSize to get rid of this error.";
		
		for (int i = 0; i < 10; i++) {
			long currentTimeInMillis = System.currentTimeMillis();
//			System.out.println(s1.equals(s2));
			System.out.println(s1==s2);
			long currentTimeInMillis1 = System.currentTimeMillis();
			long result = currentTimeInMillis1 - currentTimeInMillis;
			System.out.println("Seconds " + result);
		}

	}

}
