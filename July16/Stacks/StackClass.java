package July16.Stacks;

public class StackClass {
	protected int[] data;
	protected int tos = -1;

	public StackClass()
	{
		this(5);
	}
	public StackClass(int cap) {
		this.data = new int[cap];
	}

	public void push(int value) throws Exception {
		if (this.tos == this.data.length - 1)
			throw new Exception("Stack is full");
		this.tos++;
		this.data[this.tos] = value;
	}

	public int top() throws Exception {
		if (this.tos == -1)
			throw new Exception("Stack is empty");
		else
			return this.data[this.tos];
	}

	public int pop() throws Exception {
		if (this.tos == -1)
			throw new Exception("Stack is empty");
		else {
			int rv = this.data[this.tos];
			this.data[this.tos] = 0;
			this.tos--;
			return rv;
		}
	}

	public int size() {
		return this.tos + 1;
	}

	public boolean isempty() {
		return this.tos == -1;
	}

	public void display() 
	{	
		for (int i = tos; i >= 0; i--)
			System.out.print(this.data[i] + ",");
		System.out.println();
		System.out.println("********************************************");
	}
}
