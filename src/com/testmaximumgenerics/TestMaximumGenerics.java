package com.testmaximumgenerics;

public class TestMaximumGenerics {

	public static Integer maximumInteger(Integer first, Integer second, Integer third) {
		if (first > second && first > third) {
			return first;
		} else if (second > third) {
			return second;
		} else {
			return third;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to test maximum generics program");
		System.out.println("Test case 1.1");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of 3, 2, 1 is : "+TestMaximumGenerics.maximumInteger(3, 2, 1));
		System.out.println("Maximum of 3, 1, 2 is : "+TestMaximumGenerics.maximumInteger(3, 1, 2));
		System.out.println("Maximum of 3, 1, 1 is : "+TestMaximumGenerics.maximumInteger(3, 1, 1));
		
		System.out.println("Test case 1.2");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of 2, 3, 1 is : "+TestMaximumGenerics.maximumInteger(2, 3, 1));
		System.out.println("Maximum of 1, 3, 2 is : "+TestMaximumGenerics.maximumInteger(1, 3, 2));
		System.out.println("Maximum of 1, 3, 1 is : "+TestMaximumGenerics.maximumInteger(1, 3, 1));
	}
}
