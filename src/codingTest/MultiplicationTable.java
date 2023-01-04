package codingTest;

/**
 * 구구단 예제
 */

public class MultiplicationTable {
    public void solution(int x, int y) {
        for (int i = x; i <= y; i++) {
            System.out.println("=========== "+i+"단 ============");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + "*" + j + " = " + (i * j));
            }
        }
    }

    public static void main(String[] args) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.solution(2, 9);
    }
}
