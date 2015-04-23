package main.arrays_and_string;

import java.util.Arrays;

public class C1_6 {
	
	public static int[][] rotate(int[][] matrix, int n) {
	    for (int layer = 0; layer < n / 2; ++layer) {
	        int first = layer;
	        int last = n - 1 - layer;
	        for(int i = first; i < last; ++i) {
	            int offset = i - first;
	            int top = matrix[first][i]; // save top
	            System.out.println(last);
	            // left -> top
	            matrix[first][i] = matrix[last-offset][first];          

	            // bottom -> left
	            matrix[last-offset][first] = matrix[last][last - offset]; 

	            // right -> bottom
	            matrix[last][last - offset] = matrix[i][last]; 

	            // top -> right
	            matrix[i][last] = top; // right <- saved top
	        }
	    }
	    return matrix;
	}
	
	//method2: create an new array to hold the result. 
	public static int[][] rotateArray(int[][] matrix) {
		if (matrix == null || matrix.length == 0) 
			return null;
		
		int m = matrix.length;
		int temp[][] = new int[m][m];
		int temp2[][] = new int[m][m];
		int temp3[][] = new int[m][m];
		int temp4[][] = new int[m][m];

		
		for (int i = 0; i < m; i++) {
			for ( int j = 0; j < m; j++) {
				temp[j][m-i-1] = matrix[i][j];   //clockwise retate 90 degrees
				temp2[m-i-1][j] = matrix[i][j];  //clockwise rotate 180 degrees
				temp3[m-j-1][i] = matrix[i][j];  //clockwise rotate 270 degrees
			}
		}
		
		for (int i = 0; i < m; i++) {
			for ( int j = 0; j < m; j++) {
				matrix[i][j] = temp[i][j];
			}
		}
		
		return matrix;

        
	}

}
