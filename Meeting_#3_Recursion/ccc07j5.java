import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ccc07j5 {

    public static int A;
    public static int B;
    public static int N;

    public static int ways = 0;

    public static ArrayList<Integer> motels;

    public static void drive(int stop){
        if (stop == motels.size() - 1) {
            ways++;
            return;
        }

        for (int i = stop + 1; i < motels.size(); i++){
            int dist = motels.get(i) - motels.get(stop);
            if (dist >= A && dist <= B)
                drive(i);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        A = sc.nextInt();
        B = sc.nextInt();
        N = sc.nextInt();

        motels = new ArrayList<>();
        int[] M = {0, 990, 1010, 1970, 2030, 2940, 3060, 3930, 4060, 4970, 5030, 5990, 6010, 7000};
        for (int i : M) motels.add(i);

        for (int i = 0; i < N; i++){
            int location = sc.nextInt();
            motels.add(location);
        }

        Collections.sort(motels);

        drive(0);
        System.out.println(ways);
    }
}

