package in.gomaster.dsa.ds;

public class Queue {
	private LLNode m_head;
	private LLNode m_tail;
	private int m_size;
	
	public Queue() {
		m_head = null;
		m_tail = null;
		m_size = 0;
	}
	
	public int size() {
		return m_size;
	}
	
	public void enqueue(Object obj) {
		LLNode node = new LLNode(obj);
		if (m_tail != null)
			m_tail.next = node;
		else
			m_head = node;
		m_tail = node;
		m_size++;
	}
	
	public Object dequeue() {
		if (m_head == null)
			return null;
		
		Object obj = m_head.obj;
		m_head = m_head.next;
		if (m_head == null)
			m_tail = null;
		m_size--;
		return obj;
	}
}
