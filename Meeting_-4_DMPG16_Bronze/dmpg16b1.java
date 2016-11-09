import java.util.Scanner;

public class dmpg16b1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int D = sc.nextInt();
		int Q = sc.nextInt();
		int L = sc.nextInt();
		int T = sc.nextInt();
		
		System.out.println(N * 5 + D * 10 + Q * 25 + L * 100 + T * 200);
	}
}
