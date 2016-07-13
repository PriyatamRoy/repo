package graph;

public class Graph {
	private Vertex[] vertexList;
	private int[][] adjMatrix;
	private int max;
	private int nVertex;
	private MyQueue q;
	
	Graph(int max){
		this.max = max;
		vertexList = new Vertex[max];
		nVertex = 0;
		adjMatrix = new int[max][max];
		q = new MyQueue(max);
		
		for(int i= 0; i<max; i++){
			for(int j= 0; j<max; j++){
				adjMatrix[i][j]=0;
			}
		}
	}
	
	public void addVertex(String label){
		if(nVertex<max)
		vertexList[nVertex++] = new Vertex(label);
		else
			System.out.println("Cant add vertex: "+label);
	}
	
	public void addEdge(int i, int j){
		adjMatrix[i][j]=1;
		adjMatrix[j][i]=1;
	}
	
	public void displayAdjMatrix(){
		System.out.print(" ");
		for(int i=0; i<nVertex; i++){
			System.out.print("   "+vertexList[i].label);
		}
		System.out.println();
		
		for(int i= 0; i<nVertex; i++){
			System.out.print(vertexList[i].label);
			for(int j= 0; j<nVertex; j++){
				System.out.print("   "+adjMatrix[i][j]);
			}
			System.out.println();
		}
	}
	
	public int adjEdge(int v){
		
			for(int j= 0; j<max; j++){
				if(adjMatrix[v][j]==1 && !vertexList[j].visited)
					return j;
			}
			return -1;
		
	}
	
	public void bfs(){
		vertexList[0].visited = true;
		q.insert(0);
		
		while(!q.isEmpty()){
			int v = q.remove();
			System.out.println(vertexList[v].label);
			int v2;
			while((v2 = adjEdge(v))!=-1){
				vertexList[v2].visited = true;
				q.insert(v2);
			}
		}
		
	}
	
	
	
}
