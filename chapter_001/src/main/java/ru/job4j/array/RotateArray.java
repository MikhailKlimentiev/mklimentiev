package ru.job4j.array;

/**
 * RotateArray.
 *
 * @author mklimentiev
 * @version 1.0
 * @since 30.04.2017
*/
public class RotateArray {
	/**
	 * rotate.
	 * The method int[][] rotate(int[][] array) gets array, rotates it 90 degrees clockwise and returns turned array
	 * @param array of integers
	 * @return turned array
	*/
	public int[][] rotate(int[][] array) {
		for (int i = 0; i < array.length / 2; i++) {
			for (int j = i; j < array.length - 1 - i; j++) {
				int tmp = array[i][j];
				array[i][j] = array[array.length - j - 1][i];
				array[array.length - j - 1][i] = array[array.length - i - 1][array.length - j - 1];
				array[array.length - i - 1][array.length - j - 1] = array[j][array.length - i - 1];
				array[j][array.length - i - 1] = tmp;
			}
		}
		return array;
	}
}
