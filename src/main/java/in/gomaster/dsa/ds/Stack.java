package in.gomaster.dsa.ds;

public class Stack {
	private LLNode m_top;
	private int m_size;
	
	public Stack() {
		m_top = null;
		m_size = 0;
	}
	
	public int size() {
		return m_size;
	}
	
	public void push(Object obj) {
		LLNode node = new LLNode(obj);
		node.next = m_top;
		m_top = node;
		m_size++;
	}
	
	public Object pop() {
		if (m_top == null)
			return null;
		
		Object obj = m_top.obj;
		m_top = m_top.next;
		m_size--;
		return obj;
	}
}
