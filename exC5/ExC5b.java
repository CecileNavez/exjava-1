import java.util.ArrayList;
import java.util.Scanner;

public class ExC5b {
	
	public static void main (String[] args) {

		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter the course title.");
		String title = sc.nextLine();
		boolean daysCorrect=false;
		boolean priceCorrect=false;
		
		System.out.println("Enter the number of days for this course.");
		int numberOfDays=0;
		while (!daysCorrect) {
		  try {
		    numberOfDays = Integer.parseInt(sc.nextLine());
			daysCorrect=true;
		  } catch (NumberFormatException nfe){
		      System.out.println("Please enter a whole number. Try again.");
	      }		  
	    } 
		
		System.out.println("What is the price per day?");
		double pricePerDay =0.0;
		while (!priceCorrect){
		 try {
		  pricePerDay = Double.parseDouble(sc.nextLine());
		  priceCorrect=true;
		 } catch (NumberFormatException nfe){
		  System.out.println("Please enter a correct number. Try again, you know the drill...");
	     }
		}
		
		sc.close();
		
		boolean priorKnowledgeRequired = true;
		
				
		ArrayList<String> instructors= new ArrayList<>();
		instructors.add("Sandy");
		instructors.add("Gie");
		
		System.out.println("");
		
		double totalPrice = calculatePrice(numberOfDays, pricePerDay, priorKnowledgeRequired );
				
		printInfo(title, numberOfDays, pricePerDay, priorKnowledgeRequired );
		System.out.println("There are " + instructors.size() + " instructors for this course.");
		
		String label;
		if (totalPrice < 500) {
			label = "CHEAP";
		} else if (totalPrice >= 500 && totalPrice <=1500) {
			label = "OK";
		} else {
			label = "EXPENSIVE";
		}
		
		System.out.println("That price is " + label);
		
	  
	}
	 
	public static void printInfo(String title, int numberOfDays, double pricePerDay,boolean priorKnowledgeRequired ){
	   double totalPrice = calculatePrice(numberOfDays, pricePerDay, priorKnowledgeRequired );
	   System.out.println("The " + title + " course takes " + numberOfDays + " days and costs " + totalPrice + " euros. \nPrior knowledge required: " + priorKnowledgeRequired );
	}
	
	public static double calculatePrice(int numberOfDays, double pricePerDay,boolean priorKnowledgeRequired ){
		double totalPrice = numberOfDays*pricePerDay;
		if (!(numberOfDays>3 && priorKnowledgeRequired)) {
			totalPrice*=1.21;
		}
		return totalPrice; 
	}
	
	/*public static int enterDays(Scanner sc){
		int days=0;
		System.out.println("Enter the number of days for this course.");
		try {
		 if (sc.hasNextLine()){
			 System.out.println("Reading next line.");
			 days = Integer.parseInt(sc.nextLine());
		 }
		 System.out.println("numberOfDays in try:"+days);
		}  catch (NumberFormatException nfe){
		  System.out.println("Please enter a whole number. Try again.");
		  enterDays(sc);
	    }
		System.out.println("numberOfDays returned:"+days);
		return days;
	} 
	
	public static double enterPrice(Scanner sc){
		System.out.println("What is the price per day?");
		double pricePerDay =0.0;
		try {
		 pricePerDay = Double.parseDouble(sc.nextLine());
		 System.out.println("pricePerDay:"+pricePerDay);
		}  catch (NumberFormatException nfe){
		  System.out.println("Please enter a correct number. Try again, you know the drill...");
		  enterPrice(sc);
	    }
		return pricePerDay;
	}*/
	
}