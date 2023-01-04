package codingTest;

/**
 * 소수 판별 예제
 * 성능을 위해 n/2 해주기
 * 소수는 자기자신과 1이 나누어지는 수 임으로 나눈 수까지만 돌려 약수가 없으면 소수이다
 */

public class PrimeNum {
    public boolean solution(int n) throws Exception {
        if (n < 2) {
            throw new Exception("2이상의 숫자를 입력하세요");
        }
        boolean answer = true;
        for (int i = 2; i <= n/2; i++) {
            if ((n % i) == 0) {
                answer = false;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws Exception {
        PrimeNum primeNum = new PrimeNum();
        System.out.println(primeNum.solution(17));
    }
}
