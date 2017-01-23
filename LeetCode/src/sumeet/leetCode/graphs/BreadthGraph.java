package sumeet.leetCode.graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class BreadthGraph {

	private int v;
	private LinkedList<Integer>[] adj;
	
	BreadthGraph(int v){
		this.v = v;
		adj = new LinkedList[v];
		for(int i = 0; i < v; i++){
			adj[i] = new LinkedList();
		}
	}
	
	void addEdge(int v, int w){
		adj[v].add(w);
	}
	
	public void breadthFirstSerach(int s){
		
		boolean[] isVisited = new boolean[v];
		
		LinkedList<Integer> q = new LinkedList<Integer>();
		isVisited[s] = true;
		q.add(s);
		
		while(!q.isEmpty()){
			s = q.poll();
			
			System.out.print(s + " ");
			
			Iterator<Integer> it = adj[s].listIterator();
			while(it.hasNext()){
				int n = it.next();
				if(!isVisited[n]){
					isVisited[n] = true;
					q.add(n);
				}
			}
		}
	}
	
	public static void main(String[] args){
		
		BreadthGraph g = new BreadthGraph(4);
		 
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
 
        System.out.println("Following is Breadth First Traversal "+
                           "(starting from vertex 2)");
 
        g.breadthFirstSerach(1);
	}
}
