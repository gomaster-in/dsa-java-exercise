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
		try {
			InsertionSort.sortRecursive(testArray);
			assertTrue(Utils.isIntArraySorted(testArray));
		} catch (StackOverflowError soe) {
			System.err.println("testSortRecursiveHuge: Stack overflow!");
		}
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
	
	@Test
	void profileSortIterative() {
		int[] sizes = {1000, 10000, 100000};
		for (int size : sizes) {
			int[] testArray = Utils.genIntArray(size);
			long start = System.nanoTime();
			long ncomp = InsertionSort.sortIterative(testArray);
			long end = System.nanoTime();
			System.out.println(size + ": " + ncomp + ": " + (end - start) / 1000000 + " ms");
		}
	}
}
