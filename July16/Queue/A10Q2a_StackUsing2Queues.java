package July16.Queue;

import java.util.ArrayList;

public class A10Q2a_StackUsing2Queues {

	private DynamicQClass q1=new DynamicQClass();
	private DynamicQClass q2=new DynamicQClass();
	
	public int pop()  throws Exception
	{
		while(q1.size()>1)
		{
			q2.enqueue(q1.dequeue()); 
		}
		int rv=q1.dequeue();
		shifttoq1();
		return rv;
	}
//	public void shifttoq2() throws Exception
//	{
//		while(!q1.isempty())
//			q2.enqueue(q1.dequeue());
//	}
	public void shifttoq1() throws Exception
	{
		while(!q2.isempty())
			q1.enqueue(q2.dequeue());
	}
	public void push(int val) throws Exception
	{
		q1.enqueue(val);
	}
	public void display() throws Exception
	{
		ArrayList<Integer> list=new ArrayList<>();
		while(!q1.isempty())
		{
			list.add(q1.dequeue());
		}
		for(int i=list.size()-1;i>=0;i--)
		{
			System.out.print(list.get(i)+",");
		}
		System.out.println();
		System.out.println("****************************************");

		for(int i=0;i<list.size();i++)
		{
			q1.enqueue(list.get(i));
		}
	}
	public int top() throws Exception
	{
		while(q1.size()>1)
		{
			q2.enqueue(q1.dequeue()); 
		}
		int top=q1.dequeue();
		shifttoq1();
		q1.enqueue(top);
		return top;
	}
}
