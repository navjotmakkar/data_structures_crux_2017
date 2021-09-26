package August6;
import  java.util.LinkedList;

public class GenericLinkedList <T>{
	protected class Node {
		T data;
		Node next;
	}

	protected int size;
	protected Node head;
	protected Node tail;

	public void addlast(T data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		if (this.size == 0) {
			this.head = node;
			this.tail = node;
			this.size++;
		} else {
			this.tail.next = node;
			this.tail = node;
			this.size++;
		}
	}

	public int size() {

		return this.size;
	}

	public boolean isempty() {
		return this.size == 0;
	}

	public void display() {
		System.out.println("--------------------------------------");
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + ",");
			temp = temp.next;
		}
		System.out.println();
		System.out.println("--------------------------------------");
	}

	public void addFirst(T data) {
		Node node = new Node();
		node.data = data;
		node.next = this.head;
		if (this.size == 0) {
			this.head = node;
			this.tail = node;
			this.size++;
		} else {
			this.head = node;
		}
		this.size++;
	}

	private Node getNodeAt(int idx) throws Exception {
		if (this.size == 0)
			throw new Exception("List is empty.");
		if (idx < 0 || idx >= size)
			throw new Exception("Index out of bound");
		Node node = this.head;
		for (int i = 0; i < idx; i++)
			node = node.next;

		return node;
	}

	public T getFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("List is empty.");
		return this.head.data;
	}

	public T getLast() throws Exception {
		if (this.size == 0)
			throw new Exception("List is empty.");
		return this.tail.data;

	}

	public T getAt(int idx) throws Exception {
		if (this.size == 0)
			throw new Exception("List is empty.");
		if (idx < 0 || idx >= size)
			throw new Exception("Index out of bound");

		Node n = getNodeAt(idx);
		return n.data;
	}

	public void addAt(int idx, T data) throws Exception {
		if (idx < 0 || idx > size)
			throw new Exception("Index out of bound");
		if (idx == 0)
			addFirst(data);
		else if (idx == size - 1)
			addlast(data);
		else {
			Node node = new Node();
			node.data = data;
			Node nm = getNodeAt(idx - 1);
			Node np = nm.next;
			nm.next = node;
			node.next = np;

		}
		this.size++;
	}

	public T removeFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("List is empty.");
		T d = this.head.data;
		this.head = this.head.next;
		this.size--;
		return d;
	}

	public T removeLast() throws Exception {
		if (this.size == 0)
			throw new Exception("List is empty.");
		T temp;
		if (this.size == 1) {
			temp = this.tail.data;
			this.head = null;
			this.tail = null;
		} else {
			Node nodesm2 = getNodeAt(size - 2);
			temp = this.tail.data;
			nodesm2.next = null;
			this.tail = nodesm2;
		}
		this.size--;
		return temp;
	}

	public T removeAt(int idx) throws Exception {
		if (idx < 0 || idx >= size)
			throw new Exception("Index out of bound");
		T temp;
		if (idx == 1)
			return removeFirst();
		else if (idx == size - 1)
			return removeLast();
		else {
			Node nm1 = getNodeAt(idx - 1);
			temp = nm1.next.data;
			nm1.next = nm1.next.next;
		}
		this.size--;
		return temp;
	}
}
