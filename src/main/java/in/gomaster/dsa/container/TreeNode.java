package in.gomaster.dsa.container;

class TreeNode {
	Item item;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(Item item, TreeNode left, TreeNode right) {
		this.item = item;
		this.left = left;
		this.right = right;
	}
	
	public TreeNode(Item item) {
		this(item, null, null);
	}
}
