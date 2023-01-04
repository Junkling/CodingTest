package codingTest;

import java.util.ArrayList;

/**
 * 최대 공약수 예제
 */
public class GreatestCommon {
    public int solution(int x, int y) {

        if (x < y) {
            int n = x;
            x = y;
            y = n;
        }
        int answer = 0;
        for (int i = 1; i < x; i++) {
            if ((x % i) == 0 && (y % i) == 0) {
                answer = i;
                System.out.println("i = " + i);
            }
            if (i > y) {
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        GreatestCommon greatestCommon = new GreatestCommon();
        System.out.println(greatestCommon.solution(50, 5000));
    }

}
