package ru.job4j;

/**
 * Max.
 *
 * @author mklimentiev
 * @since 11.02.2017
 * @version 1.0
 */
public class Max {

	/**
	 * Maximum.
	 *
	 * @param first parameter
	 * @param second parameter
	 * @return maximum from first and second
	 */
	public int max(int first, int second) {
		int maximum = (first > second) ? first : second;
		return maximum;
	}
}
