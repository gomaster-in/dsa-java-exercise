package in.gomaster.dsa.algo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Vector;

import org.junit.jupiter.api.Test;

class ConnectionDegreeTest {

	@Test
	void testFindDegree() {
		// Ann -- Bob -- Don -- Eve    Hal
		//  \     /       |\     |
		//   \   /        | \    |
		//    Cal         |  \   |
		//                |   \  |
		//                |    \ |
		//               Gus -- Flo
		Vector<Vertex> vertices = new Vector<Vertex>();
		Vertex va = new Vertex("Ann");
		vertices.addElement(va);
		Vertex vb = new Vertex("Bob");
		vertices.addElement(vb);
		Vertex vc = new Vertex("Cal");
		vertices.addElement(vc);
		Vertex vd = new Vertex("Don");
		vertices.addElement(vd);
		Vertex ve = new Vertex("Eve");
		vertices.addElement(ve);
		Vertex vf = new Vertex("Flo");
		vertices.addElement(vf);
		Vertex vg = new Vertex("Gus");
		vertices.addElement(vg);
		Vertex vh = new Vertex("Hal");
		vertices.addElement(vh);
		
		va.addNeighbor(vb);
		va.addNeighbor(vc);
		
		vb.addNeighbor(va);
		vb.addNeighbor(vc);
		vb.addNeighbor(vd);
		
		vc.addNeighbor(va);
		vc.addNeighbor(vb);

		vd.addNeighbor(vb);
		vd.addNeighbor(ve);
		vd.addNeighbor(vf);
		vd.addNeighbor(vg);
		
		ve.addNeighbor(vd);
		ve.addNeighbor(vf);
		
		vf.addNeighbor(vd);
		vf.addNeighbor(ve);
		vf.addNeighbor(vg);
		
		vg.addNeighbor(vd);
		vg.addNeighbor(vf);
		
		assertEquals(1, ConnectionDegree.findDegree(vertices, va, vb));
		assertEquals(2, ConnectionDegree.findDegree(vertices, vd, vc));
		assertEquals(3, ConnectionDegree.findDegree(vertices, vf, vc));
		assertEquals(3, ConnectionDegree.findDegree(vertices, va, vf));
		assertEquals(-1, ConnectionDegree.findDegree(vertices, ve, vh));
		assertEquals(0, ConnectionDegree.findDegree(vertices, vg, vg));
	}

}
