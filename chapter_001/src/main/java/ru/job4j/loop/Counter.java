package ru.job4j.loop;

/**
 * Counter.
 *
 * @author mklimentiev
 * @version 1.0
 * @since 01.04.2017
*/
public class Counter {

	/**
	 * add.
	 * The method add(int start, int finish) calculates and returns the sum of even numbers in the range from start to finish
	 * @param start -- the first parameter
	 * @param finish -- the second parameter
	 * @return -- the sum of even numbers in the range from start to finish
	*/
	public int add(int start, int finish) {
		int sumOfEvenNumbers = 0;
		for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
				sumOfEvenNumbers += i;
			}
		}
		return sumOfEvenNumbers;
	}
}