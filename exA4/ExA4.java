import java.util.ArrayList;

public class ExA4 {
	
	// run with java ExA4 Java 2 432.45
	public static void main (String[] args) {
		
		String title = args[0];
		int numberOfDays = Integer.parseInt(args[1]);
		double pricePerDay = Double.parseDouble(args[2]);
		boolean priorKnowledgeRequired = false;
		
		
		System.out.println("The " + title + " course takes " + numberOfDays + " days and costs " + pricePerDay + " euros per day. \nPrior knowledge required: " + priorKnowledgeRequired );
		
		ArrayList<String> instructors= new ArrayList<>();
		instructors.add("Sandy");
		instructors.add("Gie");
		
		System.out.println("There are " + instructors.size() + " instructors for this course.");
		
		double totalPrice = numberOfDays*pricePerDay*1.21;
		System.out.println("The total price is " + totalPrice + " euro.");
		
	}
}