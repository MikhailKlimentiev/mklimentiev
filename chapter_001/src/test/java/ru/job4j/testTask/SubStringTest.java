package ru.job4j.testTask;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * SubStringTest.
 * @author mklimentiev
 * @version 2.0
 * @since 07.05.2017
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

	/**
	 * Test contains.
	*/
	@Test
	public void whenOriginContainsSubThenTrue2() {
		SubString subString2 = new SubString();
		String origin2 = "Hello World!!!";
		String sub2 = "World!";
		boolean expectedValue2 = true;
		boolean resultedValue2 = subString2.contains(origin2, sub2);
		assertThat(resultedValue2, is(expectedValue2));
	}

	/**
	 * Test contains.
	*/
	@Test
	public void whenOriginContainsSubThenTrue3() {
		SubString subString3 = new SubString();
		String origin3 = "777777";
		String sub3 = "7";
		boolean expectedValue3 = true;
		boolean resultedValue3 = subString3.contains(origin3, sub3);
		assertThat(resultedValue3, is(expectedValue3));
	}
}