package in.gomaster.dsa.ds;

import static org.junit.jupiter.api.Assertions.*;
import in.gomaster.dsa.container.Item;

import org.junit.jupiter.api.Test;

class QueueTest {

	@Test
	void test() {
		Queue q = new Queue();
		q.enqueue(new Item(10, ""));
		q.enqueue(new Item(9, ""));
		q.enqueue(new Item(8, ""));
		assertEquals(3, q.size());
		Item item = (Item)q.dequeue();
		assertEquals(10, item.getKey());
	}

}
