package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * PointTest.
 *
 * @author mklimentiev
 * @since 25.03.2017
 * @version 2.0
 */
public class PointTest {
	/**
	 * Test is.
	 */
	@Test
	public void whenPassParametresToThePointThenCompareCalculatedOrdinateWithY() {
		Point point = new Point(1, 7);
		boolean result = point.is(2, 5);
		assertThat(result, is(true));
		result = point.is(2, 4);
		assertThat(result, is(false));
	}
}