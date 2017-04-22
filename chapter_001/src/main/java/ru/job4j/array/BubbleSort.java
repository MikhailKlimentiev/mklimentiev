package ru.job4j.array;

/**
 * BubbleSort.
 *
 * @author mklimentiev
 * @version 1.0
 * @since 19.04.2017
*/
public class BubbleSort {
	/**
	 * sort.
	 * The method int[] sort(int[] array) get array sort it from smallest to largest and return sorted array
	 * @param array consisting of numbers of integer type
	 * @return sorted array
	*/
	public int[] sort(int[] array) {
		for (int i = 1; i < array.length; i++) {
			for (int j = array.length - 1; j >= i; j--) {
				if (array[j] < array[j - 1]) {
					int temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
			}
		}
		return array;
	}
}