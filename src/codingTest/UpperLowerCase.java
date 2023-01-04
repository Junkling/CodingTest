package codingTest;

import java.util.Arrays;

/**
 * 대소문자 변환 예제
 */
public class UpperLowerCase {

    public String solution(String str) {
        char[] charArr = str.toCharArray();
        String answer = "";
        for (int i = 0; i < charArr.length; i++) {
            if ('a'<=charArr[i]&&charArr[i]<='z') {
//                answer = answer + Character.toUpperCase(charArr[i]);
                answer = answer + (char)(charArr[i] + ('A' - 'a'));
            }else if('A'<=charArr[i]&&charArr[i]<='Z'){
                answer = answer +Character.toLowerCase(charArr[i]);
//                answer = answer + (char)(charArr[i] - ('A' - 'a'));
            }else{
                answer = answer + charArr[i];
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        String str = "str";
        String[] split = str.split("");
        System.out.println("str = " + Arrays.toString(split));
        int a = 'Z'-'z';
        System.out.println("a = " + a);

        UpperLowerCase upperLowerCase = new UpperLowerCase();
        System.out.println(upperLowerCase.solution("helloWorLD****"));

    }

}
