package java_practice;

import java.util.Arrays;

public class Q15 {
	public static void main(String[] args) {
		String[] words = {"apple", "banana", "cat", "dog", "elephant"};
		
		Arrays.stream(words)
		.filter(word -> word.length() >= 5)
		.forEach(System.out::println);
	}
}
