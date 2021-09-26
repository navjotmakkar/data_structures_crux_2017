package July26;

import java.util.LinkedList;
import java.util.Scanner;

public class BinaryTreeClass {

	private class Node
	{
		Node left;
		Node right;
		int data;
	}
	private Node root;
	private int size;
	public BinaryTreeClass()
	{
		Scanner scn=new Scanner(System.in);
		root=takeInput(null,false,scn);
	}
	private Node takeInput(Node parent,Boolean ilc, Scanner scn)
	{
		if(parent==null)
		{
			System.out.println("Enter the data");
		}
		else
		{
			if(ilc==true)
			{
				System.out.println("Enter the data for left child of"+parent.data+": ");
			}
			else
			{
				System.out.println("Enter the data for right child of"+parent.data+": ");
			}
		}
		int data=scn.nextInt();
		Node node=new Node();
		node.data=data;
		this.size++;
		
		System.out.println("Do you have left child for"+node.data+": ");
		Boolean hlc=scn.nextBoolean();
		if(hlc)
		{
			node.left=this.takeInput(node, true, scn);
		}
		System.out.println("Do you have right child for"+node.data+": ");
		Boolean hrc=scn.nextBoolean();
		if(hrc)
		{
			node.right=this.takeInput(node, false, scn);
		}
		
		return node;
	}
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
		
		int m=node.data;
		int leftm=max(node.left);
		int rightm=max(node.right);
		
		return Math.max(Math.max(leftm, rightm), m);
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
		
		if(node.data==data)
			return true;
		
		boolean filc=find(data, node.left);
		if(filc)
			return true;
		boolean firc=find(data,node.right);
		if(firc)
			return true;
		
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
	private class bstpair
	{
		boolean isBst;
		int max;
		int min;
		int largestBSTroot;
		int largestBSTsize;
	}
	public boolean isBST()
	{
		return isBST(root).isBst;
	}
	private bstpair isBST(Node node)
	{
		if(node==null)
		{
			bstpair bp=new bstpair();
			bp.isBst=true;
			bp.max=Integer.MIN_VALUE;
			bp.min=Integer.MAX_VALUE;
			return bp;
		}
		bstpair lp=isBST(node.left);
		bstpair rp=isBST(node.right);
		int lmax=lp.max;
		int rmax=rp.max;
		int lmin=lp.min;
		int rmin=rp.min;
		boolean mb;
		if(lp.isBst && rp.isBst && node.data>lmax && node.data<rmin)
			mb=true;
		else
			mb=false;
		
		
		bstpair mypair=new bstpair();
		mypair.isBst=mb;
		mypair.max=Math.max(Math.max(lmax, rmax),node.data);
		mypair.min=Math.min(Math.min(lmin, rmin),node.data);
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
	public BinaryTreeClass(int[] post,int[] in)
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
	public void removeLeaves()
	{
		removeLeaves(null,root,false);
	}
	private void removeLeaves(Node parent,Node node, boolean ilc)
	{
		if(node==null)
			return;
		
		if(node.left==null && node.right==null)
		{
			if(ilc)
				parent.left=null;
			else
				parent.right=null;
		}
		else if(node.left!=null && node.right==null)
			removeLeaves(node, node.left, true);
		else if(node.left==null && node.right!=null)
			removeLeaves(node, node.right, false);
		else
		{
			removeLeaves(node, node.left, true);
			removeLeaves(node, node.right, false);
		}	
	}
	public void printWithoutSiblings()
	{
		printWithoutSiblings(null,root,false);
	}
	private void printWithoutSiblings(Node parent,Node node,Boolean ilc)
	{
		if(node==null)
			return;
		if(ilc)
		{
			if(node.right==null)
				System.out.println(node.data);
		}
		else
		{
			if(node.left==null)
				System.out.println(node.data);
		}
		printWithoutSiblings(node, node.left, true);
		printWithoutSiblings(node, node.right, false);
	}
//	public void largest
	
}