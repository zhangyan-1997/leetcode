package ZJOffer;

/**
 * <h3>leetcode</h3>
 * <p>剪绳子2</p>
 *
 * @author : 张严
 * @date : 2021-04-07 17:50
 **/
public class Offer14_2 {
    public int cuttingRope(int n) {
        if(n<=3) return n-1;  //当绳长小于等于3的结果
        int b=n%3,p=1000000007; //b为余数
        //快速求幂余：x^a%p ，结果为rem
        long rem=1,x=3;
        int a=n/3-1;
        while (a>0){
            if(a%2==1){
                rem = (rem*x)%p;
            }
            x = (x*x)%p;
            a =a/2;
        }
        if(b==0) return (int)(rem*3%p);
        if(b==1) return (int)(rem*4%p);
        return (int)(rem*6%p);

    }
}
