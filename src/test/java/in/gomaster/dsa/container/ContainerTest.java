package in.gomaster.dsa.container;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


enum ContainerType {
	CONTAINER_UNSORTEDARRAY,
	CONTAINER_SORTEDARRAY
}

enum ProfileType {
	PROFILE_SEARCH,
	PROFILE_INSERT,
	PROFILE_DELETE
}

class ContainerTest {

	private void testContainer(Container c) {
		c.insert(new Item(5, "John"));
		c.insert(new Item(3, "Alex"));
		c.insert(new Item(7, "Sam"));
		assertEquals(3, c.size());
		
		assertTrue(c.search(new Item(3, "")));
		assertFalse(c.search(new Item(2, "")));
		
		if (!(c instanceof BinarySearchTree)) {
			c.delete(new Item(3, ""));
			assertFalse(c.search(new Item(3, "")));
		}
	}
	
	@Test
	void test() {
		System.out.println("FUNCTIONAL TESTS");
		System.out.println("================");
		
		System.out.println("Running unsorted array tests...");
		UnsortedArray ua = new UnsortedArray(10);
		testContainer(ua);
		
		System.out.println("Running sorted array tests...");
		SortedArray sa = new SortedArray(10);
		testContainer(sa);
		
		System.out.println("Running unsorted linked list tests...");
		UnsortedLinkedList ull = new UnsortedLinkedList();
		testContainer(ull);
		
		System.out.println("Running sorted linked list tests...");
		SortedLinkedList sll = new SortedLinkedList();
		testContainer(sll);
		
		System.out.println("Running binary search tree tests...");
		BinarySearchTree bst = new BinarySearchTree();
		testContainer(bst);
		
		System.out.println("Running hash table tests...");
		HashTable ht = new HashTable(10);
		testContainer(ht);
	}

	private void profileContainer(ContainerType ctype, ProfileType ptype) {
		int[] sizes = {1000000, 5000000, 10000000};
		Random rand = new Random();
		for (int size : sizes) {
			// Generate container of this size
			Container c = null;
			switch (ctype) {
			case CONTAINER_UNSORTEDARRAY:
				c = new UnsortedArray(size);
				break;
			case CONTAINER_SORTEDARRAY:
				c = new SortedArray(size);
				break;
			default:
				break;
			}
			
			c.insert(new Item(0, ""));
			for (int i = 0; i < size - 3; i++) {
				c.insert(new Item(rand.nextInt(Integer.MAX_VALUE), ""));
			}
			c.insert(new Item(Integer.MAX_VALUE, ""));
			
			// and then profile
			long start = System.nanoTime();
			switch (ptype) {
			case PROFILE_SEARCH:
				c.search(new Item(Integer.MAX_VALUE, ""));
				break;
			case PROFILE_INSERT:
				c.insert(new Item(Integer.MAX_VALUE, ""));
				break;
			case PROFILE_DELETE:
				c.delete(new Item(0, ""));
				break;
			default:
				break;
			}
			long end = System.nanoTime();
			System.out.println(size + ": " + (end - start) / 1000000 + " ms");
		}
	}
	
	@Disabled
	void profile() {
		System.out.println("PROFILE TESTS");
		System.out.println("=============");
		
		System.out.println("Unsorted array insert profile:");
		profileContainer(ContainerType.CONTAINER_UNSORTEDARRAY, ProfileType.PROFILE_INSERT);
		
		System.out.println("Unsorted array delete profile:");
		profileContainer(ContainerType.CONTAINER_UNSORTEDARRAY, ProfileType.PROFILE_DELETE);
		
		System.out.println("Unsorted array search profile:");
		profileContainer(ContainerType.CONTAINER_UNSORTEDARRAY, ProfileType.PROFILE_SEARCH);


		System.out.println("Sorted array insert profile:");
		profileContainer(ContainerType.CONTAINER_SORTEDARRAY, ProfileType.PROFILE_INSERT);
		
		System.out.println("Sorted array delete profile:");
		profileContainer(ContainerType.CONTAINER_SORTEDARRAY, ProfileType.PROFILE_DELETE);
		
		System.out.println("Sorted array search profile:");
		profileContainer(ContainerType.CONTAINER_SORTEDARRAY, ProfileType.PROFILE_SEARCH);
	}
}
