package July18;


public class A11Q1_Swap2Elts extends LinkedList {

	public void swap2elts(int i,int j) throws Exception
	{
		if(i==j)
			return;
		int k=0;
		LinkedList list=new LinkedList();
		while(k<i)
		{
			list.addlast(this.removeFirst());
			k++;
		}
		list.addlast(this.removeAt(j-i));
		int temp=this.removeFirst();
		k=0;
		while(k<j-i-1)
		{
			list.addlast(this.removeFirst());
			k++;
		}
		list.addlast(temp);
		list.tail.next=this.head;
		this.head=list.head;
		this.tail=list.tail;
		return;
	}
}

