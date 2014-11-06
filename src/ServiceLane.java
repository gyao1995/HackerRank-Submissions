import java.util.*;

public class ServiceLane {
//Submission for HackerRank Challenge: Service Lane, found at: 
//	https://www.hackerrank.com/challenges/service-lane
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int segmentNum = input.nextInt(); //length of freeway
		int testNum = input.nextInt(); //number of test cases
	
		Integer[] segmentWidth = new Integer[segmentNum];
		String s = input.nextLine(); //rest of line 1, empty
		s = input.nextLine(); //Space-separated integers representing segmentWidth[]
		Scanner line = new Scanner(s); //
		for( int i = 0; i < s.length(); i++ ){
			if( line.hasNextInt() )
				segmentWidth[i] = line.nextInt();
		}
		line.close();

		Integer[] test = new Integer[testNum*2];
		String t = input.nextLine();
		while( input.hasNextLine() )
			t = t.concat(" ").concat(input.nextLine() ); //Concatenate all test cases
		line = new Scanner(t);
		int k = 0;
		while( line.hasNext() ) {
			test[k] = line.nextInt();
			k++;
		}
		line.close();
		input.close();
		
		for( int m = 0, n = 0; n < testNum; m = m + 2, n++){
			int i = test[m]; // index of entry
			int j = test[m+1]; // index of exit
			
			if( j > i & i >= 0 & j - i <= 1000){ 
			//A maximum of 1000 segments can be passed
				
				int largestVehicle = 3;
				while( i <= j ){
					if( largestVehicle > segmentWidth[i] & segmentWidth[i] <= 3 & segmentWidth[i] > 0 )
						largestVehicle = segmentWidth[i];
					i++;
				}
				System.out.println(largestVehicle);
			}
			else System.out.println("Index of exit must be greater than index of entry.\nIndex of entry must be greater than or equal to 0.\nA maximum of 1000 segments can be passed.");
		}
	}
}
