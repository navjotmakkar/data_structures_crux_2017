package July24;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class GenericTreeClass {
	protected class Node {
		protected int data;
		ArrayList<Node> Children = new ArrayList<>();
	}

	protected Node root;
	int size;

	public GenericTreeClass() {
		Scanner scn = new Scanner(System.in);
		root = takeInput(null, -1, scn);
		// multisolver(100);
	}

	private Node takeInput(Node parent, int childIdx, Scanner scn) {
		if (parent == null)
			System.out.println("Enter the data for root: ");
		else
			System.out.println("Enter the data for " + childIdx + "th child of" + parent.data + ": ");

		int val = scn.nextInt();
		Node child = new Node();
		this.size++;
		child.data = val;

		System.out.println("Enter the no. of children for " + child.data + ": ");
		int numGC = scn.nextInt();

		for (int i = 0; i < numGC; i++) {
			Node GC = takeInput(child, i, scn);
			child.Children.add(GC);
		}
		return child;
	}

	public void display() {
		System.out.println("--------------------------------------------");
		display(root);
		System.out.println("--------------------------------------------");
	}

	private void display(Node node) {
		String str = node.data + "=>";
		for (Node child : node.Children) {
			str += child.data + ", ";
		}
		str += ".";
		System.out.println(str);
		for (Node child : node.Children) {
			display(child);
		}

	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public int size2() {
		int s = size2(root);
		return s;
	}

	private int size2(Node node) {
		int s = 0;
		for (Node child : node.Children) {
			int sc = size2(child);
			s += sc;
		}
		s += 1;
		return s;
	}

	public int max() {
		int m = max(root);
		return m;
	}

	private int max(Node node) {
		int m = node.data;
		for (Node child : node.Children) {
			int m1 = max(child);
			if (m1 > m)
				m = m1;
		}
		return m;
	}

	public int height() {
		int hgt = height(root);
		return hgt;
	}

	private int height(Node node) {
		int h = 0;
		for (Node child : node.Children) {
			int h1 = height(child);
			h = h1 + 1;
		}
		return h;
	}

	public boolean find(int data) {
		boolean b = find(data, root);
		return b;
	}

	private boolean find(int data, Node node) {
		if (node.data == data)
			return true;
		boolean bb = false;
		for (Node child : node.Children) {
			boolean bb1;
			if (child.data == data)
				bb1 = true;
			else {
				bb1 = find(data, child);
			}
			if (bb1)
				return bb1;
		}

		return bb;
	}

	public void mirror() {
		mirror(root);
	}

	private void mirror(Node node) {
		for (Node child : node.Children) {
			mirror(child);

		}
		int left = 0;
		int right = node.Children.size() - 1;
		while (left <= right) {
			Node temp = node.Children.get(left);
			node.Children.set(left, node.Children.get(right));
			node.Children.set(right, temp);

			left++;
			right--;
		}
	}

	// public void printAtLevel(int l)
	// {
	// printAtLevel(l,root,1);
	// }
	// private void printAtLevel(int level,Node node,int l)
	// {
	// if(l==level)
	// {
	// System.out.println(node.Children.get(i).d);
	// }
	// for(Node child:node.Children)
	// {
	// printAtLevel(level, child, l+1);
	//
	// }
	// }
	public void preorder() {
		preorder(root);
		System.out.println(".");
	}

	private void preorder(Node node) {
		System.out.print(node.data + ", ");
		for (Node child : node.Children) {
			preorder(child);
		}
	}

	public void postorder() {
		postorder(root);
		System.out.println(".");
	}

	private void postorder(Node node) {
		for (Node child : node.Children) {
			postorder(child);
		}
		System.out.print(node.data + ", ");
	}

	public void levelOrder() {
		LinkedList<Node> queue = new LinkedList<>();
		queue.addLast(root);
		while (!queue.isEmpty()) {
			Node rem = queue.removeFirst();
			System.out.print(rem.data + ",");
			for (Node child : rem.Children) {
				queue.addLast(child);
			}
		}
	}

	public void levelOrder2() {
		LinkedList<Node> currlevel = new LinkedList<>();
		LinkedList<Node> nextlevel = new LinkedList<>();
		currlevel.addLast(root);
		int level = 1;
		System.out.print(level + ". ");
		while (!currlevel.isEmpty()) {
			Node rem = currlevel.removeFirst();
			System.out.print(rem.data + ",");
			for (Node child : rem.Children) {
				nextlevel.addLast(child);
			}
			if (currlevel.size() == 0) {
				currlevel = nextlevel;
				nextlevel = new LinkedList<>();
				level++;
				System.out.println();
				System.out.print(level + ". ");
			}
		}
	}

	private class HeapMover {
		protected int size;
		protected boolean find;
		protected int max = Integer.MIN_VALUE;
		protected int min = Integer.MAX_VALUE;
		protected int height;
		protected Node pred;
		protected Node next;
		protected Node justLarge;
		protected Node prev;
		protected Node curr;

		protected ArrayList<Node> children = new ArrayList<>();
	}

	public void multisolver(int data) {
		HeapMover bucket = new HeapMover();

		multisolver(root, bucket, data, 0);

		System.out.println(bucket.size);
		System.out.println(bucket.height);
		System.out.println(bucket.max);
		System.out.println(bucket.min);
		System.out.println(bucket.find);

		if (bucket.pred == null)
			System.out.println("predecessor not found.");
		else
			System.out.println(bucket.pred.data);

		if (bucket.next == null)
			System.out.println("succecessor not found.");
		else
			System.out.println(bucket.next.data);

		if (bucket.justLarge == null)
			System.out.println("just larger not found.");
		else
			System.out.println(bucket.justLarge.data);

	}

	public int kthsmallest1(int k) {
		int kthsmall = Integer.MIN_VALUE;
		for (int i = 0; i < k; i++) {
			HeapMover mover = new HeapMover();
			kthsmallest1(mover, root, kthsmall);
			kthsmall = mover.justLarge.data;
		}
		return kthsmall;

	}

	private void kthsmallest1(HeapMover bucket, Node node, int data) {
		if (node.data > data) {
			if (bucket.justLarge == null)
				bucket.justLarge = node;

			if (bucket.justLarge != null && node.data < bucket.justLarge.data)
				bucket.justLarge = node;

		}
		for (Node Child : node.Children) {
			kthsmallest1(bucket, Child, data);
		}
	}

	private void multisolver(Node node, HeapMover bucket, int data, int depth) {
		bucket.prev = bucket.curr;
		bucket.curr = node;

		bucket.size++;

		if (bucket.find && bucket.next == null) {
			bucket.next = bucket.curr;
		}

		if (node.data == data) {
			bucket.find = true;
			bucket.pred = bucket.prev;
		}
		if (node.data > data) {
			if (bucket.justLarge == null)
				bucket.justLarge = node;

			if (bucket.justLarge != null && node.data < bucket.justLarge.data)
				bucket.justLarge = node;

		}

		if (depth > bucket.height)
			bucket.height = depth;

		if (node.data > bucket.max)
			bucket.max = node.data;

		if (node.data < bucket.min)
			bucket.min = node.data;

		for (Node Child : node.Children) {
			multisolver(Child, bucket, data, depth + 1);

		}
	}

	public void removeLeaves() {
		removeLeaves(root);
	}

	private void removeLeaves(Node node) {
		for (int i = node.Children.size() - 1; i >= 0; i--) {
			Node child = node.Children.get(i);
			if (child.Children.size() == 0) {
				node.Children.remove(child);
			}
		}

		for (Node child : node.Children) {
			removeLeaves(child);
		}
	}

	public void linearize() {
		linearize(this.root);
	}

	private Node linearize(Node node) {
		if (node.Children.size() == 0)
			return node;

		Node tail = null;
		for (Node child : node.Children) {
			if (tail != null) {
				tail.Children.add(child);
			}
			tail = linearize(child);
		}
		while (node.Children.size() > 1) {
			node.Children.remove(node.Children.size() - 1);
		}
		return tail;
	}

	public void flatten() {
		HeapMover mover = new HeapMover();
		flatten(this.root, mover);
		this.root.Children = mover.children;
	}

	private void flatten(Node node, HeapMover mover) {
		if (node != root)
			mover.children.add(node);
		for (Node child : node.Children) {
			flatten(child, mover);
		}
		node.Children.clear();
	}
}
