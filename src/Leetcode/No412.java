package Leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <h3>leetcode</h3>
 * <p>FizzBuzz</p>
 *
 * @author : 张严
 * @date : 2021-04-11 22:18
 **/
public class No412 {
    public static List<String> fizzBuzz(int n) {
        List<String> res = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0&&i%5==0) res.add(i-1,"FizzBuzz");
            else if(i%3==0) res.add(i-1,"Fizz");
            else if(i%5==0) res.add(i-1,"Buzz");
            else res.add(i-1,String.valueOf(i));
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
}
