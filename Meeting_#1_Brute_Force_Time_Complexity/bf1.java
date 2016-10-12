
import java.util.*;

public class bf1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int[] numbers = new int[N];

		Arrays.sort(numbers);

		for (int i = 0; i < N; i++){
			System.out.println(numbers[i]);
		}
	}
}
