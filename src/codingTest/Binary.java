package codingTest;

/**
 * 2진수 예제
 */

public class Binary {
    public String solution(int n) {
        String answer = "";
        int a = n;
        while (true) {
            int b = a % 2;
            a = a / 2;
            answer = b+answer;
            if (a == 0) {
                break;
            }

        }
        return answer;
    }

    public static void main(String[] args) {
        Binary binary = new Binary();
        String solution = binary.solution(10);
        System.out.println("solution = " + solution);
    }
}
