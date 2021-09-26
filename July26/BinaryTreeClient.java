package July26;

public class BinaryTreeClient {

	public static void main(String[] args) {
		// 50 true 25 true 12 false false true 37 true 30 false false true 40 false false true 75 true 62 true 60 false false true 70 false false true 87 false false
//		50 true 30 true 12 false true 25 false false true 37 false true 40 false false true 62 false true 75 false false
//		int[] post={12, 30, 40, 37, 25, 60, 70, 62, 87, 75, 50};
//		int[] in={12, 25, 30, 37, 40, 50, 60, 62, 70, 75, 87};
		BinaryTreeClass bt=new BinaryTreeClass();
		bt.display();
//		System.out.println("size: "+bt.size2());
//		System.out.println("max: "+bt.max());
//		System.out.println("height: "+bt.height());
//		System.out.println("find: "+bt.find(720));
//		System.out.println(bt.diameter());
//		System.out.println(bt.daimeter2());
//		System.out.println(bt.isBal());
//		System.out.println(bt.isBST());
//		bt.preorder();
		bt.inorder();
//		bt.postorder();
//		bt.levelOrder();
//		bt.preorder2();
//		bt.inorder2();
//		bt.postorder2();
//		bt.removeLeaves();
		bt.display();
		bt.printWithoutSiblings();
	}
	
}
