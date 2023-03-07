package codingTest;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class BinarySearch {

    public static void main(String[] args) {
        int search1 = search1(40, makeArr());
        int search2 = search2(40, makeArr(), 0, 9);
        System.out.println("search2 = " + search2);
        print(search1);
        print(search2);
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
        Arrays.sort(array);
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        return array;
    }

    public static int search1(int input, int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int location;
        while (left <= right) {
            location = (left + right) / 2;
            if (arr[location] > input) {
                right = location-1;
            }
            if (arr[location] < input) {
                left = location+1;
            }
            if (arr[location] == input) {
                return location+1;
            }
        }
        return 0;
    }

    public static int search2(int input, int[] arr, int left, int right) {
        int location;
        if (left <= right) {
             location=(right + left) / 2;
            System.out.println("arr[location] = " + arr[location]);
            if (arr[location] == input) {
                return location + 1;
            } else if (arr[location] > input) {
                return search2(input, arr, left, location - 1);
            } else {
                return search2(input, arr, location + 1, right);
            }
        }
        return 0;
    }


    public static void print(int n) {
        if (n == 0) {
            System.out.println("해당 숫자는 없습니다.");
        }else {
            System.out.println(n + "번째 자리에 있습니다.");
        }
    }

}

