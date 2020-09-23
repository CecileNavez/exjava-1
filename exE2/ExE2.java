public class ExE2 {
	
	public static void main (String[] args) {
	

		String word1 = "racecar";
		boolean b = Palindrome.isPalindrome(word1);
		System.out.println(word1 + " is" + (b?"": " not") + " a palindrome");
		
		String word2 = "palindrome";
		b=Palindrome.isPalindrome(word2);
		System.out.println(word2 + " is" + (b?"": " not") + " a palindrome");
		
		String[] words = {"racecar","palindrome","error","wow","blabla","tacocat"};
		
		int count = Palindrome.countNumberOfPalindromes(words);
		System.out.println("There are " + count + " palindromes in the array.");
	
	}
	
	
}