package ru.job4j.loop;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * CounterTest.
 * @author mklimentiev
 * @version 1.0
 * @since 01.04.2017
*/
public class CounterTest {

	/**
	 * Test add.
	*/
	@Test
	public void whenSumEvenNumbersFromOneToTenThenThirty() {
		Counter counter1 = new Counter();
		int result1 = counter1.add(1, 10);
		assertThat(result1, is(30));
	}

	/**
	 * Test add.
	*/
	@Test
	public void whenSumEvenNumbersFromZeroToTenThenThirty() {
		Counter counter2 = new Counter();
		int result2 = counter2.add(0, 11);
		assertThat(result2, is(30));
	}
}
