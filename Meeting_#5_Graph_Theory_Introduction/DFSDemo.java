
import java.util.Scanner;

public class DFSDemo{

	public static int N;
	public static int M;

	public static boolean[][] matrix;
	public static boolean[] visited;

	public static void dfs(int cur){
		System.out.println(cur);

		for (int i = 0; i < N; i++){
			if (matrix[cur][i] && !visited[i]){
				visited[i] = true;
				dfs(i);
			}
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		//Number of nodes / vertices
		N = sc.nextInt();

		//Number of edges
		M = sc.nextInt();

		//Adjacency matrix
		matrix = new boolean[N][N];
		visited = new boolean[N];

		for (int i = 0; i < M; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();

			matrix[a][b] = true;
			matrix[b][a] = true;
		}

		visited[0] = true;
		dfs(0);
	}
}
