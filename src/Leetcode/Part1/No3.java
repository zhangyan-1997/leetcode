package Leetcode.Part1;

/**
 * <h3>leetcode</h3>
 * <p>无重复字符串的最长字串</p>
 *
 * @author : 张严
 * @date : 2021-04-08 18:02
 **/
public class No3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring(""));

    }
    public static  int lengthOfLongestSubstring(String s) {
        if(s.length()==0) return 0;
        char[] string = s.toCharArray();
        int[] res = new int[string.length];//使用动态规划的方法：存储当前字符的最长子串
        res[0] = 1;
        //核心代码：利用存储的最长无重复表进行循环判断
        for(int i=1;i<string.length;i++){
            int j=i-res[i-1];
            int count =0;
            while(j<i){
                if(string[i]==string[j]){
                    break;
                }
                j++;
                count++;
            }
            if(j==i){
                res[i] = res[i-1]+1;
            }else{
                res[i] = res[i-1]-count;
            }
        }

        int max = 0;
        for(int x:res){
            if(x>max){
                max=x;
            }
        }
        return max;
    }
}
