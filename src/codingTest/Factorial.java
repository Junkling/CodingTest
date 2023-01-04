package codingTest;

/**
 * 팩토리얼 예제
 */

public class Factorial {
    public int solution(int n) {
        int answer = 1;
        while (true) {
            answer *= n;
            n--;
            if (n == 1) {
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int solution = factorial.solution(5);
        System.out.println(solution);
    }
}
