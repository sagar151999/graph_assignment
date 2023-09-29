package graph_leetcode;

import java.util.ArrayList;

public class PathFinder {
	 public static boolean validPath(int n, int[][] edges, int source, int destination) {
		 ArrayList<Integer>[]graph=new ArrayList[n];
		 for(int i=0;i<n;i++)
		 {
			 graph[i]=new ArrayList<>();
		 }
		 for (int [] edge : edges) 
		 {
			 int u=edge[0];
			 int v=edge[1];
			 graph[u].add(v);
			 graph[v].add(u);
		}
		
		 return hasPath(graph,source,destination,new boolean[n]);
	 }
	private static boolean hasPath(ArrayList<Integer>[] graph, int source, int destination, boolean[] vis) 
	{
		if(source==destination)
		{
			return true;
		}
		vis[source]=true;
		for(int i=0;i<graph[source].size();i++)
		{
			int e=graph[source].get(i);
			if(!vis[e] && hasPath(graph,e,destination,vis))
			{
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) 
	{
		int [][]edges= {{0,1},{0,2},{3,5},{5,4},{4,3}};
		int n=6;
		int source=0;
		int destination=5;
		System.out.println(validPath(n,edges,source,destination));
	}

}
