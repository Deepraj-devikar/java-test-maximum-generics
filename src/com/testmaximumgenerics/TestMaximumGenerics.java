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
	
	public Type testMaximum() {
		return TestMaximumGenerics.testMaximum(first, second, third);
	}
	
	public static <Type extends Comparable<Type>> Type testMaximum(Type first, Type second, Type third) {
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
		System.out.println("Maximum of 3, 2, 1 is : "+new TestMaximumGenerics<Integer>(3, 2, 1).testMaximum());
		System.out.println("Maximum of 3, 1, 2 is : "+new TestMaximumGenerics<Integer>(3, 1, 2).testMaximum());
		System.out.println("Maximum of 3, 1, 1 is : "+new TestMaximumGenerics<Integer>(3, 1, 1).testMaximum());
		
		System.out.println("Test case 1.2");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of 2, 3, 1 is : "+new TestMaximumGenerics<Integer>(2, 3, 1).testMaximum());
		System.out.println("Maximum of 1, 3, 2 is : "+new TestMaximumGenerics<Integer>(1, 3, 2).testMaximum());
		System.out.println("Maximum of 1, 3, 1 is : "+new TestMaximumGenerics<Integer>(1, 3, 1).testMaximum());
		
		System.out.println("Test case 1.3");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of 2, 1, 3 is : "+new TestMaximumGenerics<Integer>(2, 1, 3).testMaximum());
		System.out.println("Maximum of 1, 2, 3 is : "+new TestMaximumGenerics<Integer>(1, 2, 3).testMaximum());
		System.out.println("Maximum of 1, 1, 3 is : "+new TestMaximumGenerics<Integer>(1, 1, 3).testMaximum());
		
		System.out.println("Three Floats :");
		System.out.println("Test case 2.1");
		// Test Case 2.1 maximum number at first position 
		System.out.println("Maximum of 3.0f, 2.0f, 1.0f is : "+new TestMaximumGenerics<Float>(3.0f, 2.0f, 1.0f).testMaximum());
		System.out.println("Maximum of 3.0f, 1.0f, 2.0f is : "+new TestMaximumGenerics<Float>(3.0f, 1.0f, 2.0f).testMaximum());
		System.out.println("Maximum of 3.0f, 1.0f, 1.0f is : "+new TestMaximumGenerics<Float>(3.0f, 1.0f, 1.0f).testMaximum());
		
		System.out.println("Test case 1.2");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of 2.0f, 3.0f, 1.0f is : "+new TestMaximumGenerics<Float>(2.0f, 3.0f, 1.0f).testMaximum());
		System.out.println("Maximum of 1.0f, 3.0f, 2.0f is : "+new TestMaximumGenerics<Float>(1.0f, 3.0f, 2.0f).testMaximum());
		System.out.println("Maximum of 1.0f, 3.0f, 1.0f is : "+new TestMaximumGenerics<Float>(1.0f, 3.0f, 1.0f).testMaximum());
		
		System.out.println("Test case 1.3");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of 2.0f, 1.0f, 3.0f is : "+new TestMaximumGenerics<Float>(2.0f, 1.0f, 3.0f).testMaximum());
		System.out.println("Maximum of 1.0f, 2.0f, 3.0f is : "+new TestMaximumGenerics<Float>(1.0f, 2.0f, 3.0f).testMaximum());
		System.out.println("Maximum of 1.0f, 1.0f, 3.0f is : "+new TestMaximumGenerics<Float>(1.0f, 1.0f, 3.0f).testMaximum());
		
		System.out.println("Three Strings :");
		System.out.println("Test case 1.1");
		// Test Case 1.1 maximum string at first position 
		System.out.println("Maximum of Peach, Apple, Banana is : "+new TestMaximumGenerics<String>("Peach", "Apple", "Banana").testMaximum());
		System.out.println("Maximum of Peach, Banana, Apple is : "+new TestMaximumGenerics<String>("Peach", "Banana", "Apple").testMaximum());
		System.out.println("Maximum of Peach, Apple, Apple is : "+new TestMaximumGenerics<String>("Peach", "Apple", "Apple").testMaximum());
		
		System.out.println("Test case 1.2");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of Apple, Peach, Banana is : "+new TestMaximumGenerics<String>("Apple", "Peach", "Banana").testMaximum());
		System.out.println("Maximum of Banana, Peach, Apple is : "+new TestMaximumGenerics<String>("Banana", "Peach", "Apple").testMaximum());
		System.out.println("Maximum of Apple, Peach, Apple is : "+new TestMaximumGenerics<String>("Apple", "Peach", "Apple").testMaximum());
		
		System.out.println("Test case 1.3");
		// Test Case 1.1 maximum number at first position 
		System.out.println("Maximum of Apple, Banana, Peach is : "+new TestMaximumGenerics<String>("Apple", "Banana", "Peach").testMaximum());
		System.out.println("Maximum of Banana, Apple, Peach is : "+new TestMaximumGenerics<String>("Banana", "Apple", "Peach").testMaximum());
		System.out.println("Maximum of Apple, Apple, Peach is : "+new TestMaximumGenerics<String>("Apple", "Apple", "Peach").testMaximum());
	}
}
