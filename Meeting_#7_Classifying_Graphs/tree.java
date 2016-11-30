import java.util.Scanner;

public class tree {

    public static int N = 4;
    public static int M = 0;
    public static boolean[][] matrix;
    public static boolean[] visited;

    public static void dfs(int cur){
        visited[cur] = true;
        for (int i = 0; i < N; i++){
            if (matrix[cur][i] && !visited[i])
                dfs(i);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        matrix = new boolean[4][4];
        visited = new boolean[4];

        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                int n = sc.nextInt();

                if (n == 1){
                    matrix[i][j] = true;
                    M++;
                }
            }
        }

        M /= 2;

        if (N - 1 == M){
            dfs(0);

            boolean flag = true;
            for (int i = 0; i < N; i++){
                if (!visited[i]) flag = false;
            }

            if (flag){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}

