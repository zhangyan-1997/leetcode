package huaweiLC;

import java.util.Arrays;

public class No475 {
    public int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);

        int low = 0;
        int high = Integer.MAX_VALUE;

        while (low < high){
            int mid = (high + low)>>>1; //无符号右移
            //成立时，右界移动至中心
            if(helper(houses, heaters, mid)) high = mid;
            //不成立时，左界移至中心+1,这样可以保证最后的跳出循环l一定为半径最小
            else low = mid + 1;
        }
        return low;
    }

    private boolean helper(int[] houses, int[] heaters, int now){
        int index = 0;
        for (int i = 0; i < heaters.length; i++) {
            while (index<houses.length && houses[index]>=heaters[i]-now && houses[index]<=heaters[i]+now) index++;
        }
        if(index==houses.length) return true;
        return false;
    }

    public static void main(String[] args) {
        No475 no475 = new No475();
        System.out.println(no475.findRadius(new int[]{1, 5}, new int[]{2}));
    }
}
