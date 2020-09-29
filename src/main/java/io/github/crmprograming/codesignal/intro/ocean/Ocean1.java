package io.github.crmprograming.codesignal.intro.ocean;

public class Ocean1 {
	
	public static int adjacentElementsProduct(int[] inputArray) {
		int result = Integer.MIN_VALUE;
		int i = 0;
		
		for (i = 0; i < inputArray.length - 1; i++)
			result = (inputArray[i] * inputArray[i+1] > result)?inputArray[i] * inputArray[i+1]:result;
		
		return result;
	}


}
