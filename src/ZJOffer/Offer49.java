package ZJOffer;

/**
 * <h3>leetcode</h3>
 * <p>丑数</p>
 *
 * @author : 张严
 * @date : 2021-04-14 16:22
 **/
public class Offer49 {
    public static int nthUglyNumber(int n) {
        int[] res = new int[n];
        res[0] = 1;
        int a =0,b=0,c=0;
        for(int i=1;i<n;i++){
            res[i]=Math.min(res[a]*2,Math.min(res[b]*3,res[c]*5));
            if(res[i]/res[a]==2) a++;
            if(res[i]/res[b]==3) b++;
            if(res[i]/res[c]==5) c++;
        }
        return res[n-1];
    }

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(12));
    }
}
