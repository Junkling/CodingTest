package codingTest;

/**
 * 문자열 뒤집기
 */

public class ReverseString {
    public String solution1(String str) {
        String answer = "";
        int length = str.length();
        for (int i = 0; i <length; i++) {
            answer += str.charAt((length - 1) - i);
        }
        return answer;
    }

    public String solution2(String str) {
        char chaArr[] = str.toCharArray();
        int length = str.length();
        char tmp;
        for (int i = 0; i<length/ 2; i++) {
            tmp = chaArr[i];
            chaArr[i] = chaArr[length - 1 - i];
            chaArr[length - 1 - i] = tmp;
        }
        String s = new String(chaArr);
        return s;
    }

    public static void main(String[] args) {
        ReverseString reverseString = new ReverseString();
        String solution1 = reverseString.solution1("qwer");
        String solution2 = reverseString.solution2("qwertyui");
        System.out.println("solution = " + solution1);
        System.out.println("solution = " + solution2);
    }
}
