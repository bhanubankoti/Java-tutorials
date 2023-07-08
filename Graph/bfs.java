package Graphs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
	
	static void bfs(ArrayList<ArrayList<Integer>> adj , Integer src) {
		boolean visited[] = new boolean[adj.size()];
		Queue<Integer> q = new LinkedList<>();
		q.add(src);
		visited[src] = true;
		
		while(!q.isEmpty()) {
			Integer node = q.poll();
			System.out.println(node);
			
			for(Integer it : adj.get(node)) {
				if(visited[it] == false) {
					visited[it] = true;
					q.add(it);
				}
			}
			
		}
	}
	
	public static void main(String args[]){
	int v = 5;
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		for(int i=0;i<v;i++) { // revisit this 
			adj.add(new ArrayList<>());
		}
		
		adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(4);
        adj.get(4).add(0);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(1).add(3);
        adj.get(3).add(1);
        
        bfs(adj, 0);
		
	}
}
