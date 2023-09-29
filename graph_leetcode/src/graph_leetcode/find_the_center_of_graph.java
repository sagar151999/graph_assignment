package graph_leetcode;

public class find_the_center_of_graph {

	public static int findcenter(int [][]edges)
	{
		int a=edges[0][0];
		int b=edges[0][1];
		int x=edges[1][0];
		int y=edges[1][1];
		if(a==x) return a;
		if(a==y) return a;
		if(b==x) return x;
		if(b==y) return b;
		
		return 0;
	}
	public static void main(String[] args) 
	{
		int edges[][]= {{1,2},{5,1},{1,3},{1,4}};
		int solution=findcenter(edges);
		System.out.println(solution);
		

	}

}
