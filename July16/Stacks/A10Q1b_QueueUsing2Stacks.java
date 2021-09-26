package July16.Stacks;

import java.util.ArrayList;

public class A10Q1b_QueueUsing2Stacks {

	private StackClass s1=new DynamicStack();
	private StackClass s2=new DynamicStack();
	
	public void enqueue(int val)throws Exception
	{
		if(s1.isempty())
			s1.push(val);
		else
		{
			shifttos2();
			s1.push(val);
			shifttos1();
		}
			
	}
	private void shifttos2() throws Exception
	{
		if(s2.isempty())
		{
			while(!s1.isempty())
				s2.push(s1.pop());
		}
	}
	private void shifttos1() throws Exception
	{	
		while(!s2.isempty())
			s1.push(s2.pop());
	}
	public int dequeue() throws Exception
	{
		return s1.pop();
	}
	public int front() throws Exception
	{
		return s1.top();
	}
	public void display() throws Exception
	{
		System.out.println("********************************************");
		s1.display();
	}
}
