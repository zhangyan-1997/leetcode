package ZJOffer;

/**
 * <h3>leetcode</h3>
 * <p>数值的整数次方</p>
 *
 * @author : 张严
 * @date : 2021-04-07 15:12
 **/
public class Offer33 {
    public static boolean verifyPostorder(int[] postorder) {
        return recur(postorder,0,postorder.length-1);
    }
    public static boolean recur(int[] postorder,int left,int right){
        if(left>=right) return true;
        int j = left;
        while(postorder[j]<postorder[right]) j++;
        int m = j;
        while (postorder[j]>postorder[right]) j++;
        return j==right&&recur(postorder,left,m-1)&&recur(postorder,m,right-1);
    }

    public static void main(String[] args) {
        System.out.println(verifyPostorder(new int[]{1,3,2,6,5}));
    }
}

