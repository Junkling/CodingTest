package codingTest;

import java.util.Scanner;

public class FactorialRecursive {
    public int solution(int n) {
        return factorial(n);
    }

    public int factorial(int x) {
        System.out.println("x = " + x);
        if (x == 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        FactorialRecursive factorialRecursive = new FactorialRecursive();
        int solution = factorialRecursive.solution(i);
        System.out.println("solution = " + solution);
    }
}
