package codingTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Plus3 {
    public Plus3() {
    }

    public int[] solution(int[] numbers) {
        List<Integer> arrayList = new ArrayList();

        for(int i = 0; i < numbers.length; ++i) {
            for(int j = i + 1; j < numbers.length; ++j) {
                arrayList.add(numbers[i] + numbers[j]);
            }
        }

        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        Plus3 plus3 = new Plus3();
        int[] a = new int[]{2, 1, 3, 4, 1};
        int[] solution = plus3.solution(a);
        System.out.println("solution = " + Arrays.toString(solution));
    }
}
