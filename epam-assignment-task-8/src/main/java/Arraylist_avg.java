import java.util.List;
import java.util.ArrayList;
import java.util.IntSummaryStatistics;
public class Arraylist_avg {
	
	//general method for calculating average of an list of integers.
	/*private static double calculateAverage(List <Integer> nums) {
		int total = 0;
	    int avg=0;
	    for(int i = 0; i < nums.size(); i++)
	    {
	        total += nums.get(i);
	        avg = total / nums.size();
	       
		  }
		return avg;
		 
		}*/
	
		public static void main(String args[])
		{
			
		ArrayList <Integer> nums = new ArrayList<Integer>();
		nums.add(10);
		nums.add(11);
		nums.add(12);
		nums.add(13);
		nums.add(14);
		nums.add(15);
		//double result=calculateAverage(nums);
		//System.out.print(result);
		
		
	//calculating sum and average using java8 stream and lambdas. 
		IntSummaryStatistics stats = nums.stream() .mapToInt((x) -> x) .summaryStatistics();
        System.out.println("The sum is:"+stats.getSum());
        System.out.println("The average is: "+stats.getAverage());
		
		}
		
		

	}
