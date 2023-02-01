package codingTest;

import java.util.Scanner;

public class PlusRecursive {
    public int solution(int x, int y) {
        if (x == y) {
            return x;
        }
        return y + solution(x,y - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        PlusRecursive plusRecursive = new PlusRecursive();
        int solution = plusRecursive.solution(start, end);
        System.out.println("solution = " + solution);
    }
}
