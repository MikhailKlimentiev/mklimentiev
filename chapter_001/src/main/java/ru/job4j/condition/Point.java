package ru.job4j.condition;

/**
 * Point.
 *
 * @author mklimentiev
 * @since 25.03.2017
 * @version 2.0
*/

public class Point {
	/**
	 * Field x means coordinate x of the Point.
	*/
	private int x;

	/**
	 * Field y means coordinate y of the Point.
	*/
	private int y;

	/**
	 * Point.
	 *
	 * A Constructor
	 * @param x -- coordinate x of the Point
	 * @param y -- coordinate y of the Point
	*/
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * getX.
	 *
	 * @return x
	*/
	public int getX() {
		return this.x;
	}

	/**
	 * getY.
	 *
	 * @return y
	*/
	public int getY() {
		return this.y;
	}

	/**
	 * is.
	 *
	 * @param a -- Argument of the function y(x) = a * x + b
	 * @param b -- Argument of the function y(x) = a * x + b
	 * @return result the comparison (ordinate == this.y)
	*/
	public boolean is(int a, int b) {
		int ordinate = a * this.x + b;
		return (ordinate == this.y);
	}
}