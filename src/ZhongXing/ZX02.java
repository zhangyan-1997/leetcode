package ZhongXing;

import java.util.Scanner;

/**
 * <h3>leetcode</h3>
 * <p>中兴第二题</p>
 *
 * @author : 张严
 * @date : 2021-05-08 15:42
 **/
public class ZX02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] alpha = new int[62];
        int n = sc.nextInt();
        if(n>62){
            System.out.println(-1);
            return;
        }
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]>='0'&&chars[i]<='9'){
                alpha[chars[i]-'0'+52]++;
            }
            if(chars[i]>='a'&&chars[i]<='z'){
                alpha[chars[i]-'a']++;
            }
            if(chars[i]>='A'&&chars[i]<='Z'){
                alpha[chars[i]-'A'+26]++;
            }
        }
        int count = 0;
        int flag = 0;
        for (int i = 0; i < alpha.length; i++) {
            if(alpha[i]>=1) {
                flag = flag+alpha[i]-1;
                count++;
            }
            if(alpha[i]==0&&flag>0){
                flag--;
                count++;
            }
        }
        System.out.println(count);

    }
}
