package codingTest;

/**
 * 사이클 예제
 * 백준 1110번
 */
public class Cycle {
    public void solution1(int n) throws Exception {
        if (!(1 <= n && n <= 100)) {
            throw new Exception("범위 밖입니다.");
        }
        int x = n;
        int count = 0;

        while (true) {
            int length = Integer.toString(x).length();
            int restSum = 0;
            int y = x;
            while (y > 0) {
                restSum += y % 10;
                y /= 10;
            }
            System.out.println("restSum = " + restSum);
            int i1 = x % 10;
            x = (i1 * 10) + (restSum % 10);
            count++;
            if (x == n) {
                break;
            }
        }
        System.out.println("count = " + count);
    }
    public void solution2(int n) throws Exception {
        if (!(1 <= n && n <= 100)) {
            throw new Exception("범위 밖입니다.");
        }
        int rest = n;
        int tmp = 0;
        int count = 0;
        do {
            tmp = (rest / 10) + (rest % 10);
            rest = rest % 10 * 10 + tmp % 10;
            count++;
        } while (n != rest);
        System.out.println("count = " + count);
    }

    public static void main(String[] args) throws Exception {
        Cycle cycle = new Cycle();
        cycle.solution1(42);
        cycle.solution2(42);
    }
}
