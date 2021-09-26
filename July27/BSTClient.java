package July27;

import July26.BinaryTreeClass;

public class BSTClient {

	public static void main(String[] args) {
		int[] post={12, 30, 40, 37, 25, 60, 70, 62, 87, 75, 50};
		int[] in={12, 25, 30, 37, 40, 50, 60, 62, 70, 75, 87};
//		BSTClass bt=new BSTClass(post,in);
//		bt.display();
//		System.out.println();
//		bt.add(38);
//		bt.add(45);
//		bt.display();
		
		BSTClass bt=new BSTClass(in);
		bt.display();
		bt.remove(70);
		System.out.println();
		
		bt.display();
		bt.inorder();
//		bt.replaceWithSumOfLargerNo();
//		bt.inorder();
		
		bt.printInRange(40, 75);
	}

}
