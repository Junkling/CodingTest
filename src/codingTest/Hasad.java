package codingTest;

public class Hasad {
    public Hasad() {
    }

    public boolean solution(int x) {
        boolean answer = true;
        int a = x;

        int result;
        for(result = 0; x != 0; x /= 10) {
            result += x % 10;
        }

        answer = a % result == 0;
        return answer;
    }

    public static void main(String[] args) {
        Hasad hasad = new Hasad();
        boolean solution = hasad.solution(18);
        System.out.println("solution = " + solution);
    }
}