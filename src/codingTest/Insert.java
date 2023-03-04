package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class Insert {
    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] arr = new int[n];
    int[] sum = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 1; i < n; i++) {
            int location = i;
            int value = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] > arr[j]) {
                    location = j + 1;
                    break;
                }
                if (j == 0) {
                    location = 0;
                }
            }
            for (int j = i; j > location; j--) {
                arr[j] = arr[j - 1];
            }
            arr[location] = value;
            }
        sum[0] = arr[0];
        for (int i = 1; i < n; i++) {
            sum[i] = sum[i - 1] + arr[i];
        }
        int answer = 0;
        for (int i : sum) {
            answer += i;
        }
        System.out.println("Arrays.toString(sum) = " + Arrays.toString(sum));
        System.out.println("answer = " + answer);
    }

}
