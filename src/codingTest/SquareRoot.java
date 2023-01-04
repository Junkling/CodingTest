package codingTest;
public class SquareRoot {
    public SquareRoot() {
    }

    public long solution(long n) {
        long answer = 0L;

        for(int i = 0; (long)(i * i) <= n; ++i) {
            if ((long)(i * i) == n) {
                answer = (long)((i + 1) * (i + i));
                break;
            }

            answer = -1L;
        }

        return answer;
    }

    public static void main(String[] args) {
        SquareRoot squareRoot = new SquareRoot();
        long solution = squareRoot.solution(10000);
        System.out.println("solution = " + solution);
    }
}

