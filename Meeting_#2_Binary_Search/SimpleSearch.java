package tk.jimgao;

import java.util.Scanner;

public class SimpleSearch {
    public static int binary_search(int[] numbers, int query){
        int low = 0, high = numbers.length - 1;

        while(low <= high){
            int mid = (low + high) / 2;

            if (query < numbers[mid]){
                high = mid - 1;
            } else if (query > numbers[mid]){
                low = mid + 1;
            } else if (query == numbers[mid]){
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] numbers = new int[N];

        for (int i = 0; i < N; i++)
            numbers[i] = sc.nextInt();

        for (int i = 0; i < K; i++){
            int query = sc.nextInt();
            if (binary_search(numbers, query) != -1){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

}

