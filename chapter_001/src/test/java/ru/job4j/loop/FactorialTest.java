package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * FactorialTest.
 * @author mklimentiev
 * @version 1.0
 * @since 01.04.2017
*/
public class FactorialTest {

	/**
	 * Test calc.
	*/
	@Test
	public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
		Factorial factorial = new Factorial();
		int result = factorial.calc(5);
		assertThat(result, is(120));
	}

	/**
	 * Test calc.
	*/
	@Test
	public void whenCalculateFactorialForZeroThenOne() {
		Factorial factorial = new Factorial();
		int result = factorial.calc(0);
		assertThat(result, is(1));
	}
}
