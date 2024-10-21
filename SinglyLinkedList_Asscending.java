package Assignment2;

public class SinglyLinkedList_Asscending {
	private Node root;

	public void insert(int data) {
		Node n = new Node(data);
		if (root == null) {
			root = n;
			return;
		}
		Node t = root;
		while (t.next != null) {
			t = t.next;
		}
		t.next = n;
	}

	public void display() {
		Node t = root;
		while (t != null) {
			System.out.print(t.data + " ");
			t = t.next;
		}
		System.out.println();
	}

	public void sort() {
		root = mergeSort(root);
	}

	private Node mergeSort(Node root) {
		if (root == null || root.next == null) {
			return root;
		}

		Node middle = getMiddle(root);
		Node nextOfMiddle = middle.next;
		middle.next = null;

		Node left = mergeSort(root);
		Node right = mergeSort(nextOfMiddle);
		return merge(left, right);
	}

	private Node getMiddle(Node root) {
		if (root == null)
			return root;

		Node slow = root;
		Node fast = root.next;

		while (fast != null) {
			fast = fast.next;
			if (fast != null) {
				slow = slow.next;
				fast = fast.next;
			}
		}
		return slow;
	}

	private Node merge(Node left, Node right) {
		if (left == null)
			return right;
		if (right == null)
			return left;

		Node result;

		if (left.data <= right.data) {
			result = left;
			result.next = merge(left.next, right);
		} else {
			result = right;
			result.next = merge(left, right.next);
		}
		return result;
	}
}
