package in.gomaster.dsa.container;

public abstract class Container {
	public abstract int size();
	
	public abstract void insert(Item item);
	
	public abstract void delete(Item item);
	
	public void update(Item item, Item newItem) {
		delete(item);
		insert(newItem);
	}
	
	public abstract boolean search(Item item);
}
