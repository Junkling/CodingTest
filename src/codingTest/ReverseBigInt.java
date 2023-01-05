package codingTest;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * 숫자 뒤집기
 * 백준 2908
 */

public class ReverseBigInt {
    public void solution1(int x, int y) {
        ArrayList<Integer> listX = new ArrayList<>();
        ArrayList<Integer> listY = new ArrayList<>();

        while (x > 0) {
            listX.add(x % 10);
            x /= 10;
        }
        while (y > 0) {
            listY.add(y % 10);
            y /= 10;
        }
        int sizeX =  listX.size();
        int sizeY =  listY.size();

        double reverseX = 0;
        double reverseY = 0;

        System.out.println("listX = " + listX.toString());
        System.out.println("listY = " + listY.toString());

        for (int i = 0; i < sizeX; i++) {
            reverseX += listX.get(i) * Math.pow(10, (sizeX - 1 - i));
            }
        System.out.println("reverseX = " + reverseX);

        for (int i = 0; i < sizeY; i++) {
            reverseY += listY.get(i) * Math.pow(10,sizeY-1-i);
        }
        System.out.println("reverseY = " + reverseY);

        double max = Math.max(reverseX, reverseY);
        System.out.println("max = " + (int)max);

    }

    public void solution2(int x, int y) {
        int resultX = 0;
        int resultY = 0;
        while (x > 0) {
            resultX = resultX * 10 + (x % 10);
            x /= 10;
        }
        while (y > 0) {
            resultY = resultY * 10 + (y % 10);
            y /= 10;
        }

        System.out.println("resultX = " + resultX);
        System.out.println("resultY = " + resultY);
        System.out.println(Math.max(resultX, resultY));

    }

    public static void main(String[] args) {
        ReverseBigInt reverseBigInt = new ReverseBigInt();
        reverseBigInt.solution1(734, 893);
        reverseBigInt.solution2(1053, 615);
    }
}
