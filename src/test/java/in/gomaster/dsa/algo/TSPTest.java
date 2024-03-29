package in.gomaster.dsa.algo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TSPTest {
	private static int[][] s_graph = {
			{      0, 110189,  50573,  20948, 109480,  34435,  28433,  74836,  91767,  68406 },
			{ 109006,      0,  79663, 118195,  79397, 143304,  83593,  45792,  37923,  68146 },
			{  51516,  80265,      0,  70149, 121881,  83636,  44745,  43763,  42416,  67450 },
			{  21557, 119539,  69838,      0,  95820,  42397,  37471,  84186, 111032,  77756 },
			{ 110053,  81231, 121373,  95977,      0, 134475,  85826,  87690, 100264,  54016 },
			{  34488, 144238,  82769,  41728, 134042,      0,  62482, 108885, 123963, 102455 },
			{  28473,  84770,  45153,  37117,  85732,  62772,      0,  49417,  78006,  42987 },
			{  75056,  46162,  44536,  84245,  86579, 109354,  49641,      0,  31151,  38399 },
			{  92933,  37994,  42414, 111566,  99497, 125053,  78960,  31010,      0,  68113 },
			{  68718,  68844,  68336,  77907,  55357, 103016,  43305,  38648,  68634,      0 }
		};
	private static int s_mincost = 454201;
	
	@Test
	void testTspExhaustive() {
		int mincost = TSPExhaustive.tsp(s_graph, 10);
		assertEquals(s_mincost, mincost);
	}
	
	// @Test
	// void testTspGreedy() {
	// 	int mincost = TSPGreedy.tsp(s_graph, 10);
	// 	assert(mincost >= s_mincost);
	// }
	
	// @Test
	// void testTspBacktrack() {
	// 	int mincost = TSPBacktrack.tsp(s_graph, 10);
	// 	assertEquals(s_mincost, mincost);
	// }
	
	// @Test
	// void testTspBnB() {
	// 	int mincost = TSPBnB.tsp(s_graph, 10);
	// 	assertEquals(s_mincost, mincost);
	// }
}
