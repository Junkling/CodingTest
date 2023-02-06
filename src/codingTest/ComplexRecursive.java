package codingTest;

public class ComplexRecursive {
    static int[][] arr = {
            {0, 1, 1, 0, 0},
            {0, 1, 0, 0, 1},
            {0, 0, 0, 0, 1},
            {1, 1, 0, 0, 0},
            {1, 1, 0, 0, 0}
    };
    static int count = 0;
    static int[] houseHold = new int[10];

    public static void complex(int y, int x, int index) {
        arr[y][x] = 0;
        houseHold[index]++;
        if(x-1 >=0 && arr[y][x-1]==1)
            complex(y, x - 1, index);
        if(y-1 >=0 && arr[y-1][x]==1)
            complex(y-1, x, index);
        if(y+1 <=4 && arr[y+1][x]==1)
            complex(y+1, x, index);
        if(x+1 <=4 && arr[y][x+1]==1)
            complex(y, x + 1, index);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[i][j] == 1) {
                    complex(i, j, count);
                    count++;
                }
            }
        }
        System.out.println("count = " + count);
        for (int i : houseHold) {
            System.out.println("i = " + i);
        }
    }
}