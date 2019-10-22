package in.gomaster.dsa.ds;

import static org.junit.jupiter.api.Assertions.*;
import in.gomaster.dsa.container.Item;

import org.junit.jupiter.api.Test;

class StackTest {

	@Test
	void test() {
		Stack s = new Stack();
		s.push(new Item(10, ""));
		s.push(new Item(9, ""));
		s.push(new Item(8, ""));
		assertEquals(3, s.size());
		Item item = (Item)s.pop();
		assertEquals(8, item.getKey());
	}

}
