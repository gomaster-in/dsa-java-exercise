package in.gomaster.dsa.container;

/**
 * Represents an item that may be part of a container
 */
public class Item {
	private int key;
	private String name;
	
	public Item(int key, String name) {
		this.key = key;
		this.name = name;
	}
	
	public int getKey() {
		return this.key;
	}
	
	public String getName() {
		return this.name;
	}
	
	public boolean equals(Item item) {
		return (this.key == item.key);
	}
}
