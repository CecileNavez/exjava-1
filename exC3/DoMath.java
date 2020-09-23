public class DoMath {
	
	public static double calculateAverage(int[] values){
		
		double total = 0;
		for (int val : values){
			total+=val;
		}
        double average = total/values.length;
		
		return average;
		
	}
	
}