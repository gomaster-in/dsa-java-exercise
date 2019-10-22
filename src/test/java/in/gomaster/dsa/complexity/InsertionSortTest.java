package in.gomaster.dsa.complexity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import in.gomaster.dsa.util.Utils;

class InsertionSortTest {

	@Test
	void testSortRecursive() {
		int[] testArray = {5, 4, 3, 2, 1};
		InsertionSort.sortRecursive(testArray);
		assertTrue(Utils.isIntArraySorted(testArray));
	}

	@Test
	void testSortRecursiveHuge() {
		int size = 100000;
		int[] testArray = Utils.genIntArray(size);
		InsertionSort.sortRecursive(testArray);
		assertTrue(Utils.isIntArraySorted(testArray));
	}

	@Test
	void testSortIterative() {
		int[] testArray = {5, 4, 3, 2, 1};
		InsertionSort.sortIterative(testArray);
		assertTrue(Utils.isIntArraySorted(testArray));
	}
	
	@Test
	void testSortIterativeHuge() {
		int size = 100000;
		int[] testArray = Utils.genIntArray(size);
		InsertionSort.sortIterative(testArray);
		assertTrue(Utils.isIntArraySorted(testArray));
	}
}
