package example;

import java.util.LinkedHashSet;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		String input = "programming";
		LinkedHashSet<Character> set = new LinkedHashSet<>();
		
		for(char ch : input.toCharArray()) {
			set.add(ch);
		}
		
		StringBuilder result = new StringBuilder();
		
		for(char ch : set) {
			result.append(ch);
		}
		
		System.out.println("String after removing duplicates: " + result.toString());
		
	}

}
