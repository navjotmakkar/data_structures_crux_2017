package July16.Stacks;

public class StackClient {

	public static void main(String[] args)throws Exception {
		StackClass s1=new DynamicStack();
		System.out.println(s1.isempty());
		s1.push(10);
		s1.display();
		
		s1.push(20);
		s1.display();
		System.out.println(s1.isempty());
		
		s1.push(30);
		s1.display();
		
		s1.pop();
		s1.display();
		
		s1.push(40);
		s1.display();
		System.out.println(s1.size());
		
		s1.push(50);
		s1.display();
		
		s1.push(60);
		s1.display();
		
		s1.push(70);
		s1.display();
		
		 A10Q1a_QueueUsing2Stacks q1= new A10Q1a_QueueUsing2Stacks();
		 
		 q1.enqueue(10);
		 q1.enqueue(20);
		 System.out.println(q1.dequeue());
		 q1.enqueue(30);
		 q1.enqueue(40);
		 q1.enqueue(50);
		 q1.enqueue(60);
		 System.out.println(q1.dequeue());
		 System.out.println(q1.dequeue());
		 System.out.println(q1.dequeue());
		 q1.enqueue(70);
		 q1.display();
		 
		 A10Q1b_QueueUsing2Stacks q2= new A10Q1b_QueueUsing2Stacks();
		 
		 q2.enqueue(10);
		 q2.enqueue(20);
		 System.out.println(q2.dequeue());
		 q2.enqueue(30);
		 q2.enqueue(40);
		 q2.enqueue(50);
		 q2.enqueue(60);
		 System.out.println(q2.dequeue());
		 System.out.println(q2.dequeue());
		 System.out.println(q2.dequeue());
		 q2.enqueue(70);
		 q2.display();
	}

}
