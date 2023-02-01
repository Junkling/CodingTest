package codingTest;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Scale {
    public String solution(int[] n) throws IOException {

        String answer = "mixed";
        boolean ascending = false;
        boolean descending = false;

        int length = n.length;

            if (n[0] == 1) {
                ascending = true;
                for (int i = 0; i < length-1; i++) {
                    if (n[i + 1] != n[i] + 1) {
                        ascending = false;
                        break;
                    }
                }
                if (ascending == true) {
                    answer = "ascending";
                }
            }
            if (n[0] == 8) {
                descending = true;
                for (int i = 0; i < length-1; i++) {
                    if (n[i + 1] != n[i] - 1) {
                        descending = false;
                        break;
                    }
                }
                if (descending == true) {
                    answer = "descending";
                }
            }else {
                return answer;
            }

        return answer;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("array = " + array.length);
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));

        Scale scale = new Scale();
        System.out.println(scale.solution(array));

    }
}
