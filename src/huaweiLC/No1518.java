package huaweiLC;

/**
 * <h3>leetcode</h3>
 * <p>换酒问题</p>
 *
 * @author : 张严
 * @date : 2021-06-16 16:10
 **/
public class No1518 {
    public int numWaterBottles(int numBottles, int numExchange) {
        return numBottles + (numBottles-1)/(numExchange-1);
    }
}
