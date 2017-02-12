package ru.job4j;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;

/**
 * TriangleTest.
 *
 * @author mklimentiev
 * @since 12.02.2017
 * @version 1.0
 */

public class TriangleTest {
	/**
	 * Test triangle.
	 */
	@Test
	public void whenPassParametresToTheMethodTriangleThenFieldsOfTheClassTriangleInitialize() {
		Point point1 = new Point();
		Point point2 = new Point();
		Point point3 = new Point();

		point1.point(0.0d, 1.0d);
		point2.point(1.0d, 2.0d);
		point3.point(2.0d, 1.0d);

		Triangle triangle = new Triangle();
		triangle.triangle(point1, point2, point3);

		double result = triangle.a.x;
		assertThat(result, closeTo(0.0d, 0.00));
		result = triangle.a.y;
		assertThat(result, closeTo(1.0d, 0.00));

		result = triangle.b.x;
		assertThat(result, closeTo(1.0d, 0.00));
		result = triangle.b.y;
		assertThat(result, closeTo(2.0d, 0.00));

		result = triangle.c.x;
		assertThat(result, closeTo(2.0d, 0.00));
		result = triangle.c.y;
		assertThat(result, closeTo(1.0d, 0.00));
	}

	/**
	 * Test area.
	 */
	@Test
	public void whenPassTreePointsThenReturnAreaOfTheTriangle() {
		Point point1 = new Point();
		Point point2 = new Point();
		Point point3 = new Point();
		point1.point(1.0d, 0.0d);
		point2.point(1.0d, 1.0d);
		point3.point(2.0d, 1.0d);
		double result = area(point1, point2, point3);
		assertThat(result, is(closeTo(0.5d, 0.01)));
	}
}