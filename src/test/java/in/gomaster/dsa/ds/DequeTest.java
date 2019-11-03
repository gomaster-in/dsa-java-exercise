package in.gomaster.dsa.ds;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import in.gomaster.dsa.container.Item;

class DequeTest {

	@Test
	void test() {
		Deque deque = new Deque();
		deque.addLast(new Item(3, ""));
		deque.addLast(new Item(4, ""));
		deque.addFirst(new Item(2, ""));
		deque.addFirst(new Item(1, ""));
		assertEquals(4, deque.size());

		Item item = (Item)deque.removeFirst();
		assertEquals(1, item.getKey());
		item = (Item)deque.removeLast();
		assertEquals(4, item.getKey());
		assertEquals(2, deque.size());
	}
}
