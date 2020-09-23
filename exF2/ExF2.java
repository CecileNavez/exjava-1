import java.io.IOException;

public class ExF2 {
	
	public static void main (String[] args) {
	
     try {	
		
		Instructor i1 = new Instructor("Sandy","Schillebeeckx",42,23,2000.0);
		
		i1.printSalaryHistory();
		
	 } catch (IOException ioe){
			System.out.println(ioe.getMessage());
	 } 
	 
	}
	
	
}