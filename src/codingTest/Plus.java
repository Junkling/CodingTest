package codingTest;

public class Plus {
    public Plus() {
    }

    public int solution(int n) {
        int answer = 0;
        String num = Integer.toString(n);
        String[] num1 = num.split("");

        for(int i = 0; i < num1.length; ++i) {
            answer += Integer.parseInt(num1[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Plus plus = new Plus();
        int n = 123;
        int result = plus.solution(n);
        System.out.println("var10001 = " + result);
    }
}
