package ru.job4j.array;

import java.util.Arrays;

/**
 * ArrayDuplicate.
 *
 * @author mklimentiev
 * @version 1.0
 * @since 30.04.2017
*/
public class ArrayDuplicate {
	/**
	 * remove.
	 * The method String[] remove(String[] array) gets array sorts duplicates and returns array without duplicates
	 * @param array of strings with duplicates
	 * @return array of strings without duplicates
	*/
	public String[] remove(String[] array) {

		int count = 0;
		String temp = "";

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length - count; j++) {
				if (array[i].equals(array[j])) {
					temp = array[j];
					array[j] = array[array.length - 1 - count];
					array[array.length - 1 - count] = temp;
					count++;
				}
			}
		}
		return Arrays.copyOf(array, array.length - count);
	}
}

