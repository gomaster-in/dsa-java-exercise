package in.gomaster.dsa.complexity;

import static in.gomaster.dsa.util.Utils.swap;

public class SelectionSort {
	public static long sort(int[] arr) {
		long ncomp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.length; j++) {
				ncomp++;
				if (arr[j] < arr[min])
					min = j;
			}
			swap(arr, i, min);
		}
		return ncomp;
	}
}
