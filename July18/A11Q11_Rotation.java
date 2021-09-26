package July18;

public class A11Q11_Rotation extends LinkedList{

	public void rotate(int n) throws Exception
	{
		if(n>this.size)
			throw new Exception("Size of list is smaller than provided input.");
		LinkedList list =new LinkedList();
		while(this.size!=n)
		{
			list.addlast(this.removeFirst());
		}
		this.tail.next=list.head;
		this.tail=list.tail;
		return;
	}

}
