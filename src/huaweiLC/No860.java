package huaweiLC;

/**
 * <h3>leetcode</h3>
 * <p>柠檬水找零</p>
 *
 * @author : 张严
 * @date : 2021-06-15 21:31
 **/
public class No860 {
    public boolean lemonadeChange(int[] bills) {
        int exchange_5 = 0;
        int exchange_10 = 0;
        for (int i = 0; i < bills.length; i++) {
            if(bills[i]==5) exchange_5++;
            else if(bills[i]==10) {
                if(exchange_5<=0) return false;
                exchange_10++;
                exchange_5--;
            }else {
                if(exchange_5>0&&exchange_10>0){
                    exchange_10--;
                    exchange_5--;
                }else if(exchange_5>2){
                    exchange_5 -=3;
                }
               else return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        No860 no860 = new No860();
        System.out.println(no860.lemonadeChange(new int[]{5,5,5,20,5,5,5,20,5,5,5,10,5,20,10,20,10,20,5,5}));
    }
}
