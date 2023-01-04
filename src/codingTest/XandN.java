package codingTest;

import java.util.Arrays;

public class XandN {
    public XandN() {
    }

    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long sum = 0L;

        for(int i = 0; i < n; ++i) {
            sum += (long)x;
            answer[i] = sum;
        }

        return answer;
    }

    public static void main(String[] args) {
        XandN xAndN = new XandN();
        long[] solution = xAndN.solution(-4, 5);
        System.out.println("solution = " + Arrays.toString(solution));
    }
}
