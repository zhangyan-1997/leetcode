public class Solution27 {
    public static boolean isPalindrome(String s) {
        char[] str =s.toLowerCase().replace(" ", "").replaceAll("[\\pP\\p{Punct}]","").toCharArray();
        int left=0;
        int right = str.length-1;

        while (left<=right){
            if(str[left]==str[right]){
                left++;
                right--;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
