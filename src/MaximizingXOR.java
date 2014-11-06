import java.util.*;

public class MaximizingXOR {
	
	public static void main( String[] args ){
	
		Scanner input = new Scanner(System.in);
		int L = input.nextInt(); //lower bound
		int R = input.nextInt(); //upper bound
		
		input.close();
		
		if( L < 0 | R > 1000 | R < L ){
			System.out.println("L must be greater than or equal to 0, R must be less than or equal to 1000 and greater than or equal to L.");
			return;
		}
	
		int maxVal = 0;
		for( int i = L; i <= R; i++ ){
			for (int j = L; j <= R; j++){
			//loop through all pairs between L and R
				if( maxVal < (i ^ j) )
					maxVal = i ^ j;
			}
		}
		System.out.println(maxVal);
	}
}
