package July27;

import java.util.LinkedList;
import java.util.Scanner;

import org.w3c.dom.Node;


public class BSTClass {

	private class Node
	{
		Node left;
		Node right;
		int data;
	}
	private Node root;
	private int size;
	
	public void display()
	{
		display(root);
	}
	private void display(Node node)
	{
		if(node==null)
			return;
		String str="";
		if(node.left!=null)
			str+=node.left.data;
		else
			str+=".";
		
		str+="<=";
		str+=node.data;
		str+="=>";
		
		if(node.right!=null)
			str+=node.right.data;
		else
			str+=".";
		System.out.println(str);
		display(node.left);
		display(node.right);
			
	}
//	public int size()
//	{
//		
//	}
	public boolean isEmpty()
	{
		return size2(root)==0;
	}
	public int size2()
	{
		return size2(root);
	}
	private int size2(Node node)
	{
		if(node==null)
			return 0;
		
		int lsize=size2(node.left);
		int rsize=size2(node.right);
		
		return lsize+rsize+1;
	}
	public int max()
	{
		return max(root);
	}
	private int max(Node node)
	{
		if(node==null)
			return 0;
		
		if(node.right!=null)
			return max(node.right);
		else
			return node.data;
	}
	public int in()
	{
		return min(root);
	}
	private int min(Node node)
	{
		if(node==null)
			return 0;
		
		if(node.left!=null)
			return min(node.left);
		else
			return node.data;
	}
	public int height()
	{
		return height(root);
	}
	private int height(Node node)
	{
		if(node==null)
			return -1;
		
		int lefth=height(node.left);
		int rightm=height(node.right);
		
		return Math.max(lefth, rightm)+1;
	}
	public boolean find(int data)
	{
		return find(data,root);
	}
	private boolean find(int data, Node node)
	{
		if(node==null)
			return false;
		
		if(data>node.data)
			return find(data,node.right);
		else if(data<node.data)
			return find(data,node.left);
		else if(data==node.data)
			return true;
		else
			return false;
	}
	public int diameter()
	{
		return diameter(root);
	}
	private int diameter(Node node)
	{
		if(node==null)
			return 0;
		
		int ld=diameter(node.left);
		int rd=diameter(node.right);
		
		int lh=height(node.left);
		int rh=height(node.right);
		
		int f1=lh+rh+2;
		int f2=ld;
		int f3=rd;
		
		return Math.max(Math.max(f2, f3), f1);
	}
	private class diapair
	{
		int dia;
		int height;
	}
	public int daimeter2()
	{
		return diameter2(root).dia;
	}
	private diapair diameter2(Node node)
	{
		if(node == null)
		{
			diapair bp=new diapair();
			bp.dia=0;
			bp.height=-1;
			return bp;
		}
		diapair lp=diameter2(node.left);
		diapair rp=diameter2(node.right);
		int lh=lp.height;
		int rh=rp.height;
		
		int f1=lh+rh+2;
		int f2=lp.dia;
		int f3=rp.dia;
		
		diapair mypair=new diapair();
		mypair.dia= Math.max(Math.max(f2, f3), f1);
		mypair.height=Math.max(lh, rh)+1;
		
		return mypair;
	}
	private class balpair
	{
		int height;
		boolean bal;
	}
	public boolean isBal()
	{
		return isBal(root).bal;
	}
	private balpair isBal(Node node)
	{
		if(node==null)
		{
			balpair bp=new balpair();
			bp.bal=true;
			bp.height=-1;
			return bp;
		}
		balpair lp=isBal(node.left);
		balpair rp=isBal(node.right);
		int lh=lp.height;
		int rh=rp.height;
		boolean mb;
		int gap=Math.abs(lh-rh);
		if(lp.bal && rp.bal && gap<=1)
			mb=true;
		else
			mb=false;
		
		balpair mypair=new balpair();
		mypair.bal=mb;
		mypair.height=Math.max(lh, rh)+1;
		
		return mypair;
	}
	
