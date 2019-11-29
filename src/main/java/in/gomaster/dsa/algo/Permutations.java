package in.gomaster.dsa.algo;

import in.gomaster.dsa.util.Utils;

public class Permutations {
	// Get the next permutation in lexicographic order
	public static int getNextPermutation(int[] permutation, int n) {
		int i;
		int j;
		int k;
		int temp_int;
		int swaps;

		//find i
		for (i = n - 2; i >= 0; i--) {
			if (permutation[i] < permutation[i + 1]) {
				break;
			}
		}
		if (i == -1) {
			return 0;
		}

		for (j = i + 1; j < n; j++) {
			if (permutation[j] < permutation[i]) {
				break;
			}
		}
		j--;

		Utils.swap(permutation, i, j);

		swaps = (n - 1 - i) / 2;	
		for (k = 0; k < swaps; k++) {
			temp_int = permutation[i + 1 + k];
			permutation[i + 1 + k] = permutation[n - 1 - k];
			permutation[n - 1 - k] = temp_int;
		}
		return 1;
	}
}
