package shoppe;

public class demo01 {
    int res = Integer.MAX_VALUE;
    public static void main(String[] args) {
        demo01 demo01 = new demo01();
        System.out.println(demo01.bestFit(24, new int[]{8, 3, 12, 7, 9, 7}));
    }
    public int bestFit(int V, int[] item) {
        // write code here
        dfs(item, 0, V);
        return res;
    }
    public void dfs(int[] item, int index, int loss){
        if(loss < 0) return;
        if(index == item.length){
            res = Math.min(res, loss);
            return;
        }
        //选择
        dfs(item, index+1, loss-item[index]);
        //不选择
        dfs(item, index+1, loss);
    }
}
