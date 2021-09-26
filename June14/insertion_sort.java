package June14;

public class insertion_sort {

	public static void main(String[] args) {
		int []arr={20,5,6,85,12,45};
		display(arr);
		insertion(arr);
		display(arr);

	}
	public static void display(int[] arr) {
		for(int val:arr)
		{
			System.out.print(val+"\t");
		}
		System.out.println();
	}
	public static void insertion(int[] arr)
	{
		int c=1;
		while(c<=arr.length-1)
		{
			for(int i=c;i>0;i--)
			{
				if(arr[i-1]>arr[i])
					swap(arr,i-1,i);
				else
					break;
			}
			c++;
		}
		
	}
	public static void swap(int[] arr,int i, int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
