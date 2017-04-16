package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * TurnTest.
 * @author mklimentiev
 * @version 1.0
 * @since 16.04.2017
*/
public class TurnTest {
	/**
	 * Test back.
	*/
	@Test
	public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
		Turn turnArray = new Turn();
		int[] array = {1, 2, 3, 4, 5};
		int[] expectArray = {5, 4, 3, 2, 1};
		int[] resultArray = turnArray.back(array);
		assertThat(resultArray, is(expectArray));
	}

	/**
	 * Test back.
	*/
	@Test
	public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
		Turn turnArray = new Turn();
		int[] array1 = {4, 1, 6, 2};
		int[] expectArray1 = {2, 6, 1, 4};
		int[] resultArray1 = turnArray.back(array1);
		assertThat(resultArray1, is(expectArray1));
	}
}

