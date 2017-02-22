package ru.job4j;

/**
 * Triangle.
 *
 * @author mklimentiev
 * @since 11.02.2017
 * @version 1.0
 */

public class Triangle {
	/**
	 * Field a means vertex of the triangle.
	 */
	private Point a;
	/**
	 * Field b means vertex of the triangle.
	 */
	private Point b;
	/**
	 * Field c means vertex of the triangle.
	 */
	private Point c;

	/**
	 * triangle.
	 *
	 * @param a -- First point of the triangle
	 * @param b -- Second point of the triangle
	 * @param c -- Third point of the triangle
	 */
	public void triangle(Point a, Point b, Point c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	/**
	 * area.
	 *
	 * Method calculate area of the triangle and check that any two points shouldn't coincide
	 * @param a -- First point of the triangle
	 * @param b -- Second point of the triangle
	 * @param c -- Third point of the triangle
	 * @return -- area of the triangle calculated on coordinates of three points
	 */
	public double area(Point a, Point b, Point c) {
		if (distanceTo(a, b) != 0) {
			if (distanceTo(a, c) != 0) {
				if (distanceTo(b, c) != 0) {
					return abs((b.x - a.x) * (c.y - a.y) - (c.x - a.x) * (b.y - a.y)) / 2;
				}
			}
		}
	}
}