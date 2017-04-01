package ru.job4j.max;

/**
 * Max.
 *
 * @author mklimentiev
 * @since 01.04.2017
 * @version 1.0
 */
public class Max {

	/**
	 * Maximum from two numbers.
	 * @param first -- the first parameter
	 * @param second -- the second parameter
	 * @return -- the maximum from the first parameter and the second parameter
	*/
	public int maxFromTwo(int first, int second) {
		return (first > second) ? first : second;
	}

	/**
	 * Maximum from three numbers.
	 * @param first -- the first parameter
	 * @param second -- the second parameter
	 * @param third -- the third parameter
	 * @return -- the maximum from the first parameter, the second parameter and the third parameter
	*/
	public int maxFromThree(int first, int second, int third) {
		return maxFromTwo(maxFromTwo(first, second), third);
	}
}