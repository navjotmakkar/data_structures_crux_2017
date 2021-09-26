package July16.Queue;

public class QClass {
	protected int[] data;
	protected int front;
	protected int size;

	public QClass()
	{
		this(5);
	}
	public QClass(int cap) {
		this.data = new int[cap];
	}

	public void enqueue(int val) throws Exception {
		if (size == data.length)
			throw new Exception("Queue is full");
		int tail = (this.front + this.size) % this.data.length;
		this.data[tail] = val;
		size++;
	}

	public int front() throws Exception {
		if (this.size == 0)
			throw new Exception("Queue is empty");
		return this.data[this.front];
	}

	public int dequeue() throws Exception {
		if (this.size == 0)
			throw new Exception("Queue is empty");
		int rv = this.data[this.front];
		this.data[this.front] = 0;
		front = (front + 1) % this.data.length;
		size--;
		return rv;
	}

	public int size() {
		return this.size;
	}

	public boolean isempty() {
		return this.size == 0;
	}

	public void display() {
		for (int i = 0; i < size; i++)
			System.out.print(this.data[(front + i) % data.length]+",");
		System.out.println();
		System.out.println("********************************************");
	}
}

