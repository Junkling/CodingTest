package codingTest;

/**
 * 숫자 사각형 만들기 예제
 */

public class Square1 {
    public void solution1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
            System.out.printf("%5d",j+(n*i));
            }
            System.out.println();
        }
    }

    public void solution2(int n) {
        for (int i = 0; i < n; i++) {
            if (i%2==0) {
                for (int j = 0; j < n; j++) {
                    System.out.printf("%5d", (j+1) + (i*n));
                }
            }else{
                for (int j = 0; j < n; j++) {
                    System.out.printf("%5d", (n * (i+1)) - j);
                }
            }
            System.out.println();
        }
    }

    public void solution3(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%5d", ((i + 1) + (j * 4)));
            }
            System.out.println();
        }
    }

    public void solution4(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int result = (i + 1) * (j + 1);
                System.out.printf("%5d", result);
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Square1 square1 = new Square1();
        square1.solution1(4);

        System.out.println("=====================");
        square1.solution2(4);

        System.out.println("=====================");
        square1.solution3(4);

        System.out.println("=====================");
        square1.solution4(4);
    }
}
