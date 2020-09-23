import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.BufferedWriter;
import java.io.IOException;

public class Instructor {
	
	private String firstName;
	private String lastName;
	private int age;
	private int startAge;
	private double startSalary;
	
	public Instructor(String firstName,String lastName,int age,int startAge,double startSalary){
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
		this.startAge=startAge;
		this.startSalary=startSalary;
	}
	
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName=lastName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public void setAge(int age){
		this.age=age;
	}
	
	public int getAge(){
		return age;
	}
	
	
	public int getStartAge(){
		return startAge;
	}
	
	public void setStartAge(int startAge){
		this.startAge=startAge;
	}
	
	public void setStartSalary(double startSalary){
		this.startSalary=startSalary;
	}
	
	public double getStartSalary(){
		return startSalary;
	}
	
	public void printSalaryHistory() throws IOException{
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