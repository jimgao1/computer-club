import java.util.Scanner;

public class ccc02s2 {

    public static int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a % b == 0){
            System.out.println(a / b);
        } else {
            int g = gcd(a, b);
            a /= g;
            b /= g;

            if (a > b){
                int n = a / b;
                a -= b * n;

                System.out.println(n + " " + a + "/" + b);
            } else {
                System.out.println(a + "/" + b);
            }
        }
    }
}

