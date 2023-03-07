package codingTest;

import java.util.*;

public class SequentialSearch {

    public static void main(String[] args) {
        int search = search(40, makeArr());
        print(search);
    }
    public static int[] makeArr() {
        Set<Integer> set = new HashSet<>();
        while (set.size() < 10) {
            int num = (int)(Math.random()*45 + 1);
            System.out.println("num = " + num);
            set.add(num);
        }
        System.out.println(set.size());

        int[] array = set.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        return array;
        }

    public static int search(int input, int[] arr) {
        int count = 1;
        boolean b = false;
        for (int i = 0; i < 10; i++) {
            if (arr[i] == input) {
                b = true;
                break;
            }
            count++;
        }
        if (b == false) {
            count=0;
        }
        return count;
    }

    public static void print(int n) {
        if (n == 0) {
            System.out.println("해당 숫자는 없습니다.");
        }else {
            System.out.println(n + "번째 자리에 있습니다.");
        }
    }

}
