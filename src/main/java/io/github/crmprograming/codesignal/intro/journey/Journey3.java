package io.github.crmprograming.codesignal.intro.journey;

public class Journey3 {

	public static boolean checkPalindrome(String inputString) {
		int i = 0;
		char[] palabra = inputString.toCharArray();
		
		while (i < palabra.length - (i + 1) && palabra[i] == palabra[palabra.length - (i + 1)])
			i++;
		
		return i >= palabra.length - (i + 1);
	}
	
}
