package Graphs;
import  java.util.*;

public class Dfs {
	
	
	//DFS traversal of graph
	
	public static void dfs(ArrayList<ArrayList<Integer>> adj , Integer src , boolean visited[]) {
		System.out.println(src);
		visited[src] = true;
		
		for(Integer it : adj.get(src)) {
			if(!visited[it]) {
				dfs(adj,it,visited);
			}
		}
	}
	
	public static void main(String args[]) {
		ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
		int V;
		
		Scanner sc = new Scanner(System.in); // for taking input
		System.out.print("Enter the number of vertices: ");
		V = sc.nextInt();
		
		for(int i=0;i<V;i++) {
			adj.add(new ArrayList<>());
		}
		
		adj.get(0).add(2);
	        adj.get(2).add(0);
	        adj.get(0).add(1);
	        adj.get(1).add(0);
	        adj.get(0).add(3);
	        adj.get(3).add(0);
	        adj.get(2).add(4);
	        adj.get(4).add(2);
		
		boolean visited[] = new boolean[V];
		dfs(adj,0,visited);
	}
}
