package in.gomaster.dsa.algo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ForwardTicketsTest {
	private static int[][] s_costMaster = {
		{ -1, 4, 8, 15, Integer.MAX_VALUE },
		{ -1, -1, 5, 9, 12 },
		{ -1, -1, -1, Integer.MAX_VALUE, 9 },
		{ -1, -1, -1, -1, 2 },
		{ -1, -1, -1, -1, -1 }
	};
	private static int[][] s_cost = new int[s_costMaster.length][s_costMaster.length];

	private static void copyMatrix() {
		for (int i = 0; i < s_costMaster.length; i++) {
			for (int j = 0; j < s_costMaster.length; j++) {
				s_cost[i][j] = s_costMaster[i][j];
			}
		}
	}
	
	@Test
	void testFwdTktBacktrack() {
		copyMatrix();
		int mincost = ForwardTickets.fwdTktBacktrack(s_cost);
		System.out.println(mincost);
	}

	@Test
	void testFwdTktDPMemoize() {
		copyMatrix();
		int mincost = ForwardTickets.fwdTktDPMemoize(s_cost);
		System.out.println(mincost);
	}

	@Test
	void testFwdTktDPBottomUp() {
		copyMatrix();
		int mincost = ForwardTickets.fwdTktDPBottomUp(s_cost);
		System.out.println(mincost);
	}
}
