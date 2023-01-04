package codingTest;

import java.util.Arrays;

public class String1 {
    public String1() {
    }

    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
        String[] arr3 = new String[arr.length];

        for(int i = 0; i < arr.length; ++i) {
            String a = "";
            String[] arr2 = arr[i].split("");

            for(int j = 0; j < arr2.length; ++j) {
                if (j % 2 == 0) {
                    arr2[j] = arr2[j].toUpperCase();
                }

                a = a + arr2[j];
            }

            System.out.println("arr2 = " + Arrays.toString(arr2));
            System.out.println("arr = " + Arrays.toString(arr));
            arr[i] = a;
        }

        answer = String.join(" ", arr);
        System.out.println("arr3 = " + Arrays.toString(arr3));
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        String1 string1 = new String1();
        String solution = string1.solution("hello world");
        System.out.println(solution);
    }
}

