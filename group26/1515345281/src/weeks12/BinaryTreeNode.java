package weeks12;

public class BinaryTreeNode<T> {

	 T data;
	 BinaryTreeNode<T> left;
	 BinaryTreeNode<T> right;
	
	public BinaryTreeNode(T data){
		this.data=data;
	}
	
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public BinaryTreeNode<T> getLeft() {
		return left;
	}
	public void setLeft(BinaryTreeNode<T> left) {
		this.left = left;
	}
	public BinaryTreeNode<T> getRight() {
		return right;
	}
	public void setRight(BinaryTreeNode<T> right) {
		this.right = right;
	}
	
	
}
