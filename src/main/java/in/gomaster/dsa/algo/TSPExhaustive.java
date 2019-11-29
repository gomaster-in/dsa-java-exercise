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

		//Permutation[1..n-1] ← [1, 2, 3, …, n-1] //1st permn.

		//do

			//cost ← A[0, Permutation[1]] //1st edge of the circuit

			//for i ← 1 to n-2
				//cost ← cost + A[Permutation[i], Permutation[i+1]]

			//cost ← cost + A[Permutation[n-1], 0] //last edge

			//if (cost < mincost) mincost ← cost
		//while(getNextPermutation(Permutation[1..n-1]))

		//return mincost
	}
}
