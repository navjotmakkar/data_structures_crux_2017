package July18;

public class A11Q9_OddEven extends LinkedList{

	public void EvenOdd() throws Exception
	{
		LinkedList even=new LinkedList();
		LinkedList odd=new LinkedList();
		
		while(this.head!=null)
		{
			if(head.data%2==0)
				even.addlast(this.removeFirst());
			else
				odd.addlast(this.removeFirst());
		}
		even.tail.next=odd.head;
		this.head=even.head;
		this.tail=odd.tail;
		return;
	}
}
