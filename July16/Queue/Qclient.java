package July16.Queue;

import July16.Stacks.A10Q1b_QueueUsing2Stacks;
import July16.Stacks.StackClass;

public class Qclient {

	public static void main(String[] args) throws Exception {
//		QClass q1=new DynamicQClass();
//		System.out.println(q1.isempty());
//		System.out.println(q1.size());
//		q1.enqueue(10);
//		q1.display();
//		
//		q1.enqueue(20);
//		q1.display();
//		
//		q1.enqueue(30);
//		q1.display();
//		
//		q1.enqueue(40);
//		q1.display();
//		System.out.println(q1.front());
//		System.out.println(q1.size());
//		
//		q1.dequeue();
//		q1.display();
//		
//		q1.dequeue();
//		q1.display();
//		
//		q1.enqueue(50);
//		q1.display();
//		
//		q1.enqueue(60);
//		q1.display();
//		System.out.println(q1.isempty());
//		
//		q1.enqueue(70);
//		q1.display();
//		System.out.println(q1.front);
//		
//		q1.enqueue(80);
//		q1.display();
//		
//		Qreverse(q1);
//		q1.display();
		
//		A10Q2b_StackUsing2Queues q2= new A10Q2b_StackUsing2Queues();
//		q2.push(10);
//		q2.push(20);
//		q2.push(30);
//		q2.display();
//		System.out.println(q2.top());
//		System.out.println(q2.pop());
//		q2.display();
//		q2.push(40);
//		q2.display();
//		System.out.println(q2.top());
		
		A10Q2a_StackUsing2Queues q2= new A10Q2a_StackUsing2Queues();
		q2.push(10);
		q2.push(20);
		q2.push(30);
		q2.display();
		System.out.println(q2.top());
		System.out.println(q2.pop());
		q2.display();
		q2.push(40);
		q2.display();
		System.out.println(q2.top());
	}
	public static void Qreverse (QClass q) throws Exception
	{
		if(q.size==0)
			return;
		
		int temp=q.dequeue();
		Qreverse(q);
		System.out.println(temp);
		q.enqueue(temp);
	}
	public static void QdisplayR(QClass q) throws Exception
	{
		
	}
}
