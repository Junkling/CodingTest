package codingTest;
import java.util.ArrayList;
import java.util.List;

public class Rest1 {
    public Rest1() {
    }

    public int solution(int n) {
        List<Integer> list = new ArrayList();

        for(int i = 1; i < n; ++i) {
            if (n % i == 1) {
                list.add(i);
            }
        }

        int answer = (Integer)list.get(0);
        return answer;
    }

    public static void main(String[] args) {
        Rest1 rest1 = new Rest1();
        System.out.println("rest1 = " + rest1.solution(15));
    }
}
