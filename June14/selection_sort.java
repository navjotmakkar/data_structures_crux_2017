package June14;

public class selection_sort {

	public static void main(String[] args) {
		int []arr={3,2,4,5,1};
		display(arr);
		selection(arr);
		display(arr);

	}
	public static void display(int[] arr) {
		for(int val:arr)
		{
			System.out.print(val+"\t");
		}
		System.out.println();
	}
	public static int[] selection(int[] arr)
	{
		int c=1;
		while(c<=arr.length-1)
		{
			for(int i=c;i<arr.length;i++)
			{
				if(arr[c-1]>arr[i])
					swap(arr,c-1,i);
			}
			c++;
		}
		return arr;
	}
	public static void swap(int[] arr,int i, int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}

}


