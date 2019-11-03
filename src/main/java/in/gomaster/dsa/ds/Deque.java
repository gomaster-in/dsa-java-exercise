package in.gomaster.dsa.ds;

public class Deque {
	private LLNode m_head;
	private LLNode m_tail;
	private int m_size;
	
	public Deque() {
		m_head = null;
		m_tail = null;
		m_size = 0;
	}
	
	public int size() {
		return m_size;
	}
	
	public void addFirst(Object obj) {
		LLNode node = new LLNode(obj);
		node.next = m_head;
		if (m_head == null)
			m_tail = node;
		m_head = node;
		m_size++;
	}

	public void addLast(Object obj) {
		LLNode node = new LLNode(obj);
		if (m_tail != null)
			m_tail.next = node;
		else
			m_head = node;
		m_tail = node;
		m_size++;
	}
	
	public Object removeFirst() {
		if (m_head == null)
			return null;
		
		Object obj = m_head.obj;
		m_head = m_head.next;
		if (m_head == null)
			m_tail = null;
		m_size--;
		return obj;
	}

	public Object removeLast() {
		if (m_head == null)
			return null;

		LLNode prev = null;
		LLNode curr = m_head;
		while (curr != m_tail) {
			prev = curr;
			curr = curr.next;
		}
		Object obj = m_tail.obj;
		m_tail = prev;
		if (m_tail == null)
			m_head = null;
		m_size--;
		return obj;
	}
}
