package codingTest;

public class Main {
    public Main() {
    }

    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n + 1];

        for(int i = 2; i <= n; ++i) {
            if (arr[i] == 0) {
                ++answer;

                for(int j = i; j <= n; j += i) {
                    arr[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main main = new Main();
        int solution = main.solution(100);
        System.out.println("solution = " + solution);
    }
}