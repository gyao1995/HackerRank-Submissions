import java.util.*;


public class UtopianTree {
//Submission for HackerRank Challenge: Service Lane, found at: 
//	https://www.hackerrank.com/challenges/utopian-tree
	
	public static void main(String[] args){
		ArrayList<Integer> cycleNums = new ArrayList<Integer>(); //each integer in array represents number of cycles in the test case
		
		Scanner input = new Scanner(System.in);
		int testNum = input.nextInt();
		if (testNum < 1 | testNum > 10){
			System.out.println("Number of test cases must be between 1 and 10 inclusive");
			input.close();
			return;
		}
		while( input.hasNextInt() )
			cycleNums.add( input.nextInt() );
		
		for( Integer cycleNum : cycleNums ){
			int height = 1;
			for( int cycle = 1; cycle <= cycleNum; cycle++ ){
				if( cycle % 2 != 0 ) height = height * 2;
				else height = height + 1;
			}
			System.out.println(height);
		}
		
		input.close();
	}
}
