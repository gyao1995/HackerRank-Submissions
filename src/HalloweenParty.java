import java.util.*;

public class HalloweenParty {
//Submission for HackerRank Challenge: Halloween Party, found at: 
//	https://www.hackerrank.com/challenges/halloween-party

	public static void main( String[] args ){
		int testNum;
		ArrayList<Long> cutNums = new ArrayList<Long>();
		
		Scanner input = new Scanner(System.in);
		testNum = input.nextInt();
		if( testNum < 1 | testNum > 10 ) {
			input.close();
			return;
		}
		
		
		while( input.hasNextInt() ){
			long num = input.nextInt();
			if( num < 2 | num > Math.pow(10, 7) ){
				input.close();
				return;
			}
			cutNums.add( num );
		}
		
		input.close();
		
		for( int i = 0; i < cutNums.size(); i++ ){
			Long cutNum = cutNums.get(i);
			long row = cutNum/2;
			long column = cutNum - row;
			long pieces = row * column;
			System.out.println(pieces);
		}
	}
}
