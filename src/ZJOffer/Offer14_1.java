package ZJOffer;

/**
 * <h3>leetcode</h3>
 * <p>剪绳子</p>
 *
 * @author : 张严
 * @date : 2021-04-14 15:47
 **/
public class Offer14_1 {
    public static int cuttingRope(int n) {
        int[] res = new int[n+1];
        res[2] = 1;
        for(int i=3;i<=n;i++){
            for(int j=2;j<i;j++){
                res[i] = Math.max(res[i],Math.max(j*(i-j),j*res[i-j]));
            }
        }
        return res[n];
    }

    public static void main(String[] args) {
        System.out.println(cuttingRope(6));
    }
}
