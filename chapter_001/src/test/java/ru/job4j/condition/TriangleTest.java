package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.hamcrest.core.Is.is;

/**
 * TriangleTest.
 *
 * @author mklimentiev
 * @since 26.03.2017
 * @version 2.0
 */
public class TriangleTest {
	/**
	 * Test area.
	 */
	@Test
	public void whenPassTreePointsThenReturnAreaOfTheTriangle() {
		Point a = new Point(1, 2);
		Point b = new Point(1, 3);
		Point c = new Point(3, 5);
		Triangle triangle1 = new Triangle();
		triangle1.triangle(a, b, c);
		double result1 = triangle1.area();
		assertThat(result1, is(closeTo(1.00d, 0.01)));

		Point d = new Point(1, 1);
		Point e = new Point(1, 1);
		Point f = new Point(3, 5);
		Triangle triangle2 = new Triangle();
		triangle2.triangle(d, e, f);
		double result2 = triangle2.area();
		assertThat(result2, is(closeTo(101.0d, 0.01)));

		Point g = new Point(1, 1);
		Point h = new Point(3, 5);
		Point i = new Point(1, 1);
		Triangle triangle3 = new Triangle();
		triangle3.triangle(g, h, i);
		double result3 = triangle3.area();
		assertThat(result3, is(closeTo(102.0d, 0.01)));

		Point j = new Point(3, 5);
		Point k = new Point(1, 1);
		Point l = new Point(1, 1);
		Triangle triangle4 = new Triangle();
		triangle4.triangle(j, k, l);
		double result4 = triangle4.area();
		assertThat(result4, is(closeTo(103.0d, 0.01)));
	}
}