package codingTest;

public class BinaryNumberRecursive {
    public void solution(int n) {
        if (n / 2 == 0) {
            System.out.print(n);
            return;
        }
        solution(n / 2);
        System.out.print(n % 2);
    }

    public static void main(String[] args) {
        BinaryNumberRecursive binaryNumberRecursive = new BinaryNumberRecursive();
        binaryNumberRecursive.solution(5);
    }
}
