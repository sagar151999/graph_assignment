package graph_leetcode;

import java.util.ArrayList;
import java.util.List;

public class minimum_no_of_vertices {
	 public List<Integer> findVertices(int n, int[][] edges)
	    {
	        
	        List<Integer>[] adjacencyList = new ArrayList[n];
	        for(int i = 0; i < n; i++)
	        {
	            adjacencyList[i] = new ArrayList<>();
	        }
	        
	        int[] inDegree = new int[n];
	        for(int[] edge : edges)
	        {
	            int from = edge[0];
	            int to = edge[1];
	            adjacencyList[from].add(to);
	            inDegree[to]++;
	        }
	        
	        
	        List<Integer> result = new ArrayList<>();
	        for(int i = 0; i < n; i++)
	        {
	            if(inDegree[i] == 0)
	                result.add(i);
	        }
	        
	        return result;
	    }

	    public static void main(String[] args) 
	    {
	    	minimum_no_of_vertices solution = new minimum_no_of_vertices();
	        
	       
	        int n = 5;
	        int[][] edges = {
	            {0, 1},
	            {2, 1},
	            {3, 1},
	            {1, 4},
	            {2, 4}
	        };
	        List<Integer> result1 = solution.findVertices(n, edges);
	        System.out.println(result1);
	        
	    }
	}