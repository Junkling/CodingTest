package codingTest;

import java.util.Arrays;

public class ChangeRecursive {
    int[][] map = {
            {0, 0, 0, 0, 1},
            {0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0},
            {0, 0, 0, 0, 1},
            {0, 1, 0, 0, 0},
    };

    public void change(int x, int y) {
        if(map[x][y]==0){
            map[x][y] = 2;
        }
        if (x - 1 >= 0 && map[x - 1][y] != 2 && map[x - 1][y] != 1) {
            change(x - 1, y);
        }
        if (x + 1 < map.length && map[x + 1][y] != 2 && map[x + 1][y] != 1) {
            change(x + 1, y);
        }
        if (y - 1 >= 0 && map[x][y-1] != 2 && map[x][y-1] != 1) {
            change(x, y-1);
        }
        if (y + 1 < map[0].length && map[x][y+1] != 2 && map[x][y+1] != 1) {
            change(x, y+1);
        }
    }
    public void printMap() {
        System.out.println("map = " + Arrays.deepToString(map));
    }

    public static void main(String[] args) {
        ChangeRecursive changeRecursive = new ChangeRecursive();
        changeRecursive.printMap();
        changeRecursive.change(3, 2);
        changeRecursive.printMap();
    }

}
