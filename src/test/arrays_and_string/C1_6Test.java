package test.arrays_and_string;

import static org.junit.Assert.*;
import main.arrays_and_string.C1_6;

import org.junit.Assert;
import org.junit.Test;

public class C1_6Test {

	@Test
	public void test() {
		int[][] matrix = new int[][] {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int[][] matrix_a = new int[][] {{13, 9, 5, 1}, {14, 10, 6, 2}, {15, 11, 7, 3}, {16, 12, 8, 4}};

		Assert.assertArrayEquals(C1_6.rotate(matrix, 4), matrix_a);
		C1_6.rotateArray(matrix);
		}

}
