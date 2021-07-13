package huaweiLC;

import utils.UnionFind;

import java.util.Arrays;

public class No684 {
    public int[] findRedundantConnection(int[][] edges) {
        UnionFind uf = new UnionFind(edges.length);

        for (int i = 0; i < edges.length; i++) {
            if(uf.find(edges[i][0]-1)==uf.find(edges[i][1]-1)){
                return edges[i];
            }
            else uf.union(edges[i][0]-1, edges[i][1]-1);
        }
        return null;
    }

    public static void main(String[] args) {
        No684 no684 = new No684();
        int[][] ints = {{1, 2}, {2, 3}, {3, 4}, {1, 4}, {1, 5}};
        System.out.println(Arrays.toString(no684.findRedundantConnection(ints)));
    }
}
