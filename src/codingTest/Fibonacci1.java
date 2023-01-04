package codingTest;

/**
 * 피보나치 수열 출력(복습)
 * Xn = Xn-1 + Xn-2
 */

public class Fibonacci1 {
    public int solution1(int n) {
        if(0<n&&n<=2){
            return 1;
        }else{
            int result = solution1(n - 1) + solution1(n - 2);
            return result;
        }
    }
    public int solution2(int n){
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n-1];
    }

    public int solution3(int n){
        int[] arr = new int[2];
        int preNum = 1;
        int num = 1;
        int answer = 0;
        if(n<2){
            return 1;}
        for(int i=2; i<n; i++){
            answer = preNum + num;
            preNum = num;
            num = answer;
        }
        return answer;
    }


    public static void main(String[] args) {
        long start = System.nanoTime();
        Fibonacci1 fibonacci = new Fibonacci1();
//        System.out.println(fibonacci.solution1(6));
        System.out.println(fibonacci.solution2(6));
//        System.out.println(fibonacci.solution3(6));
        long end = System.nanoTime();

        long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.print(usedMemory + " bytes");
        System.out.println("처리 시간 = " + (end-start));
    }

}
