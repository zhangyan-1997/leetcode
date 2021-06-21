package byteDance;

import java.util.Arrays;

/**
 * <h3>leetcode</h3>
 * <p>比较版本号</p>
 *
 * @author : 张严
 * @date : 2021-05-14 16:51
 **/
public class No165 {
    public int compareVersion(String version1, String version2) {
        String[] splite1 = version1.split("\\.");
        String[] splite2 = version2.split("\\.");
        int i=0;
        while (i<splite1.length&&i<splite2.length){
            if(Integer.parseInt(splite1[i])<Integer.parseInt(splite2[i])) return -1;
            if(Integer.parseInt(splite1[i])>Integer.parseInt(splite2[i])) return 1;
            i++;
        }
        while (i<splite1.length){
            if(Integer.parseInt(splite1[i])!=0) return 1;
            i++;
        }
        while (i<splite2.length){
            if(Integer.parseInt(splite2[i])!=0) return -1;
            i++;
        }
        return 0;
    }

    public static void main(String[] args) {
        No165 no165 = new No165();
        System.out.println(no165.compareVersion("0007.5.3.4","7.5.3"));
    }
}
