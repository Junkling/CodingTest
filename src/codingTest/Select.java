package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class Select {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int length = str.length();
        int[] arr = new int[length];
        System.out.println("str = " + str);
        int x = Integer.parseInt(str);
        for (int i = 0; i < length; i++) {
            arr[length - i - 1] = x % 10;
            x /= 10;
        }
        System.out.println("arr[i] = " + Arrays.toString(arr));

        for (int i = 0; i < length; i++) {
            int max = i;
            for (int j = i + 1; j < length; j++) {
                if (arr[i] < arr[j]) {
                    max = j;
                }
                if (i != max) {
                    int tmp = arr[i];
                    arr[i] = arr[max];
                    arr[max] = tmp;
                }
            }
            System.out.print(arr[i]);
        }
    }
}