	public void preorder()
	{
		preorder(root);
		System.out.println(".");
	}
	private void preorder(Node node)
	{
		if(node==null)
			return;
		System.out.print(node.data+", ");
		preorder(node.left);
		preorder(node.right);
		
	}
	public void inorder()
	{
		inorder(root);
		System.out.println(".");
	}
	private void inorder(Node node)
	{
		if(node==null)
			return;
		inorder(node.left);
		System.out.print(node.data+", ");
		inorder(node.right);
	}
	public void postorder()
	{
		postorder(root);
		System.out.println(".");
	}
	private void postorder(Node node)
	{
		if(node==null)
			return;
		postorder(node.left);
		postorder(node.right);
		System.out.print(node.data+", ");
	}
	public void levelOrder()
	{
		LinkedList<Node> queue=new LinkedList<>();
		queue.add(root);
		while(queue.size()!=0)
		{
			Node temp=queue.removeFirst();
			System.out.print(temp.data+", ");
			if(temp.left!=null)
				queue.addLast(temp.left);
			if(temp.right!=null)
				queue.addLast(temp.right);
		}
		System.out.println(".");
	}
	private class TraversalPair
	{
		Node node;
		boolean selfdone;
		boolean leftdone;
		boolean rightdone;
	}
	public void preorder2()
	{
		LinkedList<TraversalPair> stack=new LinkedList<TraversalPair>();
		TraversalPair rootpair=new TraversalPair();
		rootpair.node=root;
		stack.addFirst(rootpair);
		while(stack.size()!=0)
		{
			TraversalPair toppair=stack.getFirst();
			if(!toppair.selfdone)
			{
				System.out.print(toppair.node.data+", ");
				toppair.selfdone=true;
			}
			else if(!toppair.leftdone)
			{
				if(toppair.node.left!=null)
				{
					TraversalPair lp=new TraversalPair();
					lp.node=toppair.node.left;
					stack.addFirst(lp);
				}
				toppair.leftdone=true;
			}
			
			else if(!toppair.rightdone)
			{
				if(toppair.node.right!=null)
				{
					TraversalPair rp=new TraversalPair();
					rp.node=toppair.node.right;
					stack.addFirst(rp);
				}
				toppair.rightdone=true;
			}
			else
			{
				stack.removeFirst();
			}
		}
		System.out.println(".");
	}
	public void postorder2()
	{
		LinkedList<TraversalPair> stack=new LinkedList<TraversalPair>();
		TraversalPair rootpair=new TraversalPair();
		rootpair.node=root;
		stack.addFirst(rootpair);
		while(stack.size()!=0)
		{
			TraversalPair toppair=stack.getFirst();
			if(!toppair.leftdone)
			{
				if(toppair.node.left!=null)
				{
					TraversalPair lp=new TraversalPair();
					lp.node=toppair.node.left;
					stack.addFirst(lp);
				}
				toppair.leftdone=true;
			}
			else if(!toppair.rightdone)
			{
				if(toppair.node.right!=null)
				{
					TraversalPair rp=new TraversalPair();
					rp.node=toppair.node.right;
					stack.addFirst(rp);
				}
				toppair.rightdone=true;
			}
			else if(!toppair.selfdone)
			{
				System.out.print(toppair.node.data+", ");
				toppair.selfdone=true;
			}
			else
			{
				stack.removeFirst();
			}
		}
		System.out.println(".");
	}
	public void inorder2()
	{
		LinkedList<TraversalPair> stack=new LinkedList<TraversalPair>();
		TraversalPair rootpair=new TraversalPair();
		rootpair.node=root;
		stack.addFirst(rootpair);
		while(stack.size()!=0)
		{
			TraversalPair toppair=stack.getFirst();
			if(!toppair.leftdone)
			{
				if(toppair.node.left!=null)
				{
					TraversalPair lp=new TraversalPair();
					lp.node=toppair.node.left;
					stack.addFirst(lp);
				}
				toppair.leftdone=true;
			}
			else if(!toppair.selfdone)
			{
				System.out.print(toppair.node.data+", ");
				toppair.selfdone=true;
			}
			
			else if(!toppair.rightdone)
			{
				if(toppair.node.right!=null)
				{
					TraversalPair rp=new TraversalPair();
					rp.node=toppair.node.right;
					stack.addFirst(rp);
				}
				toppair.rightdone=true;
			}
			else
			{
				stack.removeFirst();
			}
		}
		System.out.println(".");
	}
	public BSTClass(int[] post,int[] in)
	{
		root=construct(post,in,0,post.length-1,0,in.length-1);
	}
	private Node construct(int[] post, int[] in, int psi,int pei,int isi,int iei)
	{
		if(psi>pei||isi>iei)
			return null;
		
		Node node=new Node();
		this.size++;
		node.data=post[pei];
		int idx=-1;
		for(int i=isi;i<=iei;i++)
		{
			if(in[i]==node.data)
			{
				idx=i;
				break;
			}
		}
		int nelons=idx-isi;               //no. ofelements 
		node.left=construct(post, in, psi, psi+nelons-1, isi, idx-1);
		node.right=construct(post, in, psi+nelons, pei-1, idx+1, iei);
		
		return node;
	}
	public void add(int data)
	{
		if(this.size==0)
		{
			this.root=new Node();
			this.root.data=data;
			this.size++;
		}
		else
			this.add(root,data);
	}
	private void add(Node node, int data)
	{
		if(data>node.data)
		{
			if(node.right!=null)
				add(node.right,data);
			else
			{
				node.right=new Node();
				node.right.data=data;
				this.size++;
			}
		}
		else if(data<node.data)
		{
			if(node.left!=null)
				add(node.left,data);
			else
			{
				node.left=new Node();
				node.left.data=data;
				this.size++;
			}
		}
		return;
	}
	public BSTClass(int[] sa)
	{
		root=construct(sa,0,sa.length-1);
	}
	private Node construct(int[] sa, int low, int hi)
	{
		if(low>hi)
			return null;
		
		int mid=(low+hi)/2;
		Node node=new Node();
		this.size++;
		node.data=sa[mid];
		
		node.left=construct(sa,low,mid-1);
		node.right=construct(sa,mid+1,hi);
		
		return node;
	}
	public void remove(int data)
	{
		remove(null,root,false,data);
	}

