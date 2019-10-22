package in.gomaster.dsa.algo;

import static org.junit.jupiter.api.Assertions.*;
import in.gomaster.dsa.ds.TNode;
import in.gomaster.dsa.algo.TreeLevelOrder;

import java.util.Vector;

import org.junit.jupiter.api.Test;

class TreeLevelOrderTest {

	@Test
	void test() {
		TNode root = new TNode("A");
		
		// Level 1
		root.left = new TNode("B");
		root.right = new TNode("C");
		
		// Level 2
		root.left.left = new TNode("D");
		root.left.right = new TNode("E");
		root.right.left = new TNode("F");
		root.right.right = new TNode("G");

		Vector<Object> vec = TreeLevelOrder.printLevelByLevel(root);
		assertEquals("A", vec.elementAt(0));
		assertEquals("B", vec.elementAt(1));
		assertEquals("C", vec.elementAt(2));
		assertEquals("D", vec.elementAt(3));
		assertEquals("E", vec.elementAt(4));
		assertEquals("F", vec.elementAt(5));
		assertEquals("G", vec.elementAt(6));
	}

}
