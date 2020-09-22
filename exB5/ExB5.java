import java.util.Scanner;
public class ExB5 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String answer="N";
		
		do {
			System.out.println("Welcome!");
			System.out.println("Do you want to be greeted again (Y/N)");
		    answer = sc.nextLine().toUpperCase();
	    } while (answer.equals("Y"));
		
		sc.close();
	}
}