	private void remove(Node parent,Node node, boolean ilc,int data)
	{
		
		if(data<node.data)
			remove(node,node.left,true,data);
		else if(data>node.data)
			remove(node,node.right,false,data);
		else 
		{
			this.size--;
			if(node.left!=null && node.right!=null)
			{
				int lmax=max(node.left);
				node.data=lmax;
				remove(node,node.left,true,lmax);
			}
			else
			{
				if(ilc)
					parent.left=(node.left!=null?node.left:node.right);
				else
					parent.right=(node.left!=null?node.left:node.right);
			}
		}
		return;
	}
	
	public void replaceWithSumOfLargerNo()
	{
		HeapMover sum=new HeapMover();
		replaceWithSumOfLargerNo(root, sum);
	}
	private void replaceWithSumOfLargerNo(Node node,HeapMover sum)
	{
		if(node==null)
			return;
		replaceWithSumOfLargerNo(node.right,sum);
		int temp=node.data;
		node.data=sum.data;
		sum.data+=temp;
		replaceWithSumOfLargerNo(node.left, sum);
	}
	private class HeapMover
	{
		int data=0;
	}
	public void printInRange(int lo, int hi)
	{
		printInRange(lo,hi,root);
	}
	private void printInRange(int lo, int hi,Node node)
	{
		if(node==null)
		{
			return;
		}
		if(node.data<lo)
			printInRange(lo, hi, node.right);
		else if(node.data>hi)
			printInRange(lo, hi, node.left);
		else
		{
			System.out.println(node.data);
			printInRange(lo, hi, node.left);
			printInRange(lo, hi, node.right);
		}
			
	}
	
}

