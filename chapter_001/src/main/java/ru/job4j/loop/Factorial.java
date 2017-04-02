package ru.job4j.loop;

/**
 * Factorial.
 *
 * @author mklimentiev
 * @version 1.0
 * @since 02.04.2017
*/
public class Factorial {

	/**
	 * calc.
	 * The method calc(int n) calculates and returns the factorial of the number passed as a parameter;
	 * @param n -- the first parameter;
	 * @return -- the the factorial of the number passed as a parameter;
	*/
	public int calc(int n) {
		int factorial = 1;
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
}