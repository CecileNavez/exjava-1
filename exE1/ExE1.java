import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.IOException;

public class ExE1 {
	
	public static void main (String[] args) {
	
     try {	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String firstName = sc.nextLine();
		
		System.out.println("What is your last name?");
		String lastName = sc.nextLine();
		
		System.out.println("What is your age?");
		int age = Integer.parseInt(sc.nextLine());
		
		sc.close();
		
		int startAge = 23;
		double startSalary = 2000.0;
		
		printSalaryHistory(firstName, age, startAge, startSalary );
		
	 } catch (IOException ioe){
			System.out.println(ioe.getMessage());
	 } catch (NumberFormatException nfe){
			System.out.println("Please pass a correct value for your age. Start again...");
	 }
	}
	
	public static void printSalaryHistory(String firstName, int age, int startAge, double startSalary ) throws IOException{
		 int seniority =0;		 
		 double salary=startSalary;
		 BufferedWriter bw = Files.newBufferedWriter(Paths.get("salaryhistory.txt"));
		 for (int loopAge=startAge; loopAge<=age ; loopAge+=5) {
			if (loopAge!=startAge) salary=salary*1.03;
			bw.write("Salary of " + firstName + " at " + loopAge + " is " + salary + ".\n");	
			if (seniority<35){
			   seniority+=5;
			} else {
				bw.write("Maximum salary reached.");
				break;
			}
	     }
		 bw.close();
		 System.out.println("salaryhistory.txt was created");
	}
}