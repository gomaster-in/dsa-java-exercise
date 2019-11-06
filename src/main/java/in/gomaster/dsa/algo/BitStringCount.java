package in.gomaster.dsa.algo;

// Count the number of bit strings of a given length that do not have two
// consecutive zeros, using different strategies
public class BitStringCount {
	
	// Return 0 if the bit at position pos in the long integer l is 0,
	// and 1 otherwise
	private static int getBit(long l, int pos) {
		return ((l & (1L << pos)) == 0) ? 0 : 1;
	}
	
	private static boolean hasTwoConsecutiveZeros(long l, int n) {
		for (int i = 0; i < n - 1; i++) {
			if ((getBit(l, i) == 0) && (getBit(l, i + 1) == 0))
				return true;
		}
		return false;
	}
	
	// Assuming that the bit strings fit inside a long integer
	public static long countExhaustive(int n) {
		long bs;
		long last = (1L << n) - 1;
		long count = 0;
		for (bs = 0; bs <= last; bs++) {
			// TODO: your code here

		}
		return count;
	}
	
	public static long countBacktrack(int n) {
		// TODO: your code here
		return 0;
	}

	public static long countDPMemoize(int n) {
		// TODO: your code here
		return 0;
	}
	
	public static long countDPBottomUp(int n) {
		// TODO: your code here
		return 0;
	}
}
