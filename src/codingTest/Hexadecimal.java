package codingTest;

public class Hexadecimal {
    public String solution(int x, int y) {
        String answer = "";

        int intRest = 0;
        char chaRest = 'A';
        while (x > 0) {
            intRest = x % y;
            x = x/y;
            if (y>intRest&&intRest > 9) {
                chaRest = (char) (chaRest + (intRest-10));
                answer = chaRest + answer;
            }else{
            answer = intRest + answer;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Hexadecimal hexadecimal = new Hexadecimal();
        System.out.println("answer = "+hexadecimal.solution(20, 2));
    }
}
