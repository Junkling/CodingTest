package codingTest;

public class DfsRecursive {
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
    int count = 1;


        void search(int nodeIndex) {
        checked[nodeIndex] = true;
        System.out.print(nodeIndex);
        for (int i : graph[nodeIndex]) {
            if (!checked[i]) {
                search(i);
            }
        }
    }
    //start에서 시작했을 시 찾는 번호가 몇번째로 탐색되는지 반환하는 메서드

    int location(int start, int searchNum) {
        checked[start] = true;
        System.out.print(start);
        for (int i : graph[start]) {
            if (!checked[i]) {
                count++;
                location(i, searchNum);
            }
            if (checked[searchNum]) {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        DfsRecursive dfs1 = new DfsRecursive();
        DfsRecursive dfs2 = new DfsRecursive();
        dfs1.search(1);
        System.out.println();
        int location = dfs2.location(1, 8);
        System.out.println();
        System.out.println("location = " + location);
    }
}
