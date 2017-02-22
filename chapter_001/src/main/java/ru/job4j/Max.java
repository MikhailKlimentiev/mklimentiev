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
	 * Maximum from two numbers.
	 *
	 * @param first parameter
	 * @param second parameter
	 * @return value type int, maximum from first, second parameters
	 */
	public int max(int first, int second) {
		return (first > second) ? first : second;
	}

	/**
	 * Maximum from three numbers.
	 *
	 * @param first parameter
	 * @param second parameter
	 * @param third parameter
	 * @return value type int, maximum from first, second and third parameters
	 */
	public int maxFromThree(int first, int second, int third) {
		return max(max(first, second), max(first, third));
	}
}
