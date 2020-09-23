public class Palindrome {
	
	
	public static boolean isPalindrome(String word){
		
		int length = word.length();
		
		int middle = length/2;
		
		boolean isPal=true;
		
		for (int i=0; i<=middle; i++){
			if (word.charAt(i)!=word.charAt(length-i-1)){
				isPal=false;
				break;
			}
				
		}
		return isPal;
	}
	
	public static int countNumberOfPalindromes(String[] palindromes){
		int count=0;
		
		for (String word:palindromes){
			if (isPalindrome(word)) {count++;};
		}
		
		return count;
	}
	
}