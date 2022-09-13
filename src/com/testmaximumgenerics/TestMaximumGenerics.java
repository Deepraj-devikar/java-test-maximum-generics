package com.testmaximumgenerics;

/**
 * 
 * @param <Type> should be Comparable
 */
public class TestMaximumGenerics<Type extends Comparable<Type>> {
	
	Type first, second, third;
	
	TestMaximumGenerics(Type first, Type second, Type third) {
		this.first = first;
		this.second = second;
		this.third = third;
	}
	
	public Type maximum() {
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
		System.out.println("Maximum of 3, 2, 1 is : "+new TestMaximumGenerics<Integer>(3, 2, 1).maximum());
		System.out.println("Maximum of 3, 1, 2 is : "+new TestMaximumGenerics<Integer>(3, 1, 2).maximum());
		System.out.println("Maximum of 3, 1, 1 is : "+new TestMaximumGenerics<Integer>(3, 1, 1).maximum());
		
		System.out.println("Test case 1.2");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of 2, 3, 1 is : "+new TestMaximumGenerics<Integer>(2, 3, 1).maximum());
		System.out.println("Maximum of 1, 3, 2 is : "+new TestMaximumGenerics<Integer>(1, 3, 2).maximum());
		System.out.println("Maximum of 1, 3, 1 is : "+new TestMaximumGenerics<Integer>(1, 3, 1).maximum());
		
		System.out.println("Test case 1.3");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of 2, 1, 3 is : "+new TestMaximumGenerics<Integer>(2, 1, 3).maximum());
		System.out.println("Maximum of 1, 2, 3 is : "+new TestMaximumGenerics<Integer>(1, 2, 3).maximum());
		System.out.println("Maximum of 1, 1, 3 is : "+new TestMaximumGenerics<Integer>(1, 1, 3).maximum());
		
		System.out.println("Three Floats :");
		System.out.println("Test case 2.1");
		// Test Case 2.1 maximum number at first position 
		System.out.println("Maximum of 3.0f, 2.0f, 1.0f is : "+new TestMaximumGenerics<Float>(3.0f, 2.0f, 1.0f).maximum());
		System.out.println("Maximum of 3.0f, 1.0f, 2.0f is : "+new TestMaximumGenerics<Float>(3.0f, 1.0f, 2.0f).maximum());
		System.out.println("Maximum of 3.0f, 1.0f, 1.0f is : "+new TestMaximumGenerics<Float>(3.0f, 1.0f, 1.0f).maximum());
		
		System.out.println("Test case 1.2");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of 2.0f, 3.0f, 1.0f is : "+new TestMaximumGenerics<Float>(2.0f, 3.0f, 1.0f).maximum());
		System.out.println("Maximum of 1.0f, 3.0f, 2.0f is : "+new TestMaximumGenerics<Float>(1.0f, 3.0f, 2.0f).maximum());
		System.out.println("Maximum of 1.0f, 3.0f, 1.0f is : "+new TestMaximumGenerics<Float>(1.0f, 3.0f, 1.0f).maximum());
		
		System.out.println("Test case 1.3");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of 2.0f, 1.0f, 3.0f is : "+new TestMaximumGenerics<Float>(2.0f, 1.0f, 3.0f).maximum());
		System.out.println("Maximum of 1.0f, 2.0f, 3.0f is : "+new TestMaximumGenerics<Float>(1.0f, 2.0f, 3.0f).maximum());
		System.out.println("Maximum of 1.0f, 1.0f, 3.0f is : "+new TestMaximumGenerics<Float>(1.0f, 1.0f, 3.0f).maximum());
		
		System.out.println("Three Strings :");
		System.out.println("Test case 1.1");
		// Test Case 1.1 maximum string at first position 
		System.out.println("Maximum of cb, aa, bb is : "+new TestMaximumGenerics<String>("cb", "aa", "bb").maximum());
		System.out.println("Maximum of c, bb, aa is : "+new TestMaximumGenerics<String>("c", "bb", "aa").maximum());
		System.out.println("Maximum of cc, aa, aa is : "+new TestMaximumGenerics<String>("cc", "aa", "aa").maximum());
		
		System.out.println("Test case 1.2");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of aa, cb, bb is : "+new TestMaximumGenerics<String>("aa", "cb", "bb").maximum());
		System.out.println("Maximum of bb, c, aa is : "+new TestMaximumGenerics<String>("bb", "c", "aa").maximum());
		System.out.println("Maximum of aa, cc, aa is : "+new TestMaximumGenerics<String>("aa", "cc", "aa").maximum());
		
		System.out.println("Test case 1.3");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of aa, bb, cb is : "+new TestMaximumGenerics<String>("aa", "bb", "cb").maximum());
		System.out.println("Maximum of bb, aa, c is : "+new TestMaximumGenerics<String>("bb", "aa", "c").maximum());
		System.out.println("Maximum of aa, aa, cc is : "+new TestMaximumGenerics<String>("aa", "aa", "cc").maximum());
	}
}
