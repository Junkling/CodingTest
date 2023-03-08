package codingTest;

import java.util.Stack;

public class DfsStack {
    boolean[] checked = new boolean[9];

    int[][] graph =
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
    Stack<Integer> stack = new Stack<>();
    int count = 1;

    void search(int start) {
        //시작 노드
        stack.push(start);
        checked[start] = true;
        while (!stack.isEmpty()) {
            int nodeNum = stack.pop();
            System.out.print(nodeNum);
            for (int i : graph[nodeNum]) {
                if (!checked[i]) {
                    stack.push(i);
                    checked[i] = true;
                }
            }
        }
    }


    public static void main(String[] args) {
        DfsStack dfsStack = new DfsStack();
        dfsStack.search(1);

    }
}
