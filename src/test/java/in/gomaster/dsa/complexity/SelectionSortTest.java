package in.gomaster.dsa.complexity;

import static org.junit.jupiter.api.Assertions.*;

import in.gomaster.dsa.util.Utils;
import org.junit.jupiter.api.Test;

class SelectionSortTest extends SelectionSort {

	@Test
	void testSort() {
		int[] testArray = Utils.genIntArray(100);
		SelectionSort.sort(testArray);
		assertTrue(Utils.isIntArraySorted(testArray));
	}
	
	@Test
	void profileSort() {
		int[] sizes = {1000, 10000};
		//int[] sizes = {1000, 10000, 100000, 1000000};
		for (int size : sizes) {
			int[] testArray = Utils.genIntArray(size);
			long start = System.nanoTime();
			long ncomp = SelectionSort.sort(testArray);
			long end = System.nanoTime();
			System.out.println(size + ": " + ncomp + ": " + (end - start) / 1000000 + " ms");
		}
	}

}
