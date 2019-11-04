package in.gomaster.dsa.complexity;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import in.gomaster.dsa.util.Utils;

class MergeSortTest {

	@Test
	void testSort() {
		int[] testArray = Utils.genIntArray(100);
		MergeSort.sort(testArray);
		assertTrue(Utils.isIntArraySorted(testArray));
	}
	
	@Test
	void profileSort() {
		int[] sizes = {1000, 10000, 100000};
		for (int size : sizes) {
			int[] testArray = Utils.genIntArray(size);
			long start = System.nanoTime();
			MergeSort.sort(testArray);
			long end = System.nanoTime();
			System.out.println(size + ": " + (end - start) / 1000000 + " ms");
		}
	}
}
