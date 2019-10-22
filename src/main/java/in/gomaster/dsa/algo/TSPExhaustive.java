package in.gomaster.dsa.algo;

public class TSPExhaustive {
	//Finds a solution for the traveling salesman problem
	//Returns the cost of a min-cost Hamiltonian circuit of the given
	//directed complete graph with n vertices in the form a cost matrix.
	public static int tsp(int[][] graph, int n) {
		int mincost;
		int cost;
		int[] p;
		int i;

		//mincost ← INFINITY
		mincost = Integer.MAX_VALUE;

		//Permutation[1..n-1] ← [1, 2, 3, …, n-1] //1st permn.
		p = new int[n - 1];
		for (i = 1; i < n; ++i) {
			p[i-1] = i;
		}

		//do
		do {
			//cost ← A[0, Permutation[1]] //1st edge of the circuit
			cost = graph[0][p[0]];

			//for i ← 1 to n-2
				//cost ← cost + A[Permutation[i], Permutation[i+1]]
			for (i = 0; i <= n-3; ++i) {
				cost += graph[p[i]][p[i+1]];
			}

			//cost ← cost + A[Permutation[n-1], 0] //last edge
			cost += graph[p[n-2]][0];

			//if (cost < mincost) mincost ← cost
			if(cost < mincost) {
				mincost = cost;
			}		
		} //while(getNextPermutation(Permutation[1..n-1]))
		while (Permutations.getNextPermutation(p, n - 1) != 0);

		//return mincost
		return mincost;
	}
}
