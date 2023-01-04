package codingTest;

import java.util.Arrays;

public class Collatz {
    public Collatz() {
    }

    public int[] solution(long n) {
        int length = Long.toString(n).length();
        int[] answer = new int[length];

        for(int i = 0; i < answer.length; ++i) {
            answer[i] = (int)n % 10;
            n /= 10L;
        }

        return answer;
    }

    public static void main(String[] args) {
        Collatz collatz = new Collatz();
        int[] solution = collatz.solution(12345L);
        System.out.println("Arrays.toString(solution) = " + Arrays.toString(solution));
    }
}

