package codingTest;

/**
 * 평균 구하기 (형변환)
 */

public class Average {
    public double solution(int[] arr) {
        double sum = 0.000;
        int length = arr.length;
        for (int x : arr) {
            sum += x;
        }
        double ave = sum / length;
        double count = 0.000;
        for (int i = 0; i < length; i++) {
            if(arr[i]>ave){
                count=count+1;
            }
        }
        double answer = (count / length)*100;
        System.out.println("sum = " + sum);
        System.out.println("ave = " + ave);
        System.out.println("length = " + length);
        System.out.println("count = " + count);
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        Average average = new Average();
        int[] ints = {8, 100, 95, 90, 80, 70, 60, 50};
        double solution = average.solution(ints);
        System.out.println("solution = " + solution);
    }
}
