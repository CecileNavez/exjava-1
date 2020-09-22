import java.util.ArrayList;

public class ExA2 {
	
	public static void main (String[] args) {
		
		String title = "Java Programming";
		int numberOfDays = 2;
		double pricePerDay = 450.5;
		boolean priorKnowledgeRequired = false;
		
		
		System.out.println("The " + title + " course takes " + numberOfDays + " days and costs " + pricePerDay + " euros per day. \nPrior knowledge required: " + priorKnowledgeRequired );
		
		ArrayList<String> instructors= new ArrayList<>();
		instructors.add("Sandy");
		instructors.add("Gie");
		
		System.out.println("There are " + instructors.size() + " instructors for this course.");
		
		
	}
}