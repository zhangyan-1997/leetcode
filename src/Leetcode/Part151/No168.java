package Leetcode.Part151;

/**
 * <h3>leetcode</h3>
 * <p>Excel表列名称</p>
 *
 * @author : 张严
 * @date : 2021-06-01 09:15
 **/
public class No168 {
    public String convertToTitle(int columnNumber) {
        char[] alpha = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

        StringBuilder sb = new StringBuilder();
        while (columnNumber>0){
            columnNumber = columnNumber-1;
            sb.append(alpha[(columnNumber)%26]);
            columnNumber /= 26;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        No168 no168 = new No168();
        System.out.println(no168.convertToTitle(27));
    }
}
