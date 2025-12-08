package pastexam.codewriting;

public class Q10 {

	/*
	 * We wish to write a program that will compute and 
	 * print the sum of both diagonals of a square 2D array. 
	 * For example, if you were given:
	 * 
	 * 		1 2 3
	 * 		4 5 6
	 * 		7 8 9
	 * 
	 * then your program should print 30 which is (1 + 5 + 9) + (3 + 5 + 7).
	 * 
	 * Complete the code below to compute the sum of the diagonals 
	 * the given array. Your code should work regardless of the size of
	 * this array or the values that it contains, though you may assume 
	 * that the given array will always besquare (number of rows 
	 * is equal to number of columns).
	 */
	
	public static void main(String[] args) {
		int[][] data = {{1, 2, 3}, 
                 		{4, 5, 6}, 
                 		{7, 8, 9} };

		int sum = 0;
		int n = data.length;

		for (int i = 0; i < n; i++) {
    		sum += data[i][i];            // main diagonal
    		sum += data[i][n - 1 - i];    // other diagonal
		}

	System.out.println(sum);

	}
}
