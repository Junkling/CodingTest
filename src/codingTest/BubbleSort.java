package codingTest;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        CustomArr[] arr = new CustomArr[n];
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            arr[i] = new CustomArr(x, i);
        }
        Arrays.sort(arr);
        int max = 0;
        for (int i = 0; i < n; i++) {
            if (max < arr[i].index - i) {
                max = arr[i].index - i;
            }
        }
        System.out.println("max = " + (max+1));
    }

    }
    class CustomArr implements Comparable<CustomArr> {

        int value;
        int index;

        public CustomArr(int value, int index) {
            super();
            this.value = value;
            this.index = index;
        }

        @Override
        public int compareTo(CustomArr o) {
            //오름차순 정렬
            return this.value - o.value;
        }
}
