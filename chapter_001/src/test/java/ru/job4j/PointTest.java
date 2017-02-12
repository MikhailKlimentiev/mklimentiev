package ru.job4j;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * PointTest.
 *
 * @author mklimentiev
 * @since 12.02.2017
 * @version 1.0
 */
public class PointTest {
	/**
	 * Test point.
	 */
	@Test
	public void whenPassParametresToThePointThenFieldsOfTheClassPointInitialize() {
		Point point1 = new Point();
		point1.point(0.0d, 1.0d);
		double result = point.x;
		assertThat(result, is(closeTo(0.0d, 0.00)));
		result = point.y;
		assertThat(result, is(closeTo(1.0d, 0.00)));
	}

	/**
	 * Test distanceTo.
	 */
	@Test
	public void whenPassParametresToThePointThenFieldsOfTheClassPointInitialize() {
		Point point1 = new Point();
		Point point2 = new Point();
		point1.point(0.0d, 1.0d);
		point2.point(1.0d, 2.0d);
		double result = distanceTo(point1, point2);
		assertThat(result, is(closeTo(1.4142135623731d, 0.01)))
	}
}