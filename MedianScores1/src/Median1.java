import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class Median1 {

	public static void main(String[] args) {
	
		Scanner s = new Scanner(System.in);
		List<Integer> myArray = new ArrayList<Integer>();
		 int p = 0;
		 while(p<5000) {
	    System.out.println("Enter the score that is to be added:");
		 int score = s.nextInt();
		 myArray.add(score);
		 int[] array = new int[myArray.size()];
			for (int i=0; i<array.length; i++) array[i] = myArray.get(i);
			
		 double median = median(array);
		
	      System.out.println("Median mark is : " + Math.round(median));
	      
	        System.out.println(Arrays.toString(array)); 
		 } p++;
	}

	private static double median(int[] array) {
		Arrays.sort(array);
	     double median;

	     int totalScores = array.length;

	     if (totalScores % 2 == 0) {
	        int middleScores = array[totalScores / 2] + array[totalScores / 2 - 1];

	        median = ((double) middleScores) / 2;
	     } else {
	       
	        median = (double) array[array.length / 2];
	        

	     }return median;
	     
	}
}



