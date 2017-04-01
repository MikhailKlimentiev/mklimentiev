package ru.job4j.calculator;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Test.
 * @author mklimentiev
 * version 1.0
 * since 10.02.2017
*/
public class CalculatorTest {

	/**
	 * Test add.
	*/
	@Test
	public void whenAddThenFirstSummateSecond() {
		Calculator calc = new Calculator();
		calc.add(1, 1);
		double result = calc.getResult();
		assertThat(result, is(2d));
	}

	/**
	 * Test subtract.
	*/
	@Test
	public void whenSubtractThenSecondSubtractFromFirst() {
		Calculator calc = new Calculator();
		calc.subtract(1, 1);
		double result = calc.getResult();
		assertThat(result, is(0d));
	}

	/**
	 * Test div.
	*/
	@Test
	public void whenDivisionThenFirstDivideOnSecond() {
		Calculator calc = new Calculator();
		calc.div(1, 1);
		double result = calc.getResult();
		assertThat(result, is(1d));
	}

	/**
	 * Test multiple.
	*/
	@Test
	public void whenMultipleThenFirstMultipleSecond() {
		Calculator calc = new Calculator();
		calc.multiple(1, 1);
		double result = calc.getResult();
		assertThat(result, is(1d));
	}
}