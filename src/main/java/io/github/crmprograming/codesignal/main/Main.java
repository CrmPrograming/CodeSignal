package io.github.crmprograming.codesignal.main;

import io.github.crmprograming.codesignal.intro.journey.*;

public class Main {

	public static void main(String[] args) {
		// Journey 1
		System.out.println(Journey1.add(2, 3));
		
		// Journey 2		
		System.out.println(Journey2.centuryFromYear(1905));
		System.out.println(Journey2.centuryFromYear(1700));
		
		// Journey 3
		System.out.println(Journey3.checkPalindrome("aabaa"));
		System.out.println(Journey3.checkPalindrome("abac"));
		System.out.println(Journey3.checkPalindrome("a"));
	}

}
