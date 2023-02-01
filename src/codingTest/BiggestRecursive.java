package codingTest;

public class BiggestRecursive {
    int biggest = 0;
    public int solution(int n) {
        if (n/10>0){
            if(biggest<n % 10) {
                biggest = n % 10;
            };
            n = n / 10;
            return solution(n);
        }
        return biggest;
    }

    public static void main(String[] args) {
        BiggestRecursive biggestRecursive = new BiggestRecursive();
        int solution = biggestRecursive.solution(4326);
        System.out.println("solution = " + solution);

    }
}
