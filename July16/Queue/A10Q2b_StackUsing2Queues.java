package July16.Queue;

public class A10Q2b_StackUsing2Queues {

	private DynamicQClass q1=new DynamicQClass();
	private DynamicQClass q2=new DynamicQClass();
	
	public void push(int val)  throws Exception
	{
		if(q1.isempty())
		{
			q1.enqueue(val);
		}
		else
		{
			shifttos2();
			q1.enqueue(val);
			shifttos1();
		}
	}
	public void shifttos2() throws Exception
	{
		while(!q1.isempty())
			q2.enqueue(q1.dequeue());
	}
	public void shifttos1() throws Exception
	{
		while(!q2.isempty())
			q1.enqueue(q2.dequeue());
	}
	public int pop() throws Exception
	{
		return q1.dequeue();
	}
	public void display()
	{
		q1.display();
	}
	public int top() throws Exception
	{
		return q1.front();
	}
}
