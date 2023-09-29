package graph_leetcode;

import java.util.ArrayList;
import java.util.List;

public class findpath_source_to_target {

	 
		public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
			List<List<Integer>> result = new ArrayList<>();
			List<Integer> path = new ArrayList<>();
			dfs(0, graph, path, result);
			return result;
		}

		private void dfs(int node, int[][] graph, List<Integer> path, List<List<Integer>> result) {
			path.add(node);

			if (node == graph.length - 1) {
				result.add(new ArrayList<>(path));
			} else {
				for (int neighbor : graph[node]) {
					dfs(neighbor, graph, path, result);
				}
			}

			path.remove(path.size() - 1);
		}

		public static void main(String[] args) {
			findpath_source_to_target solution = new findpath_source_to_target();
			int[][] graph1 = { { 1, 2 }, { 3 }, { 3 }, {} };
			List<List<Integer>> paths1 = solution.allPathsSourceTarget(graph1);
			System.out.println(paths1);

			int[][] graph2 = { { 4, 3, 1 }, { 3, 2, 4 }, { 3 }, { 4 }, {} };
			List<List<Integer>> paths2 = solution.allPathsSourceTarget(graph2);
			System.out.println(paths2);
		}
	}