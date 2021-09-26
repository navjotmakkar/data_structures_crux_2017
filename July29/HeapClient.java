package July29;

public class HeapClient {

	public static void main(String[] args) {
		HeapClass heap=new HeapClass(true);
		 heap.add(300);
		 heap.add(200);
		 heap.add(700);
		 heap.add(600);
		 heap.add(800);
		 heap.add(900);
		 heap.add(100);
		 heap.display();
//		 while(heap.size()!=0)
//			System.out.println(heap.removeHP()); 
		int[] arr={300,200,700,600,800,900,100};
		HeapClass list =new HeapClass(true, arr);
		list.display();

	}

}
