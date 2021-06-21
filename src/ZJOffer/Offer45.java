package ZJOffer;

import java.util.Arrays;

public class Offer45 {
    public static String minNumber(int[] nums) {
        String[] strs = new String[nums.length];
        int i=0;
        for(int x:nums){
            strs[i++] = Integer.toString(x);
        }
        Arrays.sort(strs,(x,y)->(x+y).compareTo(y+x));
        StringBuilder sb = new StringBuilder();
        for(String s:strs){
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(minNumber(new int[]{3,30,34,5,9}));
    }
}
