
import java.util.Scanner;

public class ccc06j2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int M = sc.nextInt();

		int count = 0;

		for (int i = 1; i <= N; i++){
			for (int j = 1; j <= N; j++){
				if (i + j == 10){
					count++;
				}
			}
		}

		System.out.println(count);
	}
}
