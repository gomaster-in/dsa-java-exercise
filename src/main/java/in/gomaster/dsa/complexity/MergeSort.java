package in.gomaster.dsa.complexity;

public class MergeSort {
	private static int[] tarr;
	
	// The sorted sub-arrays in arr[low:mid] and arr[mid+1:high] are
	// to be merged into a single sorted array in arr[low:high].
	private static void merge(int[] arr, int low, int mid, int high) {
		int h = low;
		int i = low;
		int j = mid + 1;
		while ((h <= mid) && (j <= high)) {
			// while both sub-arrays are not exhausted
			if (arr[h] <= arr[j]) {
				tarr[i] = arr[h];
				h++;
			}
			else {
				tarr[i] = arr[j];
				j++;
			}
			i++;
		}
		// Handle any remaining elements
		int k;
		if (h > mid) {
			for (k = j; k <= high; k++) {
				tarr[i] = arr[k];
				i++;
			}
		}
		else {
			for (k = h; k <= mid; k++) {
				tarr[i] = arr[k];
				i++;
			}
		}
		// Copy the merged sub-arrays back into arr
		for (k = low; k <= high; k++) {
			arr[k] = tarr[k];
		}
	}
	
	// arr[low:high] is to be sorted.
	private static void sortR(int[] arr, int low, int high) {
		if (low < high) {
			// Find where to split the array
			int mid = low + (high - low) / 2;
			// Sort one subset
			sortR(arr, low, mid);
			// Sort the other subset
			sortR(arr, mid + 1, high);
			// Combine the results
			merge(arr, low, mid, high);
		}
	}
	
	public static void sort(int[] arr) {
		tarr = new int[arr.length];
		sortR(arr, 0, arr.length - 1);
	}
}
