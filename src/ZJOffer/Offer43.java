package ZJOffer;

/**
 * <h3>leetcode</h3>
 * <p>1~n整数中1出现的次数</p>
 *
 * @author : 张严
 * @date : 2021-04-07 15:36
 **/
public class Offer43 {
    public static int countDigitOne(int n) {
       int digit =1;
       int high = n/10,low=0,curr = n%10;
       int res = 0;
       while (high!=0||curr!=0){
           if(curr==0) {
               res= high*digit+res;
           }else if(curr==1) {
               res = res+high*digit+low+1;
           }else {
               res= res+(high+1)*digit;
           }
           low = low+curr*digit;
           curr = high%10;
           high = high/10;
           digit = digit*10;
       }
       return res;
    }

    public static void main(String[] args) {
        System.out.println(countDigitOne(321));
    }
}
