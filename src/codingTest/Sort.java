package codingTest;

import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public Sort() {
    }

    public Long solution(long n) {
        long answer = 0L;
        String num = Long.toString(n);
        String[] split = num.split("");
        Arrays.sort(split, Collections.reverseOrder());
        String result = "";
        String[] var8 = split;
        int var9 = split.length;

        for(int var10 = 0; var10 < var9; ++var10) {
            String s = var8[var10];
            result = result + s;
        }

        answer = Long.parseLong(result);
        return answer;
    }

    public static void main(String[] arg) {
        Sort a = new Sort();
        Long solution = a.solution(1234L);
        System.out.println(solution);
    }
}
