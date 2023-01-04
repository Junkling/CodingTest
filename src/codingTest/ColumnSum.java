package codingTest;

/**
 * 자리수 합 구하기
 */

public class ColumnSum {
    public int solution(int n) {
        int x = n;
        int answer = 0;
        while (x>0) {
            answer += x % 10;
            x /= 10;

        }
        return answer;
    }

    public static void main(String[] args) {
        int solution = new ColumnSum().solution(5108114);
        System.out.println("자리수 합 = " + solution);
    }
}
