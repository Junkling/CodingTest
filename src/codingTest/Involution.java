package codingTest;

/**
 * 거듭제곱 예제
 */
public class Involution {
    public int solution(int x, int y) {
        int answer = 1;
        for (int i = 0; i < y; i++) {
            answer *= x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Involution involution = new Involution();
        int solution = involution.solution(5, 7);
        System.out.println("solution = " + solution);

    }
}
