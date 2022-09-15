package com.testmaximumgenerics;

/**
 * 
 * @param <Type> should be Comparable
 */
public class TestMaximumGenerics<Type extends Comparable<Type>>{
	Type elements[];
	
	TestMaximumGenerics(Type[] elements) {
		this.elements = elements;
	}
	
	public void add(Type element) {
		elements[elements.length] = element;
	}
	
	public Type testMaximum() {
		return TestMaximumGenerics.testMaximum(elements);
	}
	
	public static <Type extends Comparable<Type>> Type max(Type[] elements) {
		return sort(elements)[0];
	}
	
	public static <Type extends Comparable<Type>> Type[] sort(Type[] elements) {
		Type tempElement;
		for(int i = 0; i < elements.length - 1; i++)
			for(int j = 0; j < elements.length - i - 1; j++)
				if(elements[j].compareTo(elements[j+1]) < 0) {
					tempElement = elements[j];
					elements[j] = elements[j+1];
					elements[j+1] = tempElement;
				}
		return elements;
	}
	
	public static <Type extends Comparable<Type>> Type testMaximum(Type[] elements) {
		return max(elements);
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to test maximum generics program");
		System.out.println("Three Integers :");
		System.out.println("Test case 1.1");
		// Test Case 1.1 maximum number at first position 
		Integer[] intArr1 = {4, 3, 2, 1};
		System.out.println("Maximum of 4, 3, 2, 1 is : "+new TestMaximumGenerics<Integer>(intArr1).testMaximum());
		Integer[] intArr2 = {4, 3, 1, 2};
		System.out.println("Maximum of 4, 3, 1, 2 is : "+new TestMaximumGenerics<Integer>(intArr2).testMaximum());
		Integer[] intArr3 = {4, 3, 1, 1};
		System.out.println("Maximum of 4, 3, 1, 1 is : "+new TestMaximumGenerics<Integer>(intArr3).testMaximum());
		
		System.out.println("Test case 1.2");
		// Test Case 1.1 maximum number at first position 
		Integer[] intArr4 = {2, 4, 3, 1};
		System.out.println("Maximum of 2, 4, 3, 1 is : "+new TestMaximumGenerics<Integer>(intArr4).testMaximum());
		Integer[] intArr5 = {1, 4, 3, 2};
		System.out.println("Maximum of 1, 4, 3, 2 is : "+new TestMaximumGenerics<Integer>(intArr5).testMaximum());
		Integer[] intArr6 = {1, 4, 3, 1};
		System.out.println("Maximum of 1, 4, 3, 1 is : "+new TestMaximumGenerics<Integer>(intArr6).testMaximum());
		
		System.out.println("Test case 1.3");
		// Test Case 1.1 maximum number at first position 
		Integer[] intArr7 = {2, 1, 3, 4};
		System.out.println("Maximum of 2, 1, 3, 4 is : "+new TestMaximumGenerics<Integer>(intArr7).testMaximum());
		Integer[] intArr8 = {1, 2, 3, 4};
		System.out.println("Maximum of 1, 2, 3, 4 is : "+new TestMaximumGenerics<Integer>(intArr8).testMaximum());
		Integer[] intArr9 = {1, 1, 3, 4};
		System.out.println("Maximum of 1, 1, 3, 4 is : "+new TestMaximumGenerics<Integer>(intArr9).testMaximum());
		
		System.out.println("Three Floats :");
		System.out.println("Test case 2.1");
		// Test Case 2.1 maximum number at first position 
		Float[] floatArr1 = {4.0f, 3.0f, 2.0f, 1.0f};
		System.out.println("Maximum of 4.0f, 3.0f, 2.0f, 1.0f is : "+new TestMaximumGenerics<Float>(floatArr1).testMaximum());
		Float[] floatArr2 = {4.0f, 3.0f, 1.0f, 2.0f};
		System.out.println("Maximum of 4.0f, 3.0f, 1.0f, 2.0f is : "+new TestMaximumGenerics<Float>(floatArr2).testMaximum());
		Float[] floatArr3 = {4.0f, 3.0f, 1.0f, 1.0f};
		System.out.println("Maximum of 4.0f, 3.0f, 1.0f, 1.0f is : "+new TestMaximumGenerics<Float>(floatArr3).testMaximum());
		
		System.out.println("Test case 1.2");
		// Test Case 1.1 maximum number at first position 
		Float[] floatArr4 = {2.0f, 4.0f, 3.0f, 1.0f};
		System.out.println("Maximum of 2.0f, 4.0f, 3.0f, 1.0f is : "+new TestMaximumGenerics<Float>(floatArr4).testMaximum());
		Float[] floatArr5 = {1.0f, 4.0f, 3.0f, 2.0f};
		System.out.println("Maximum of 1.0f, 4.0f, 3.0f, 2.0f is : "+new TestMaximumGenerics<Float>(floatArr5).testMaximum());
		Float[] floatArr6 = {1.0f, 4.0f, 3.0f, 1.0f};
		System.out.println("Maximum of 1.0f, 4.0f, 3.0f, 1.0f is : "+new TestMaximumGenerics<Float>(floatArr6).testMaximum());
		
		System.out.println("Test case 1.3");
		// Test Case 1.1 maximum number at first position 
		Float[] floatArr7 = {2.0f, 1.0f, 3.0f, 4.0f};
		System.out.println("Maximum of 2.0f, 1.0f, 3.0f, 4.0f is : "+new TestMaximumGenerics<Float>(floatArr7).testMaximum());
		Float[] floatArr8 = {1.0f, 2.0f, 3.0f, 4.0f};
		System.out.println("Maximum of 1.0f, 2.0f, 3.0f, 4.0f is : "+new TestMaximumGenerics<Float>(floatArr8).testMaximum());
		Float[] floatArr9 = {1.0f, 1.0f, 3.0f, 4.0f};
		System.out.println("Maximum of 1.0f, 1.0f, 3.0f, 4.0f is : "+new TestMaximumGenerics<Float>(floatArr9).testMaximum());
		
		System.out.println("Three Strings :");
		System.out.println("Test case 1.1");
		// Test Case 1.1 maximum string at first position 
		String[] strArr1 = {"Tomato", "Peach", "Apple", "Banana"};
		System.out.println("Maximum of Tomato, Peach, Apple, Banana is : "+new TestMaximumGenerics<String>(strArr1).testMaximum());
		String[] strArr2 = {"Tomato", "Peach", "Banana", "Apple"};
		System.out.println("Maximum of Tomato, Peach, Banana, Apple is : "+new TestMaximumGenerics<String>(strArr2).testMaximum());
		String[] strArr3 = {"Tomato", "Peach", "Apple", "Apple"};
		System.out.println("Maximum of Tomato, Peach, Apple, Apple is : "+new TestMaximumGenerics<String>(strArr3).testMaximum());
		
		System.out.println("Test case 1.2");
		// Test Case 1.1 maximum number at first position 
		String[] strArr4 = {"Apple", "Tomato", "Peach", "Banana"};
		System.out.println("Maximum of Apple, Tomato, Peach, Banana is : "+new TestMaximumGenerics<String>(strArr4).testMaximum());
		String[] strArr5 = {"Banana", "Tomato", "Peach", "Apple"};
		System.out.println("Maximum of Banana, Tomato, Peach, Apple is : "+new TestMaximumGenerics<String>(strArr5).testMaximum());
		String[] strArr6 = {"Apple", "Tomato", "Peach", "Apple"};
		System.out.println("Maximum of Apple, Tomato, Peach, Apple is : "+new TestMaximumGenerics<String>(strArr6).testMaximum());
		
		System.out.println("Test case 1.3");
		// Test Case 1.1 maximum number at first position 
		String[] strArr7 = {"Apple", "Banana", "Peach", "Tomato"};
		System.out.println("Maximum of Apple, Banana, Peach, Tomato is : "+new TestMaximumGenerics<String>(strArr7).testMaximum());
		String[] strArr8 = {"Banana", "Apple", "Peach", "Tomato"};
		System.out.println("Maximum of Banana, Apple, Peach, Tomato is : "+new TestMaximumGenerics<String>(strArr8).testMaximum());
		String[] strArr9 = {"Apple", "Apple", "Peach", "Tomato"};
		System.out.println("Maximum of Apple, Apple, Peach, Tomato is : "+new TestMaximumGenerics<String>(strArr9).testMaximum());
	}
}
