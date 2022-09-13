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
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of 3, 2, 1 is : "+TestMaximumGenerics.maximumInteger(3, 2, 1));
		System.out.println("Maximum of 3, 1, 2 is : "+TestMaximumGenerics.maximumInteger(3, 1, 2));
		System.out.println("Maximum of 3, 1, 1 is : "+TestMaximumGenerics.maximumInteger(3, 1, 1));
	}
}
