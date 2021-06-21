package byteDance;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>最大交换</p>
 *
 * @author : 张严
 * @date : 2021-05-17 21:20
 **/
public class No670 {
    public int maximumSwap(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        int[] res = new int[chars.length];
        Arrays.fill(res,chars.length);

        int maxnum = -1;
        int index = chars.length;
        for (int i = chars.length-1; i >= 0; i--) {
            if(chars[i]-'0'>maxnum){
                maxnum = chars[i]-'0';
                index = i;
            }else if(chars[i] - '0'<maxnum) res[i] = index;
        }

        char temp = '0';
        for (int i= 0;i<chars.length;i++){
            if(res[i]!=chars.length){
                temp = chars[i];
                chars[i] = chars[res[i]];
                chars[res[i]] = temp;
                break;
            }
        }
        int nums = 0;
        for(char c:chars) nums = nums*10+(c-'0');
        return nums;
    }

    public static void main(String[] args) {
        No670 no670 = new No670();
        System.out.println(no670.maximumSwap(2736));
    }
}
