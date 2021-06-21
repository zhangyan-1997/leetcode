package Leetcode.Part151;

/**
 * <h3>leetcode</h3>
 * <p>两数之和2</p>
 *
 * @author : 张严
 * @date : 2021-06-01 10:06
 **/
public class No167 {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        int i = 0;
        int j = numbers.length-1;
        while (i<j){
            if(numbers[i] + numbers[j] == target){
                res[0] = i+1;
                res[1] = j+1;
                return res;
            }else if(numbers[i] + numbers[j] < target) i++;
            else j--;
        }
        return res;
    }
}
