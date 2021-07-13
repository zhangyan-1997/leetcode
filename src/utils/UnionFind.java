package utils;

public class UnionFind {
    int[] roots;
    public int size;

    public UnionFind(int n){
        roots = new int[n];
        for (int i = 0; i < n; i++) {
            roots[i] = i;
        }
        size = n;
    }

    public int find(int i){
        if(i == roots[i]) return i;
        return roots[i] = find(roots[i]);
    }

    public void union(int p, int q){
        int pRoot = find(p);
        int qRoot = find(q);
        if(pRoot != qRoot){
            roots[pRoot] = qRoot;
            size--;
        }
    }
}
