package com.testmaximumgenerics;

public class TestMaximumGenerics {

	/**
	 * 
	 * @param <Type> should be Comparable
	 * @param first
	 * @param second
	 * @param third
	 * @return maximum of first, second, third by comparing it
	 */
	public static <Type extends Comparable<Type>> Type maximum(Type first, Type second, Type third) {
		if (first.compareTo(second) > 0 && first.compareTo(third) > 0) {
			return first;
		} else if (second.compareTo(third) > 0) {
			return second;
		} else {
			return third;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to test maximum generics program");
		System.out.println("Three Integers :");
		System.out.println("Test case 1.1");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of 3, 2, 1 is : "+TestMaximumGenerics.maximum(3, 2, 1));
		System.out.println("Maximum of 3, 1, 2 is : "+TestMaximumGenerics.maximum(3, 1, 2));
		System.out.println("Maximum of 3, 1, 1 is : "+TestMaximumGenerics.maximum(3, 1, 1));
		
		System.out.println("Test case 1.2");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of 2, 3, 1 is : "+TestMaximumGenerics.maximum(2, 3, 1));
		System.out.println("Maximum of 1, 3, 2 is : "+TestMaximumGenerics.maximum(1, 3, 2));
		System.out.println("Maximum of 1, 3, 1 is : "+TestMaximumGenerics.maximum(1, 3, 1));
		
		System.out.println("Test case 1.3");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of 2, 1, 3 is : "+TestMaximumGenerics.maximum(2, 1, 3));
		System.out.println("Maximum of 1, 2, 3 is : "+TestMaximumGenerics.maximum(1, 2, 3));
		System.out.println("Maximum of 1, 1, 3 is : "+TestMaximumGenerics.maximum(1, 1, 3));
		
		System.out.println("Three Floats :");
		System.out.println("Test case 2.1");
		// Test Case 2.1 maximum number at first position 
		System.out.println("Maximum of 3.0f, 2.0f, 1.0f is : "+TestMaximumGenerics.maximum(3.0f, 2.0f, 1.0f));
		System.out.println("Maximum of 3.0f, 1.0f, 2.0f is : "+TestMaximumGenerics.maximum(3.0f, 1.0f, 2.0f));
		System.out.println("Maximum of 3.0f, 1.0f, 1.0f is : "+TestMaximumGenerics.maximum(3.0f, 1.0f, 1.0f));
		
		System.out.println("Test case 1.2");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of 2.0f, 3.0f, 1.0f is : "+TestMaximumGenerics.maximum(2.0f, 3.0f, 1.0f));
		System.out.println("Maximum of 1.0f, 3.0f, 2.0f is : "+TestMaximumGenerics.maximum(1.0f, 3.0f, 2.0f));
		System.out.println("Maximum of 1.0f, 3.0f, 1.0f is : "+TestMaximumGenerics.maximum(1.0f, 3.0f, 1.0f));
		
		System.out.println("Test case 1.3");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of 2.0f, 1.0f, 3.0f is : "+TestMaximumGenerics.maximum(2.0f, 1.0f, 3.0f));
		System.out.println("Maximum of 1.0f, 2.0f, 3.0f is : "+TestMaximumGenerics.maximum(1.0f, 2.0f, 3.0f));
		System.out.println("Maximum of 1.0f, 1.0f, 3.0f is : "+TestMaximumGenerics.maximum(1.0f, 1.0f, 3.0f));
		
		System.out.println("Three Strings :");
		System.out.println("Test case 1.1");
		// Test Case 1.1 maximum string at first position 
		System.out.println("Maximum of cb, aa, bb is : "+TestMaximumGenerics.maximum("cb", "aa", "bb"));
		System.out.println("Maximum of c, bb, aa is : "+TestMaximumGenerics.maximum("c", "bb", "aa"));
		System.out.println("Maximum of cc, aa, aa is : "+TestMaximumGenerics.maximum("cc", "aa", "aa"));
		
		System.out.println("Test case 1.2");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of aa, cb, bb is : "+TestMaximumGenerics.maximum("aa", "cb", "bb"));
		System.out.println("Maximum of bb, c, aa is : "+TestMaximumGenerics.maximum("bb", "c", "aa"));
		System.out.println("Maximum of aa, cc, aa is : "+TestMaximumGenerics.maximum("aa", "cc", "aa"));
		
		System.out.println("Test case 1.3");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of aa, bb, cb is : "+TestMaximumGenerics.maximum("aa", "bb", "cb"));
		System.out.println("Maximum of bb, aa, c is : "+TestMaximumGenerics.maximum("bb", "aa", "c"));
		System.out.println("Maximum of aa, aa, cc is : "+TestMaximumGenerics.maximum("aa", "aa", "cc"));
	}
}
