package test.arrays_and_string;

import static org.junit.Assert.*;
import main.arrays_and_string.C1_7;

import org.junit.Assert;
import org.junit.Test;

public class C1_7Test {

	@Test
	public void test() {
		int[][] matrix = new int[][] {{1, 0, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int[][] matrix_a = new int[][] {{0, 0, 0, 0}, {5, 0, 7, 8}, {9, 0, 11, 12}, {13, 0, 15, 16}};

		Assert.assertArrayEquals(C1_7.checkMatrix(matrix), matrix_a);
	}

}
