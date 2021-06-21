package huaweiLC;

/**
 * <h3>leetcode</h3>
 * <p>种花问题</p>
 *
 * @author : 张严
 * @date : 2021-06-17 17:45
 **/
public class No605 {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        if((flowerbed.length+1)/2<n) return false;

        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i]==0 && (i==0||flowerbed[i-1]==0) && (i==flowerbed.length-1||flowerbed[i+1]==0)) {
                flowerbed[i] = 1;
                count++;
            }
        }
        return count >= n;
    }

    public static void main(String[] args) {
        No605 no605 = new No605();
        System.out.println(no605.canPlaceFlowers(new int[]{1, 0, 0, 0, 0, 1}, 2));
    }
}
