package pastexam.codewriting;

public class Q08 {

	/*
	 * We wish to write a program that will transpose a 2D array. 
	 * Transposition occurs by making the rows of an array 
	 * become the columns and vice versa. For example:
	 *
	 *	1 2 3
	 *	4 5 6
 	 *
	 *	transposes to
	 *
	 *	1 4
	 *	2 5
	 *	3 6
	 *
	 * Complete the code below to transpose the given 
	 * array. You should create a new array 
	 * of the appropriate size and then fill it with 
	 * the appropriate values. Your code should work regardless 
	 * of the size of this array or the values that it contains.
	 */
	
	public static void main(String[] args) {
		
		//Actual values given here for practice, but
		//your solution should work for arrays of
		//any size! Add and subtract some rows
		//and columns to make sure your solution
		//works properly.
		int[][] data = { {1, 2, 3, 4, 5, 6}, {7, 8, 9, 10, 11, 12} }; 
		int[][] data2 = new int[data[0].length][data.length];
		
		for (int i = 0; i < data[0].length; i++) {
			for (int j = 0; j < data.length; j++) {
				data2[i][j] = data[j][i];
			}
		}
		
		for (int i = 0; i < data2.length; i++) {
        	for (int j = 0; j < data2[0].length; j++) {
            System.out.print(data2[i][j] + " ");
        }
        System.out.println();
    }
	}
}
