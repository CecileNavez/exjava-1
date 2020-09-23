import java.util.Scanner;
public class ExC4 {
	
	public static void main (String[] args) {		
		welcomeRecursively();		
	}
	
	public static void welcomeRecursively(){	
        Scanner sc = new Scanner(System.in);	
		System.out.println("Welcome!");
		System.out.println("Do you want to be greeted again (Y/N)");
		String answer = sc.nextLine().toUpperCase();
		if (answer.equals("Y")) {
			welcomeRecursively();
		}
		sc.close();	 
	}
}