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
	 * @return maximum is value type int, maximum from first, second parameters
	 */
	public int max(int first, int second) {
		int maximum = (first > second) ? first : second;
		return maximum;
	}

	/**
	 * Maximum from three numbers.
	 *
	 * @param first parameter
	 * @param second parameter
	 * @param third parameter
	 * @return maximumFromThree is value type int, maximum from first, second and third parameters
	 */
	public int maxFromThree(int first, int second, int third) {
		int maximumFromThree = max(max(first, second), max(first, third));
		return maximumFromThree;
	}
}
