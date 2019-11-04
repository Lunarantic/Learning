package exercise3;

import util.IOUtil;

public class Program6 {

	public static void main(String[] args) {
		IOUtil.setScanner();
		
		System.out.println("Enter a string to count it's vowel:\n");
		int vowels = numOfVowels(IOUtil.getStringLine());
		System.out.println("\nNumber of vowels in this string is " + vowels);
				
		IOUtil.closeScanner();
	}
	
	public static int numOfVowels(String input) {
		int count = 0;
		
		for (int i = 0; i < input.length(); ++i) if (isVowel(input.charAt(i))) ++count;
		
		return count;
	}
	
	public static boolean isVowel(char c) {
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			return true;
		default:
			return false;
		}
	}
}
