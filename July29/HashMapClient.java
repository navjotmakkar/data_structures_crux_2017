package July29;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapClient {

	public static void main(String[] args) {
		String str="abraaddddaraaddd";
		System.out.println(highestFreqChar(str));
//		System.out.println(c);
		int[] a={1,1,3,2,2,5,2};
		int[] b={1,1,2,4,5,2,1};
		int[] arr={2,12,9,16,10,5,3,20,25,11,1,8,6};
		System.out.println(getCommonElt1(a, b));
		System.out.println(getCommonElt2(a, b));
		System.out.println(maxsubseq(arr));
	}
	public static Character highestFreqChar(String word)
	{
		HashMap <Character, Integer> fm = new HashMap();
		for(int i=0;i<word.length();i++)
		{
			Character ch=word.charAt(i);
			if(fm.containsKey(ch))
				fm.put(ch, fm.get(ch)+1);
			else
				fm.put(ch, 1);
		}
		System.out.println(fm);
		Character maxc=' ';
		int maxf=0;
		ArrayList<Character> keys=new ArrayList<>(fm.keySet());
		for(Character key:keys)
		{
			if(fm.get(key)>maxf)
			{
				maxc=key;
				maxf=fm.get(key);
			}
		}
		return maxc;
	}
	public static ArrayList<Integer> getCommonElt1(int[] one, int[] two)
	{
		HashMap <Integer, Integer> gce1 = new HashMap();
		for(int i=0;i<one.length;i++)
		{
			gce1.put(one[i], 1);	
		}
		for(int j=0;j<two.length;j++)
		{
			if(gce1.containsKey(two[j]))
			{
				gce1.put(two[j], 2);
			}	
		}
		ArrayList<Integer> keys=new ArrayList<>(gce1.keySet());
		for(Integer key:keys)
		{
			if(gce1.get(key)==1)
			{
				gce1.remove(key);
			}
		}
		keys=new ArrayList<>(gce1.keySet());
		return keys;
	}
	public static ArrayList<Integer> getCommonElt2(int[] one, int[] two)
	{
		HashMap <Integer, Integer> gce2 = new HashMap();
		for(int i=0;i<one.length;i++)
		{
			if(gce2.containsKey(one[i]))
				gce2.put(one[i], gce2.get(one[i])+1);
			else
				gce2.put(one[i], 1);
		}
		ArrayList<Integer> keys=new ArrayList<>();
		for(int j=0;j<two.length;j++)
		{
			if(gce2.containsKey(two[j]))
			{
				keys.add(two[j]);
				if(gce2.get(two[j])>1)
					gce2.put(two[j], gce2.get(two[j])-1);
				else
					gce2.remove(two[j]);
			}	
		}
		return keys;
	}
	public static ArrayList<Integer> maxsubseq(int[] arr)
	{
		HashMap <Integer, Boolean> subseq = new HashMap();
		for(int i=0;i<arr.length;i++)
		{
			subseq.put(arr[i], true);
		}
		ArrayList<Integer> keys=new ArrayList<>(subseq.keySet());
		
		for(Integer key:keys)
		{
			if(subseq.containsKey(key-1))
				subseq.put(key, false);
			
		}
		
		ArrayList<Integer> result=new ArrayList<>();
		for(Integer key:keys)
		{
			ArrayList<Integer> temp=new ArrayList<>();
			if(subseq.get(key))
			{
				int count=0;
				while(subseq.containsKey(key+count))
				{
					temp.add(key+count);
					count++;
				}
			}
			if(temp.size()>result.size())
			{
				result=temp;
				temp=new ArrayList<>();
			}
		}
		return result;
	}
}
