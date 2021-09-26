package July31;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class genericsClient {

	public static void main(String[] args) {
//		Integer[] i={5,2,9,3,6,4};
//		Double
//		[] d={5.2,4.1,2.0,8.6,1.6};
//		String[] s={"fgj","cgdr","ds","pun"};
//		display(i);
//		display(d);
//		display(s);
//		bubbleSort(i);
//		bubbleSort(d);
//		bubbleSort(s);
//		display(i);
//		display(d);
//		display(s);
//		
//		 Car[] cars=new Car[4];
//		 cars[0]=new Car("audi", 2000, 200);
//		 cars[1]=new Car("lamb", 1500, 160);
//		 cars[2]=new Car("bmw", 3000, 270);
//		 cars[3]=new Car("merc", 1200, 100);
//		 
//		 display(cars);
//		 bubbleSort(cars);
//		 display(cars);
		 
		 ArrayList<ArrayList<Integer>> lists=new ArrayList<>();
		 ArrayList<Integer> zeroth=new ArrayList<>(Arrays.asList(10,15,20,25));
		 ArrayList<Integer> first=new ArrayList<>(Arrays.asList(8,9,14,28));
		 ArrayList<Integer> second=new ArrayList<>(Arrays.asList(7,11,26,30));
		 ArrayList<Integer> third=new ArrayList<>(Arrays.asList(19,21,23,27));
		 
		 lists.add(zeroth);
		 lists.add(first);
		 lists.add(second);
		 lists.add(third);
		 System.out.println(mergeKsortedArrayLists(lists));
		 ArrayList<Integer> list=new ArrayList<>(Arrays.asList(19,21,23,27,5,81,12,22));
		 System.out.println(klargestElements(list, 3));
	}

	public static <T extends Comparable<T>> void bubbleSort(T[] arr)
	{
		int c=1;
		while(c<=arr.length-1)
		{
			for(int i=0;i<arr.length-c;i++)
			{
				if(arr[i].compareTo(arr[i+1])>0)
				{
					T temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
			}
			c++;
		}
		return;
	}
	public static <T> void display(T[] arr)
	{
		for(T val:arr)
		{
			System.out.print(val+" ,");
		}
		System.out.println(".");
		
	}
	public static  ArrayList<Integer> mergeKsortedArrayLists(ArrayList<ArrayList<Integer>> lists)
	{
		ArrayList<Integer> rv=new ArrayList<>();
		GenericHeapClass<Pair> heap=new GenericHeapClass<>(Pair.DataComparator);
		for(int i=0;i<lists.size();i++)
		{
			Pair p=new Pair();
			p.ino=0;
			p.lno=i;
			p.data=lists.get(i).get(0);
			heap.add(p);
		}
		while(!heap.isEmpty())
		{
			Pair top=heap.removeHP();
			rv.add(top.data);
			top.ino++;
			if(top.ino<lists.get(top.lno).size())
			{
				top.data=lists.get(top.lno).get(top.ino);
				heap.add(top);
			}
		}
		return rv;
	}
	public static class Pair
	{
		int data;
		int lno;
		int ino;
		private static final PairComparator DataComparator=new PairComparator();
		private static final RevPairComparator RevDataComparator=new RevPairComparator();
				
		private static class PairComparator implements Comparator<Pair>
		{
			public int compare(Pair o1, Pair o2)
			{
				return o2.data-o1.data;
			}
		}
		private static class RevPairComparator implements Comparator<Pair>
		{
			public int compare(Pair o1, Pair o2)
			{
				return o1.data-o2.data;
			}
		}
	}
	public static ArrayList<Integer> klargestElements(ArrayList<Integer> list, int k)
	{
		ArrayList<Integer> rv=new ArrayList<>();
		GenericHeapClass<Pair> heap=new GenericHeapClass<>(Pair.DataComparator);
		for(int i=0;i<k;i++)
		{
			Pair p=new Pair();
			p.data=list.get(i);
			heap.add(p);
		}
		for(int j=k;j<list.size();j++)
		{
			Pair top=heap.getHP();
			
			if(top.data<list.get(j));
			{
				heap.removeHP();
				top.data=list.get(j);
				heap.add(top);
				
			}
		}
		while(!heap.isEmpty())
		{
			rv.add(heap.removeHP().data);
		}
		return rv;
	}
}
