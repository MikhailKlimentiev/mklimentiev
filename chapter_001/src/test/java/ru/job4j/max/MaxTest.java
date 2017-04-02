package ru.job4j.max;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * MaxTest.
 * @author mklimentiev
 * @version 2.0
 * @since 01.04.2017
*/
public class MaxTest {

	/**
	 * Test maxFromTwo.
	*/
	@Test
	public void whenPassFirstAndSecondThenReturnMaxOfThem() {
		Max max1 = new Max();
		int result1 = max1.maxFromTwo(1, 2);
		assertThat(result1, is(2));

		Max max2 = new Max();
		int result2 = max2.maxFromTwo(0, 1);
		assertThat(result2, is(1));
	}

	/**
	 * Test maxFromThree.
	*/
	@Test
	public void whenPassFirstSecondThirdParametresThenReturnMaxOfThem() {
		Max max3 = new Max();
		int result3 = max3.maxFromThree(1, 2, 6);
		assertThat(result3, is(6));

		Max max4 = new Max();
		int result4 = max4.maxFromThree(0, 1, 0);
		assertThat(result4, is(1));
	}
}



