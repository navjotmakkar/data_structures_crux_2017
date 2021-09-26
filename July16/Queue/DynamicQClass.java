package July16.Queue;

public class DynamicQClass extends QClass {

	@Override
	public void enqueue(int val) throws Exception {
		if (size == data.length)
		{
			int[] oa=this.data;
			int ofront=this.front;
			this.front=0;
			this.data=new int[2*oa.length];
			for(int i=0;i< oa.length;i++)
			{
				data[i]=oa[(ofront+i)%oa.length];
			}
		}
		super.enqueue(val);
	}
}
