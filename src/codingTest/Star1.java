package codingTest;

/**
 * 별 출력 예제
 */
public class Star1 {
    public void solution1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void solution2(int n) {
        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = i; k < n; k++) {
//                System.out.print("*");
//            }
            for (int j = 0; j < n; j++) {
                if (i > j) {
                    System.out.print(" ");
                } else {
                System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    public void solution3(int n) {
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < n; j++) {
                if((n-i)>j+1){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Star1 star1 = new Star1();
        star1.solution1(6);
        System.out.println("=====================");
        star1.solution2(6);
        System.out.println("=====================");
        star1.solution3(6);
    }
}
