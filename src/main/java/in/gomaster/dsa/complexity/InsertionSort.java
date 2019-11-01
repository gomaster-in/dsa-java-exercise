package in.gomaster.dsa.complexity;

public class InsertionSort {
	private static void sortR(int[] arr, int n) {
		if (n <= 1)
			return;
		sortR(arr, n - 1);
		int val = arr[n - 1];
		int i = n - 1;
		while ((i > 0) && (arr[i - 1] > val)) {
			arr[i] = arr[i - 1];
			i--;
		}
		arr[i] = val;
	}
	
	public static void sortRecursive(int[] arr) {
		sortR(arr, arr.length);
	}
	
	public static void sortIterative(int[] arr) {
		int n = arr.length;
		for (int k = 2; k <= n; k++) {
			int val = arr[k - 1];
			int i = k - 2;
			while ((i >= 0) && (arr[i] > val)) {
				arr[i + 1] = arr[i];
				i--;
			}
			arr[i + 1] = val;
		}
	}
}
