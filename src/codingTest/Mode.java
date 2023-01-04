package codingTest;

import java.util.Arrays;

/**
 * 최빈수 예제
 */

public class Mode {
    public int[] mode(int[] arr) {
        int length = arr.length;
        int arrMax = 0;
        for (int i = 0; i < length; i++) {
            if(arrMax<arr[i]){
                arrMax = arr[i];
            }
        }
        int[] answer = new int[arrMax];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < length; j++) {
                if(i==(arr[j]-1)){
                    answer[i]++;
                }
            }
        }

        int[] result = new int[2];
        for (int i = 0; i < answer.length; i++) {
            if (result[1] < answer[i]) {
                result[0] = i+1;
                result[1] = answer[i];
            }
        }
        System.out.println("answer = " + Arrays.toString(answer));
        return result;
    }

    public static void main(String[] args) {
        Mode mode = new Mode();
        int[] arr = {1,2,3,1,2,3,1,2,3,1,2,3,1,2,1,2,1,2,3,3,3,1,2,3,1};
        int[] mode1 = mode.mode(arr);
        System.out.println(Arrays.toString(mode1));
    }
}
