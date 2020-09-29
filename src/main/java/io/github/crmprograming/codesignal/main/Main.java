package io.github.crmprograming.codesignal.main;

import io.github.crmprograming.codesignal.intro.journey.*;
import io.github.crmprograming.codesignal.intro.ocean.*;

public class Main {
	
	private static void journey() {
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
	
	private static void ocean() {
		// Ocean 1
		System.out.println(Ocean1.adjacentElementsProduct(new int[] {3, 6, -2, -5, 7, 3}));
		
	}

	public static void main(String[] args) {
//		journey();
		ocean();
	}

}
