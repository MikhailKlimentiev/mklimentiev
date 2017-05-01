package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * BubbleSortTest.
 * @author mklimentiev
 * @version 1.0
 * @since 21.04.2017
*/
public class BubbleSortTest {
	/**
	 * Test sort.
	*/
	@Test
	public void whenSortArrayWithTenElementsThenSortedArray() {
		BubbleSort bubbleSort = new BubbleSort();
		int[] array = {1, 5, 4, 2, 3, 1, 7, 8, 0, 5};
		int[] expectedArray = {0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
		int[] resultedArray = bubbleSort.sort(array);
		assertThat(resultedArray, is(expectedArray));
	}
}