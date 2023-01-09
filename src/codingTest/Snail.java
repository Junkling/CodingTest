package codingTest;

import java.util.Arrays;

/**
 * 달팽이 예제
 */
public class Snail {

    public void solution(int n) {

        int[][] ints = new int[n][n];

        int x = 0;
        int y = 0;
        int z = n;
        int input = 1;

        for (int i = 0; i < (2*n)-1; i++) {
            switch (i % 4) {
                case 0:
                    for (int j = 0; j <z; j++) {
                        ints[x][y] = input;
                        input++;
                        y++;
                    }
                    x++;
                    y--;
                    z--;
                    break;
                case 1:
                    for (int j = 0; j < z; j++) {
                        ints[x][y] = input;
                        input++;
                        x++;
                    }
                    y--;
                    x--;
                    break;
                case 2:
                    for (int j = 0; j < z; j++) {
                        ints[x][y] = input;
                        input++;
                        y--;
                    }
                    x--;
                    y++;
                    z--;
                    break;
                case 3:
                    for (int j = 0; j < z; j++) {
                        ints[x][y] = input;
                        input++;
                        x--;
                    }
                    x++;
                    y++;
                        break;
            }
        }

        System.out.println("ints = " + Arrays.deepToString(ints));
        System.out.println();
        System.out.println("==== result =====");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%3d", ints[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Snail snail = new Snail();
        snail.solution(5);

    }

}

