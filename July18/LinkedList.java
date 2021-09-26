package July18;

public class LinkedList {
	protected class Node {
		int data;
		Node next;
	}

	protected int size;
	protected Node head;
	protected Node tail;

	public void addlast(int data) {
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

	public void addFirst(int data) {
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

	public int getFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("List is empty.");
		return this.head.data;
	}

	public int getLast() throws Exception {
		if (this.size == 0)
			throw new Exception("List is empty.");
		return this.tail.data;

	}

	public int getAt(int idx) throws Exception {
		if (this.size == 0)
			throw new Exception("List is empty.");
		if (idx < 0 || idx >= size)
			throw new Exception("Index out of bound");

		Node n = getNodeAt(idx);
		return n.data;
	}

	public void addAt(int idx, int data) throws Exception {
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

	public int removeFirst() throws Exception {
		if (this.size == 0)
			throw new Exception("List is empty.");
		int d = this.head.data;
		this.head = this.head.next;
		this.size--;
		return d;
	}

	public int removeLast() throws Exception {
		if (this.size == 0)
			throw new Exception("List is empty.");
		int temp;
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

	public int removeAt(int idx) throws Exception {
		if (idx < 0 || idx >= size)
			throw new Exception("Index out of bound");
		int temp;
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

	public void reverseDataIterative() throws Exception {
		int left = 0;
		int right = this.size - 1;

		while (left <= right) {
			Node leftn = getNodeAt(left);
			Node rightn = getNodeAt(right);
			int temp = leftn.data;
			leftn.data = rightn.data;
			rightn.data = temp;
			left++;
			right--;
		}
	}

	public void reversePointerIterative() {
		Node prev = this.head;
		Node curr = prev.next;

		while (curr != null) {
			Node next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;

	}

	public void reversePointerRecurssive() {
		reversePointerRecursive(this.head);
		Node temp = this.head;
		this.head = this.tail;
		this.tail = temp;
		this.tail.next = null;
	}

	private void reversePointerRecursive(Node node) {
		if (node == tail)
			return;

		reversePointerRecursive(node.next);
		node.next.next = node;
	}

	public void reverseDataRecursive() {
		HeapMover left = new HeapMover();
		left.node = this.head;
		reverseDataRecursive(left, this.head, 0);
	}

	private void reverseDataRecursive(HeapMover left, Node right, int floor) {
		if (right == null)
			return;

		reverseDataRecursive(left, right.next, floor + 1);
		if (floor >= this.size / 2) {
			int temp = left.node.data;
			left.node.data = right.data;
			right.data = temp;

			left.node = left.node.next;
		}

	}

	private class HeapMover {

		Node node;
	}

	public boolean isPalandrome() {
		HeapMover left = new HeapMover();
		left.node = this.head;
		boolean b = isPalandrome(left, this.head, 0);
		return b;
	}

	private boolean isPalandrome(HeapMover left, Node right, int floor) {
		if (right == null) {
			return true;
		}
		boolean rv = isPalandrome(left, right.next, floor + 1);
		if (rv) {
			if (left.node.data != right.data)
				return false;
			else {
				left.node = left.node.next;
				return true;
			}
		} else
			return false;
	}

	public void fold() {
		HeapMover left = new HeapMover();
		left.node = this.head;
		fold(left, this.head, 0);
	}

	private void fold(HeapMover left, Node right, int floor) {
		if (right == null) {
			return;
		}
		fold(left, right.next, floor + 1);
		if (floor > this.size / 2) {
			Node oln = left.node.next;
			left.node.next = right;
			right.next = oln;

			left.node = oln;
		}
		if (floor == this.size / 2) {
			this.tail = right;
			this.tail.next = null;
		}
	}

	public int kthfromlast(int k) {
		Node fast = this.head;
		int i = 0;
		while (i < k) {
			fast = fast.next;
			i++;
		}
		Node slow = this.head;
		while (fast != null) {
			slow = slow.next;
			fast = fast.next;
		}
		return slow.data;

	}

	public int midElt() {
		return midelt().data;
	}

	private Node midelt() {
		Node fast = this.head;
		Node slow = this.head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	 public void removeDuplicate() throws Exception{
		LinkedList curr=new LinkedList();
		while(!this.isempty())
		{
			if(curr.isempty())
				curr.addlast(this.removeFirst());
			else if(this.head.data!=curr.tail.data)
			{
				curr.addlast(this.removeFirst());
			}
		}
		this.head=curr.head;
		this.size=curr.size;
		this.tail=curr.tail;
	 }

	public LinkedList merge2sortedlist(LinkedList other) {
		LinkedList merge = new LinkedList();
		Node thistemp = this.head;
		Node othertemp = other.head;

		while (thistemp != null && othertemp != null) {
			if (thistemp.data < othertemp.data) {
				merge.addlast(thistemp.data);
				thistemp = thistemp.next;
			} else {
				merge.addlast(othertemp.data);
				othertemp = othertemp.next;
			}
		}
		while (thistemp != null) {
			merge.addlast(thistemp.data);
			thistemp = thistemp.next;
		}
		while (othertemp != null) {
			merge.addlast(othertemp.data);
			othertemp = othertemp.next;
		}
		return merge;
	}

	
	public LinkedList MergeSort() {
		if (this.size == 1){
			return this;
		}
		Node mid = this.midelt();
		Node midnext = mid.next;

		LinkedList fh = new LinkedList();
		fh.head = this.head;
		fh.tail = mid;
		fh.tail.next = null;
		fh.size = (this.size + 1) / 2;

		LinkedList sh = new LinkedList();
		sh.head = midnext;
		sh.tail = this.tail;
		sh.tail.next = null;
		sh.size = (this.size) / 2;

		sh = sh.MergeSort();
		fh = fh.MergeSort();

		LinkedList list = fh.merge2sortedlist(sh);
		return list;
	}
	public void kReverse(int k) throws Exception
	{
		LinkedList prev=null,curr=new LinkedList();
		
		while(!this.isempty())
		{
			for(int i=0;i<k;i++)
			{
				curr.addFirst(this.removeFirst());
			}
			if(prev==null)
			{
				prev=curr;
				prev.size=curr.size;
			}
			else
			{
				prev.tail.next=curr.head;
				prev.tail=curr.tail;
				prev.size+=curr.size;
			}
			curr=new LinkedList();
		}
		this.head=prev.head;
		this.size=prev.size;
		this.tail=prev.tail;
		
	}
	
}