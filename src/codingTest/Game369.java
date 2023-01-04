package codingTest;

/**
 * 369 게임 예제
 */

public class Game369 {
    public void solution(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(clap(i));
        }
    }

    public static String clap(int x) {
        int origin = x;
        String result = "";
        boolean boo = false;
        while (x > 0) {
            int rest = x % 10;
            if ((rest!=0)&&(rest%3==0)) {
                result += "짝";
                boo = true;
            }
            x /= 10;
        }
        if (boo == false) {
            result += origin;
        }
        return result;
    }

    public static void main(String[] args) {
        Game369 game369 = new Game369();
        game369.solution(100);
    }

}
