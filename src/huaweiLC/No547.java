package huaweiLC;

import utils.UnionFind;

public class No547 {
    public int findCircleNum(int[][] isConnected) {
        UnionFind uf = new UnionFind(isConnected.length);
        for (int i = 0; i < isConnected.length; i++) {
            for (int j = 0; j < isConnected[0].length; j++) {
                if(isConnected[i][j]==1){
                    uf.union(i, j);
                }
            }
        }
        return uf.size;
    }

    public static void main(String[] args) {
        int[][] ints = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        No547 no547 = new No547();
        System.out.println(no547.findCircleNum(ints));
    }
}
