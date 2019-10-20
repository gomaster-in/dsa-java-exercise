package in.gomaster.dsa.util;

import java.util.Random;

/**
 * A class containing a bunch of utility methods
 */
public class Utils {
	/**
	 * Swap two array elements
	 * 
	 * @param arr the given array
	 * @param i the index of the first element to swap
	 * @param j the index of the second element to swap
	 */
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	/**
	 * Return a randomly generated integer array
	 * of the specified number of elements;
	 * each element is in the range [0, bound).
	 * 
	 * @param nelems number of elements in the generated array
	 * @param bound maximum array element value
	 * @return the randomly generated array
	 */
	public static int[] genIntArray(int nelems, int bound) {
		int[] arr = new int[nelems];
		Random rand = new Random();
		for (int i = 0; i < nelems; i++) {
			arr[i] = rand.nextInt(bound);
		}
		return arr;
	}
	
	/**
	 * Return a randomly generated integer array
	 * of the specified number of elements;
	 * each element is in the range [0, Integer.MAX_VALUE).
	 * 
	 * @param nelems number of elements in the generated array
	 * @return the randomly generated array
	 */
	public static int[] genIntArray(int nelems) {
		return genIntArray(nelems, Integer.MAX_VALUE);
	}

	/**
	 * Print the given array
	 * 
	 * @param arr the array to be printed
	 */
	public static void printIntArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + ": " + arr[i]);
		}
	}
	
	/**
	 * Test if the given integer array is sorted in non-decreasing order.
	 * 
	 * @param arr the array to check whether sorted
	 * @return true if the array is sorted, false otherwise
	 */
	public static boolean isIntArraySorted(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1])
				return false;
		}
		return true;
	}
}
