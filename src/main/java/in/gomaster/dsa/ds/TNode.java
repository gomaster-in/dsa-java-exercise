package in.gomaster.dsa.ds;

public class TNode {
	public Object obj;
	public TNode left;
	public TNode right;
	
	public TNode(Object obj, TNode left, TNode right) {
		this.obj = obj;
		this.left = left;
		this.right = right;
	}
	
	public TNode(Object obj) {
		this(obj, null, null);
	}
}
