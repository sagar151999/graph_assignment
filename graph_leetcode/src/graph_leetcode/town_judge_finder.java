package graph_leetcode;

public class town_judge_finder {
	
	public static  int findtown(int n,int[][]trust)
	{
	
		int []indegrees=new int[n+1];
		int []outdegrees=new int[n+1];
		for (int [] relation: trust) {
			int a=relation[0];
			int b=relation[1];
			outdegrees[a]++;
			indegrees[b]++;
		}
		for(int i=1;i<=n;i++)
		{
			if(indegrees[i]==n-1 && outdegrees[i]==0)			{
				return i;
			}	
		}
		return -1;
}
	
	public static void main(String[] args) {
		int n1=2;
		int [][]trust1= {{1,2}};
		int result=findtown(n1,trust1);
		System.out.println(result);
	}

}
