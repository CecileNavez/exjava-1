import java.util.ArrayList;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class Course {
	
	private String title;
	private int numberOfDays;
	private double pricePerDay;
	private boolean priorKnowledgeRequired;
	private ArrayList<Instructor> instructors = new ArrayList<>();
	
	public Course(String title,int numberOfDays,double pricePerDay){
		this.title=title;
		this.numberOfDays=numberOfDays;
		this.pricePerDay=pricePerDay;
	}
	
	public void setTitle(String title){
		this.title=title;
	}
	
	public String getTitle(){
		return title;
	}
	
	public void setNumberOfDays(int numberOfDays){
		this.numberOfDays=numberOfDays;
	}
	
	public int getNumberOfDays(){
		return numberOfDays;
	}
	
	public void setPricePerDay(double pricePerDay){
		this.pricePerDay=pricePerDay;
	}
	
	public double getPricePerDay(){
		return pricePerDay;
	}
	
	public void setPriorKnowledgeRequired(boolean priorKnowledgeRequired){
		this.priorKnowledgeRequired=priorKnowledgeRequired;
	}
	
	public boolean isPriorKnowledgeRequired(){
		return priorKnowledgeRequired;
	}
	
	public void setInstructors(ArrayList<Instructor> instructors){
		this.instructors=instructors;
	}
	
	public ArrayList<Instructor> getInstructors(){
		return instructors;
	}
	
	public void addInstructor(Instructor instructor){
		instructors.add(instructor);
	}
	
	public void removeInstructor(Instructor instructor){
		instructors.remove(instructor);
	}
	
	public void printInfo() throws IOException{
	   BufferedWriter bw = Files.newBufferedWriter(Paths.get("printing.txt"));
	   double totalPrice = this.calculatePrice();
	   bw.write("The " + title + " course takes " + numberOfDays + " days and costs " + totalPrice + " euros. \nPrior knowledge required: " + priorKnowledgeRequired );
	   String label;
		if (totalPrice < 500) {
			label = "CHEAP";
		} else if (totalPrice >= 500 && totalPrice <=1500) {
			label = "OK";
		} else {
			label = "EXPENSIVE";
		}		
	   bw.write("\nThat price is " + label);
	   bw.write("\nThere are " + instructors.size() + " instructors for this course.");
	   bw.write("\nThe instructors are:");
	   for (Instructor i: instructors){
		   bw.write("\n"+i.getFirstName() + " " + i.getLastName());
	   }		
	   bw.close();
	   System.out.println("info is written to file");
	}
	
	public double calculatePrice(){
		double totalPrice = numberOfDays*pricePerDay;
		if (!(numberOfDays>3 && priorKnowledgeRequired)) {
			totalPrice*=1.21;
		}
		return totalPrice; 
	}
	
	
}