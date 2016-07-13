package graph;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph(10);
		
		graph.addVertex("A");
		graph.addVertex("D");
		graph.addVertex("G");
		graph.addVertex("B");
		graph.addVertex("H");
		graph.addVertex("E");
		graph.addVertex("C");
		graph.addVertex("I");
		graph.addVertex("F");
		
		graph.addEdge(0,3);
		graph.addEdge(0,4);
		graph.addEdge(0,6);
		graph.addEdge(3,2);
		graph.addEdge(3,8);
		graph.addEdge(8,1);
		graph.addEdge(2,7);
		graph.addEdge(7,5);
		
		graph.displayAdjMatrix();
		System.out.println("----------------------------------------------");
		graph.bfs();
		
	}

}
