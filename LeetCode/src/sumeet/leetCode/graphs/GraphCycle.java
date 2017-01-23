package sumeet.leetCode.graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class GraphCycle {

	private int v;
	private LinkedList<Integer> adj[];
	
	GraphCycle(int v){
		this.v = v;
		adj = new LinkedList[v];
		for(int i = 0; i < v; i ++){
			adj[i] = new LinkedList();
		}
	}
	
	public void addEdge(int v , int w){
		adj[v].add(w);
	}
	
	public boolean hasCycleUtil(int v , boolean[] isVisited, boolean[] rec){
		
		if(isVisited[v] == false){
			
			isVisited[v] = true;
			rec[v] = true;
			
			Iterator<Integer> it =  adj[v].listIterator();
			while(it.hasNext()){
				int n = it.next();
				if(!isVisited[n] && hasCycleUtil(n, isVisited, rec)){
					return true;
				}
				else if(rec[n]){
					return false;
				}
			}
		}
		rec[v] = false;
		return false;
	}
	
	public boolean cycle(){
		
		boolean[] isVisited = new boolean[v];
		boolean[] rec = new boolean[v];
		
		for(int i = 0; i < v; i++){
			isVisited[i]= false;
			rec[i] = false;
		}
		
		for(int i = 0; i < v; i++){
			if(hasCycleUtil(i, isVisited,rec)){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args){
		
		GraphCycle g = new GraphCycle(4);
		g.addEdge(0, 1);
	    g.addEdge(0, 2);
	    g.addEdge(1, 2);
	    g.addEdge(2, 0);
	    g.addEdge(2, 3);
	    g.addEdge(3, 3);
	    
	    System.out.println(g.cycle());
	}
}
