package in.gomaster.dsa.algo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BitStringCountTest {

	@Test
	void testCountExhaustive() {
		assertEquals(1, BitStringCount.countExhaustive(0));
		assertEquals(2, BitStringCount.countExhaustive(1));
		assertEquals(3, BitStringCount.countExhaustive(2));
		assertEquals(5, BitStringCount.countExhaustive(3));
		assertEquals(8, BitStringCount.countExhaustive(4));
		assertEquals(13, BitStringCount.countExhaustive(5));
		assertEquals(144, BitStringCount.countExhaustive(10));
	}

	@Test
	void testCountBacktrack() {
		assertEquals(1, BitStringCount.countBacktrack(0));
		assertEquals(2, BitStringCount.countBacktrack(1));
		assertEquals(3, BitStringCount.countBacktrack(2));
		assertEquals(5, BitStringCount.countBacktrack(3));
		assertEquals(8, BitStringCount.countBacktrack(4));
		assertEquals(13, BitStringCount.countBacktrack(5));
		assertEquals(144, BitStringCount.countBacktrack(10));
	}

	@Test
	void testCountDPMemoize() {
		assertEquals(1, BitStringCount.countDPMemoize(0));
		assertEquals(2, BitStringCount.countDPMemoize(1));
		assertEquals(3, BitStringCount.countDPMemoize(2));
		assertEquals(5, BitStringCount.countDPMemoize(3));
		assertEquals(8, BitStringCount.countDPMemoize(4));
		assertEquals(13, BitStringCount.countDPMemoize(5));
		assertEquals(144, BitStringCount.countDPMemoize(10));
	}

	@Test
	void testCountDPBottomUp() {
		assertEquals(1, BitStringCount.countDPBottomUp(0));
		assertEquals(2, BitStringCount.countDPBottomUp(1));
		assertEquals(3, BitStringCount.countDPBottomUp(2));
		assertEquals(5, BitStringCount.countDPBottomUp(3));
		assertEquals(8, BitStringCount.countDPBottomUp(4));
		assertEquals(13, BitStringCount.countDPBottomUp(5));
		assertEquals(144, BitStringCount.countDPBottomUp(10));
	}
}
