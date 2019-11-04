package in.gomaster.dsa.algo;

// Count the number of bit strings of a given length that do not have two
// consecutive zeros, using different strategies
public class BitStringCount {
	
	private static boolean hasTwoConsecutiveZeros(long l, int n) {
		// TODO: your code here
		return false;
	}
	
	// Assuming that the bit strings fit inside a long integer
	public static long countExhaustive(int n) {
		long bs;
		long last = (1L << n) - 1;
		long count = 0;
		for (bs = 0; bs <= last; bs++) {
			if (!hasTwoConsecutiveZeros(bs, n))
				count++;
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
