package ru.job4j.array;

/**
 * Turn.
 *
 * @author mklimentiev
 * @version 1.0
 * @since 16.04.2017
*/
public class Turn {
	/**
	 * back.
	 * The method int[] back(int[] array) get array turn it and return turned array
	 * @param array numbers of integer type
	 * @return -- turned array
	*/
	public int[] back(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
			int temp = array[i];
			array[i] = array[array.length - 1 - i];
			array[array.length - 1 - i] = temp;
		}
		return array;
	}
}





