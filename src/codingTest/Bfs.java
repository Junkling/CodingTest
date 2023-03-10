package codingTest;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    static boolean[] checked = new boolean[9];

    static int[][] graph =
            {
                    {},
                    //1번 인덱스는 2,3,8과 연결되어 있다.
                    {2, 3, 8},
                    //2번 인덱스는 1,6,8과 연결되어 있다.
                    {1, 6, 8},
                    {1, 5},
                    {5, 7},
                    {3, 4, 7},
                    {2},
                    {4, 5},
                    {1, 2}
            };

    public String search() {
        Queue<Integer> queue = new LinkedList<>();
        StringBuffer sb = new StringBuffer();
        queue.offer(1);
        checked[1] = true;

        while (!queue.isEmpty()) {
            int index = queue.poll();
            sb.append(index);
            for (int i = 0; i < graph[index].length; i++) {
                int tmp = graph[index][i];
                if (!checked[tmp]) {
                    checked[tmp] = true;
                    queue.offer(tmp);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Bfs bfs = new Bfs();
        String search = bfs.search();
        System.out.println("search = " + search);
    }
}
