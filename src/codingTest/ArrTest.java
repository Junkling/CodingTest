package codingTest;

import java.util.*;
public class ArrTest {
    public ArrTest() {
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] secretMap = new int[n];

        for(int i = 0; i < n; ++i) {
            secretMap[i] = arr1[i] | arr2[i];
            System.out.println("secretMap = " + Arrays.toString(secretMap));
        }

        int x = 31;
        System.out.println("x = " + x);
        return answer;
    }

    public static void main(String[] args) {
        ArrTest arrTest = new ArrTest();
        int[] arr1 = new int[]{9, 20, 28, 18, 11};
        int[] arr2 = new int[]{30, 1, 21, 17, 28};
        String[] solution = arrTest.solution(5, arr1, arr2);
        System.out.println("arr2 = " + Arrays.toString(solution));
    }
}

