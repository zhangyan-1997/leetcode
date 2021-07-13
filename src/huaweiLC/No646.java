package huaweiLC;


import java.util.Arrays;

public class No646 {
    public int findLongestChain(int[][] pairs) {
        if (pairs.length==0 || pairs.length==1) return pairs.length;
        int[] dp = new int[pairs.length+1];
        Arrays.sort(pairs, (o1,o2)->(o1[0] - o2[0]));
        for (int i = 1; i < dp.length; i++) {
            dp[i] = 1;
            for (int j = 1; j < i; j++) {
                if(pairs[j-1][1] < pairs[i-1][0]){
                    dp[i] = Math.max(dp[i], dp[j]+1);
                }
            }
        }
        return dp[dp.length-1];
    }
}


