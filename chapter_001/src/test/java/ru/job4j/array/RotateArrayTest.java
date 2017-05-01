package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * RotateArrayTest.
 * @author mklimentiev
 * @version 1.0
 * @since 30.04.2017
*/
public class RotateArrayTest {
	/**
	 * Test rotate.
	*/
	@Test
	public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
		RotateArray rotateArray = new RotateArray();
		int[][] array = {{1, 2}, {4, 3}};
		int[][] expectedArray = {{4, 1}, {3, 2}};
		int[][] resultedArray = rotateArray.rotate(array);
		assertThat(resultedArray, is(expectedArray));
	}

	/**
	 * Test rotate.
	*/
	@Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
		RotateArray rotateArray1 = new RotateArray();
		int[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int[][] expectedArray1 = {{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
		int[][] resultedArray1 = rotateArray1.rotate(array1);
		assertThat(resultedArray1, is(expectedArray1));
    }
}