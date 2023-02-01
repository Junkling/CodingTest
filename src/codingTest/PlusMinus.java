package codingTest;

public class PlusMinus {
    public int solution(int n) {
        int answer = 1;
        String strAnswer = "1";
        for (int i = 1; i < n; i++) {
            if (i % 2 == 1) {
                System.out.println("answer = " + answer);
                answer = answer + (i + 1);
                strAnswer = strAnswer + " + " + (i + 1);
            } else {
                System.out.println("answer = " + answer);
                answer = answer - (i + 1);
                strAnswer = strAnswer + " - " + (i + 1);
            }
        }
        System.out.println("strAnswer = " + strAnswer);
        return answer;
    }

    public static void main(String[] args) {
        PlusMinus plusMinus = new PlusMinus();
        int solution = plusMinus.solution(13);
        System.out.println(solution);

    }
}
