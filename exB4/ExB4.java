import java.util.Scanner;
public class ExB4 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your language code (NL/FR/...)");
		String language = sc.nextLine().toUpperCase();
		
		sc.close();
			
		switch (language){
			case "NL" : System.out.println("Goeiedag!"); break;
			case "FR" : System.out.println("Bonjour!"); break;
			case "EN" : System.out.println("Good day!"); break;
			default : System.out.println("Goeiedag, bonjour and good day!"); break;
		}
		
		
	}
}