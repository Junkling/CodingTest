package codingTest;


public class Py {
    public Py() {
    }

    boolean solution(String s) {
        String[] a = s.split("");
        int result = 0;
        s.substring(1);
        s.charAt(1);
        String[] var4 = a;
        int var5 = a.length;

        for(int var6 = 0; var6 < var5; ++var6) {
            String i = var4[var6];
            if (i.equals("p") || i.equals("P")) {
                ++result;
            }

            if (i.equals("y") || i.equals("Y")) {
                --result;
            }
        }

        boolean answer = result == 0;
        System.out.println("result" + result);
        return answer;
    }

    public static void main(String[] args) {
        Py py = new Py();
        boolean pypy = py.solution("pypyp");
        System.out.println("pypy = " + pypy);
    }
}
