import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Dijkstra {

    public static class State implements Comparable<State>{
        int id, dist;
        public State(int a, int b){
            id = a;
            dist = b;
        }

        @Override
        public int compareTo(State o) {
            return dist - o.dist;
        }
    }

    public static int N;
    public static int M;
    public static int[][] matrix;
    public static int[] dist;
    public static PriorityQueue<State> pq;

    public static void dijkstra(int src){
        pq.add(new State(src, 0));
        dist[src] = 0;

        while(!pq.isEmpty()){
            State cur = pq.poll();

            for (int i = 0; i < N; i++){
                if (matrix[cur.id][i] != Integer.MAX_VALUE){
                    //dist[v] < dist[u] + <u, v>
                    //u = cur.id, v = i
                    int alt = dist[cur.id] + matrix[cur.id][i];
                    if (alt < dist[i]){
                        dist[i] = alt;
                        pq.add(new State(i, dist[i]));
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        pq = new PriorityQueue<>();
        matrix = new int[N][N];
        dist = new int[N];

        for (int i = 0; i < N; i++){
            dist[i] = Integer.MAX_VALUE;
            for (int j = 0; j < N; j++){
                matrix[i][j] = Integer.MAX_VALUE;
            }
        }

        for (int i = 0; i < M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int w = sc.nextInt();

            matrix[a][b] = matrix[b][a] = w;
        }

        dijkstra(0);

        System.out.println(Arrays.toString(dist));
    }
}

