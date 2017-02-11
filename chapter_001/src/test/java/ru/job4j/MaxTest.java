package ru.job4j;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author mklimentiev
 * @since 11.02.2017
 * @version 1.0
 */
public class MaxTest {
	/**
	 * Test Max.
	 */
	@Test
	public void whenPassParametresThenReturnMaxFromThem() {
		Max max = new Max();
		int result = max.max(2, 1);
		assertThat(result, is(2));
	}
}
