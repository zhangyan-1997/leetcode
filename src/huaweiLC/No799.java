package huaweiLC;

/**
 * <h3>leetcode</h3>
 * <p>香槟塔</p>
 *
 * @author : 张严
 * @date : 2021-06-16 14:35
 **/
public class No799 {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] res = new double[102][102];
        res[0][0] = (double) poured;

        for (int i = 0; i <= query_row; i++) {
            for (int j = 0; j <= i; j++) {
                if(res[i][j] > 1){
                    double now = (res[i][j]-1)/2;
                    res[i+1][j] += now;
                    res[i+1][j+1] += now;
                }
             }
        }
        return Math.min(1, res[query_row][query_glass]);
    }
}
