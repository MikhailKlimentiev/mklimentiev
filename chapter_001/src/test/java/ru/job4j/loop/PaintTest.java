package ru.job4j.loop;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * PaintTest.
 * @author mklimentiev
 * @version 1.0
 * @since 15.04.2017
*/
public class PaintTest {
	/**
	 * Test piramid.
	*/
	@Test
	public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
		Paint paint = new Paint();
		String result = paint.piramid(2);
		String expected = String.format(" ^ %s^^^", System.getProperty("line.separator"));
		assertThat(result, is(expected));
	}

	/**
	 * Test piramid.
	*/
	@Test
	public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
		Paint paint1 = new Paint();
		String result1 = paint1.piramid(3);
		String expected1 = String.format("  ^  %s ^^^ %s^^^^^", System.getProperty("line.separator"), System.getProperty("line.separator"));
		assertThat(result1, is(expected1));
	}
}
