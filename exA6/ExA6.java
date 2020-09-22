import java.util.HashMap;
import java.util.Scanner;

public class ExA6 {
	
	public static void main (String[] args) {
		
		HashMap<String,Integer> months = new HashMap<>();
		months.put("January",31);
		months.put("February",28);
		months.put("March",31);
		months.put("April",30);
		months.put("May",31);
		months.put("June",30);
		months.put("July",31);
		months.put("August",31);
		months.put("September",30);
		months.put("October",31);
		months.put("November",30);
		months.put("December",31);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Which month is it?");
		String month = sc.nextLine();
		
		System.out.println("What day is it?");
		int day = Integer.parseInt(sc.nextLine());
		
		sc.close();
				

		int daysInMonth = months.get(month);
		int numberOfDaysToGo=daysInMonth-day;				
		System.out.println( "There are still " + numberOfDaysToGo + " days to go this month.");

			

		
		
		
		
	}
}