import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.IOException;

public class ExF1 {
	
	public static void main (String[] args) {
		
	  Path path = Paths.get("instructors.txt");
	  try (BufferedReader br = Files.newBufferedReader(path)){
		
		Course c1 = new Course("Java",3,450.0);
		c1.setPriorKnowledgeRequired(true);
				
		ArrayList<String> instructors= new ArrayList<>();		
		String name = null;
		while ((name=br.readLine())!= null){
		   c1.addInstructor(name);
		}
		
		
		double totalPrice = c1.calculatePrice();
				
		c1.printInfo();
		System.out.println("There are " + c1.getInstructors().size() + " instructors for this course.");
		
		String label;
		if (totalPrice < 500) {
			label = "CHEAP";
		} else if (totalPrice >= 500 && totalPrice <=1500) {
			label = "OK";
		} else {
			label = "EXPENSIVE";
		}
		
		System.out.println("That price is " + label);
		
	  } catch (IOException ioe){
		  System.out.println(ioe.getMessage());
	  }
	}
	 
	
	
}