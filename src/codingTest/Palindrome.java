package codingTest;

import java.util.ArrayList;

/**
 * 각 자리수의 숫자가 대칭인 수
 */

public class Palindrome {
    public boolean solution1(int n) {
        boolean answer = true;
        ArrayList<Integer> list = new ArrayList<>();
        while (n > 0) {
            int rest = n % 10;
            list.add(rest);
            n /= 10;
        }
        for (int i = 0; i < list.size()/2; i++) {
            if(list.get(i)!=list.get((list.size()-1) - i)){
                answer = false;
                break;
            }
        }
        return answer;
    }

    boolean solution2(int n) {
        boolean answer = true;
        String str = Integer.toString(n);
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt((length - 1) - i)) {
                answer = false;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        boolean solution1 = palindrome.solution1(1234554321);
        boolean solution2 = palindrome.solution2(1234554321);
        System.out.println(solution1);
        System.out.println(solution2);
    }
}
