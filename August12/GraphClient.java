package August12;

public class GraphClient {

	public static void main(String[] args) {
		GraphClass graph=new GraphClass();
		graph.addVertex("A");
		graph.addVertex("B");
		graph.addVertex("C");
		graph.addVertex("D");
		graph.addVertex("E");
		graph.addVertex("F");
		graph.addVertex("G");
		
		graph.addEdge("A", "B", 10);
		graph.addEdge("B", "C", 10);
		graph.addEdge("C", "D", 10);
		graph.addEdge("A", "D", 40);
		graph.addEdge("D", "E", 2);
		graph.addEdge("E", "F", 3);
		graph.addEdge("E", "G", 8);
		graph.addEdge("F", "G", 3);
		graph.display();
//		
//		System.out.println(graph.hasPath("A","G"));
////		graph.removeEdge("D", "E");
//		System.out.println(graph.hasPath("A","G"));
//		System.out.println(graph.bfs("A", "G"));
//		System.out.println(graph.dfs("A", "G"));
//		graph.bft();
//		System.out.println();
//		graph.dft();
//		System.out.println();
////		graph.removeEdge("D", "E");
//		System.out.println(graph.isConnected());
////		graph.removeEdge("B", "C");
////		graph.removeEdge("F", "E");
//		System.out.println(graph.isCyclic());
////		graph.addEdge("D", "E", 2);
//		System.out.println(graph.isTree());
		System.out.println(graph.djikstra("A"));
		graph.prims().display();
	}

}
