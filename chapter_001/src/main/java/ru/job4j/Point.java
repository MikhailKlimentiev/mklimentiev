package ru.job4j;

/**
 * Point.
 *
 * @author mklimentiev
 * @since 11.02.2017
 * @version 1.0
 */

public class Point {
	/**
	 * Field x means coordinate x of the Point.
	 */
	private double x;
	/**
	 * Field y means coordinate y of the Point.
	 */
	private double y;

	/**
	 * point.
	 *
	 * @param x -- coordinate x of the Point
	 * @param y -- coordinate y of the Point
	 */
	public point(double x, double y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * distanceTo.
	 *
	 * @param point1 -- parameter point #1
	 * @param point2 -- parameter point #1
	 * @return distance -- value double
	 */
	public double distanceTo(Point point1, Point point2) {
		double distance = sqrt(pow((point2.x - point1.x), 2) + pow((point2.y - point1.y), 2));
		return distance;
	}
}