package codingTest;

import java.util.Arrays;

/**
 * 숫자 개수 출력하기
 */

public class CountNum {
    public int[] solution(int n) {
        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            int x = n;
            while (x > 0) {
                int y = x % 10;
                if (y == i) {
                    arr[i]++;
                }
                x /= 10;
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        CountNum countNum = new CountNum();
        int[] solution = countNum.solution(1234567890);
        System.out.println("숫자별 개수 = " + Arrays.toString(solution));
        for (int i = 0; i < solution.length; i++) {
            System.out.println((i) + " : " + solution[i]);
        }
    }
}
