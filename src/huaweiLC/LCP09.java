package huaweiLC;

/**
 * <h3>leetcode</h3>
 * <p>最小跳跃次数</p>
 *
 * @author : 张严
 * @date : 2021-06-15 16:41
 **/
/*
public class LCP09 {
    public int minJump(int[] jump) {
        int start = 0;
        int end = 1;
        int maxPos = 0;
        int res = 1;
        while (end < jump.length){
            for (int i = 0; i < start; i++) {
                maxPos = Math.max(maxPos, i+jump[i]);
            }
            maxPos = Math.max(maxPos, start+jump[start]);
            System.out.println(maxPos);
            start = end;
            end = maxPos+1;
            res++;
        }
        return res;
    }

    public static void main(String[] args) {
        LCP09 lcp09 = new LCP09();
        System.out.println(lcp09.minJump(new int[]{2, 5, 1, 1, 1, 1}));
    }
}

 */
