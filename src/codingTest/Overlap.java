package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * 0~100까지 숫자를 배열로 받았을 때 1번 이상 입력된 숫자를 출력하시오
 */

public class Overlap {
    public void solution(int[] arr) {
        int[] ints = new int[101];
        boolean[] booleans = new boolean[101];
        ArrayList<Integer> result = new ArrayList<>();
//        int[] arr1 = Arrays.stream(arr).sorted().toArray();
        Arrays.sort(arr);
        for (int i : arr) {
            if (booleans[i] == false) {
                ints[i] = i;
                booleans[i] = true;
                result.add(i);
            }
        }
        System.out.println(result.toString());
    }

    public static void main(String[] args) {
        Overlap overlap = new Overlap();
        int[] intArr = {1, 2, 3,3,3,3,3,4,1,5,0,12,100,12,45,42,1,23,14,56,86,99};
        overlap.solution(intArr);
    }
}
