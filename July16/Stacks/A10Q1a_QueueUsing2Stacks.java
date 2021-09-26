package July16.Stacks;

import java.util.ArrayList;

public class A10Q1a_QueueUsing2Stacks {
	private StackClass s1=new DynamicStack();
	private StackClass s2=new DynamicStack();
	
	public void enqueue(int val)throws Exception
	{
		s1.push(val);
	}
	private void shift() throws Exception
	{
		if(s2.isempty())
		{
			while(!s1.isempty())
				s2.push(s1.pop());
		}
	}
	public int dequeue() throws Exception
	{
		shift();
		return s2.pop();
	}
	public int front() throws Exception
	{
		shift();
		return s2.top();
	}
	public void display() throws Exception
	{
		ArrayList<Integer> list=new ArrayList<>();
		while(!s2.isempty())
		{
			list.add(s2.pop());
		}
		shift();
		while(!s2.isempty())
		{
			list.add(s2.pop());
		}
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+",");
			s1.push(list.get(i));
		}
		System.out.println();
		System.out.println("********************************************");
		s1.display();
	}
}
