
import java.util.Scanner;

public class bf3{

	public static boolean prime(int n){
		for (int i = 2; i < n; i++){
			if (n % i == 0) 
				return false;
		}

		return true;
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		while(true){
			N++;

			if (prime(N)){
				System.out.println(N);
				break;
			}
		}
	}
}
