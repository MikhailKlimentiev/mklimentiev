package ru.job4j.array;

import org.junit.Test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * ArrayDuplicateTest.
 * @author mklimentiev
 * @version 1.0
 * @since 30.04.2017
*/
public class ArrayDuplicateTest {

	/**
	 * Test remove.
	*/
	@Test
	public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
		ArrayDuplicate arrayDuplicate = new ArrayDuplicate();
		String[] array = {"Hello", "World", "Hello", "Super", "World"};
		String[] expectedArray = {"Hello", "World", "Super"};
		String[] resultedArray = arrayDuplicate.remove(array);
		assertThat(resultedArray, is(expectedArray));
	}
}
