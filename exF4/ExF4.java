import java.util.ArrayList;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedReader;
import java.io.IOException;

public class ExF4 {
	
	public static void main (String[] args) {
		
	  try {
	    Instructor i1 = new Instructor("Sandy","Schillebeeckx",42,23,2000.0);		
		i1.printSalaryHistory();
		
		Instructor i2 = new Instructor("Gie","Indesteege",63,25,1900.0);		
		i2.printSalaryHistory();
		
		Course c1 = new Course("Java",3,450.0);
		c1.setPriorKnowledgeRequired(true);
		c1.addInstructor(i1);
		c1.addInstructor(i2);
		
		double totalPrice = c1.calculatePrice();
				
		c1.printInfo();
		
	  } catch (IOException ioe){
		  System.out.println(ioe.getMessage());
	  }
	}
	 
	
	
}