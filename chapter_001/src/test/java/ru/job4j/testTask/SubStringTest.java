package ru.job4j.testTask;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * SubStringTest.
 * @author mklimentiev
 * @version 1.0
 * @since 30.04.2017
*/
public class SubStringTest {

	/**
	 * Test contains.
	*/
	@Test
	public void whenOriginContainsSubThenTrue() {
		SubString subString = new SubString();
		String origin = "aXddeed  bc";
		String sub = "bc";
		boolean expectedValue = true;
		boolean resultedValue = subString.contains(origin, sub);
		assertThat(resultedValue, is(expectedValue));
	}

	/**
	 * Test contains.
	*/
	@Test
	public void whenOriginContainsSubThenFalse() {
		SubString subString1 = new SubString();
		String origin1 = "ereteteyuuu";
		String sub1 = "xl";
		boolean expectedValue1 = false;
		boolean resultedValue1 = subString1.contains(origin1, sub1);
		assertThat(resultedValue1, is(expectedValue1));
	}
}