package in.gomaster.dsa.algo;

import java.util.Vector;

// Models a vertex in a graph
public class Vertex {
	private String m_name;
	private Vector<Vertex> m_neighbors;
	private boolean m_mark;
	private boolean m_instack;
	
	public Vertex(String name) {
		m_name = name;
		m_neighbors = new Vector<Vertex>();
		m_mark = false;
		m_instack = false;
	}
	
	public String getName() {
		return m_name;
	}
	
	public void addNeighbor(Vertex v) {
		m_neighbors.addElement(v);
	}
	
	public Vector<Vertex> getNeighbors() {
		return m_neighbors;
	}
	
	public boolean getMark() {
		return m_mark;
	}
	
	public void setMark(boolean mark) {
		m_mark = mark;
	}
	
	public boolean getInStack() {
		return m_instack;
	}
	
	public void setInStack(boolean instack) {
		m_instack = instack;
	}
}
