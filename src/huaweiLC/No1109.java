package huaweiLC;

/**
 * <h3>leetcode</h3>
 * <p>航班预定系统</p>
 *
 * @author : 张严
 * @date : 2021-06-15 16:17
 **/
public class No1109 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res = new int[n];

        for (int i = 0; i < bookings.length; i++) {
            int start = bookings[i][0];
            int end = bookings[i][1];

            for (int j = start; j <= end; j++) {
                res[j-1] +=bookings[i][2];
            }
        }
        return res;
    }
}
