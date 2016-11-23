
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class Problem1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		boolean matrix[][] = new boolean[N][N];
		boolean visited[] = new boolean[N];
		
		for (int i = 0; i < M; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			matrix[a][b] = true;
			matrix[b][a] = true;
		}
		
		Queue<Integer> q = new Queue<Integer>();
		q.add(A);
		while(!q.isEmpty()){
			int cur = q.poll();
			
			if (visited[cur]) continue;
			visited[cur] = true;
			
			for (int i = 0; i < N; i++){
				if (matrix[cur][i] && !visited[i]){
					q.add(i);
				}
			}
		}
		
		if (visited[B]){
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
