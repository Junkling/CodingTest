package codingTest;

public class Snail {

    public void solution(int n) {

        int[][] ints = new int[n][n];

        int x = 0;
        int y = 0;
        int input = 1;

        boolean locateX = false;
        boolean locateY = false;


        while (input <= 25) {
            if (0<= y&&y < n || ints[x][y] != 0) {
                ints[x][y] = input;
                if (locateY == false) {
                    y++;
                } else {
                    y--;
                }
            } else{
                if (locateY == false) {
                    locateY = true;
                }else{
                    locateY = false;
                }
                    if (locateX == false) {
                        x++;
                        ints[x][y] = input;
                    } else {
                        x--;
                        ints[x][y] = input;
                    }
                }
            input++;
        }
        }

    }

}
