package sumeet.leetCode.graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class DepthGraph {
	
	private int v;
	private LinkedList<Integer> adj[];
	
	DepthGraph(int v){
		this.v = v;
		adj = new LinkedList[v];
		for(int i = 0; i < v; i++){
			adj[i] = new LinkedList();
		}
	}
	
	void addEdge(int v, int w){
		adj[v].add(w);
	}
	
	public void depthFirstSerach(){
		boolean[] isVisited = new boolean[v];
		
		for(int i = 0; i < v; i++){
			if(isVisited[i] == false){
				DFSUtil(i, isVisited);
			}
		}	
	}
	
	public void DFSUtil(int v , boolean[] isVisited){
		
		isVisited[v] = true;
		System.out.print(v + " ");
		
		Iterator<Integer> it = adj[v].listIterator();
		while(it.hasNext()){
			int s = it.next();
			if(isVisited[s] == false){
				DFSUtil(s, isVisited);
			}
		}
	}
	
	public static void main(String[] args){
		DepthGraph g = new DepthGraph(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.depthFirstSerach();
	}

}
