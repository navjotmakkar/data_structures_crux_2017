package August6;

import java.util.ArrayList;
import java.util.LinkedList;

public class GenericHashMapClass<K,V> {

	private class HMNode
	{
		K key;
		V value;
	}
	private GenericLinkedList<HMNode>[] buckets;
	private int size=0;
	public GenericHashMapClass()
	{
		buckets=new GenericLinkedList[5];
		for(int i=0;i<buckets.length;i++)
		{
			buckets[i]=new GenericLinkedList<>();
		}
		this.size=0;
	}
	public void put(K key,V value) throws Exception
	{
		int bi=hashfunction(key);
		GenericLinkedList<HMNode> bucket=buckets[bi];
		int foundInBucket=findInBucket(bucket,key);
		if(foundInBucket==-1)
		{
			HMNode nodetoadd=new HMNode();
			nodetoadd.key=key;
			nodetoadd.value=value;
			bucket.addlast(nodetoadd);
			this.size++;
			
			double lambda=(this.size*1.0)/buckets.length;
			if(lambda>2.0)
				rehash();
		}
		else
		{
			HMNode nodetopdate=bucket.getAt(foundInBucket);
			nodetopdate.value=value;
		}
	}
	public boolean containsKey(K key) throws Exception
	{
		int bi=hashfunction(key);
		GenericLinkedList<HMNode> bucket=buckets[bi];
		int foundInBucket=findInBucket(bucket,key);
		if(foundInBucket==-1)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	public V remove(K key) throws Exception
	{
		int bi=hashfunction(key);
		GenericLinkedList<HMNode> bucket=buckets[bi];
		int foundInBucket=findInBucket(bucket,key);
		if(foundInBucket==-1)
		{
			return null;
		}
		else
		{
			HMNode nodetoremove=bucket.removeAt(foundInBucket);
			this.size--;
			return nodetoremove.value;
		}
	}
	public V get(K key) throws Exception
	{
		int bi=hashfunction(key);
		GenericLinkedList<HMNode> bucket=buckets[bi];
		int foundInBucket=findInBucket(bucket,key);
		if(foundInBucket==-1)
		{
			return null;
		}
		else
		{
			HMNode nodetoreturn=bucket.getAt(foundInBucket);
			return nodetoreturn.value;
		}
	}

	public void display() throws Exception
	{
		System.out.println("--------------------------------");
		for(int i=0;i<buckets.length;i++)
		{ String str="BUCKETS"+i+"=>";
			for(int j=0;j<buckets[i].size;j++)
			{
				HMNode node=buckets[i].getAt(j);
				str+="("+node.key+"_"+node.value+")";
			}
			System.out.println(str+".");
		}
	}
	public ArrayList<K> keyset() throws Exception
	{
		ArrayList<K> rv=new ArrayList<>();
		for(int i=0;i<buckets.length;i++)
		{	
			for(int j=0;j<buckets[i].size;j++)
			{
				HMNode node=buckets[i].getAt(j);
			}
		}
		return rv;
	}
	private void rehash() throws Exception
	{
		GenericLinkedList<HMNode>[] oba=this.buckets;
		this.buckets=new GenericLinkedList[2*oba.length];
		for(int i=0;i<buckets.length;i++)
		{
			buckets[i]=new GenericLinkedList<>();
		}
		this.size=0;
		for(int i=0;i<oba.length;i++)
		{
			for(int j=0;j<oba[i].size();j++)
			{
				put(oba[i].getAt(j).key, oba[i].getAt(j).value);
			}
		}
	}
	
	private int hashfunction(K key)
	{
		int hc=key.hashCode();
		int abshc=Math.abs(hc);
		abshc=abshc%buckets.length;
		return abshc;
	}
	private int findInBucket(GenericLinkedList<HMNode> bucket,K key) throws Exception
	{
		for(int i=0;i<bucket.size();i++)
		{
			HMNode hmnode=bucket.getAt(i);
			if(hmnode.key.equals(key))
				return i;
		}
		return -1;
	}
}
