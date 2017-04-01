package ru.job4j.condition;

/**
 * Triangle.
 *
 * @author mklimentiev
 * @since 26.03.2017
 * @version 2.0
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
	 * @return -- area of the triangle calculated on coordinates of three points
	*/
	public double area() {
		if (a.getX() == b.getX() && a.getY() == b.getY()) {
			return 101.0d;
		} else if (a.getX() == c.getX() && a.getY() == c.getY()) {
			return 102.0d;
		} else if (b.getX() == c.getX() && b.getY() == c.getY()) {
			return 103.0d;
		} else {
			return Math.abs((b.getX() - a.getX()) * (c.getY() - a.getY()) - (c.getX() - a.getX()) * (b.getY() - a.getY())) / 2;
		}
	}
}
