package in.gomaster.dsa.algo;

import static org.junit.jupiter.api.Assertions.*;

import in.gomaster.dsa.ds.Stack;
import org.junit.jupiter.api.Test;

import java.util.Vector;

import java.util.Vector;

class DFS_TopoSortTest {

	@Test
	void testTopoSort() {
		Vector<Vertex> vertices = new Vector<Vertex>();
		Vertex va = new Vertex("a");
		vertices.addElement(va);
		Vertex vb = new Vertex("b");
		vertices.addElement(vb);
		Vertex vc = new Vertex("c");
		vertices.addElement(vc);
		Vertex vd = new Vertex("d");
		vertices.addElement(vd);
		Vertex ve = new Vertex("e");
		vertices.addElement(ve);
		Vertex vf = new Vertex("f");
		vertices.addElement(vf);
		
		va.addNeighbor(vd);
		vf.addNeighbor(vb);
		vb.addNeighbor(vd);
		vf.addNeighbor(va);
		vd.addNeighbor(vc);
		
		Stack sortedVertices = DFS_TopoSort.topoSort(vertices);
		Vector<Vertex> vec = new Vector<Vertex>();
		while (sortedVertices.size() > 0) {
			Vertex v = (Vertex)sortedVertices.pop();
			System.out.println(v.getName());
			vec.addElement(v);
		}
		for (Vertex v: vertices) {
			for (Vertex w: v.getNeighbors()) {
				assertTrue(vec.indexOf(v) < vec.indexOf(w));
			}
		}
	}
}
