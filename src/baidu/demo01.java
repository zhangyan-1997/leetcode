package baidu;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(getRes(str));
    }
    public static int getRes(String str){
        int count = 0;
        int[] ch = {'e', 'a', 's', 'y', 'E', 'A', 'S', 'Y'};
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)==ch[index] || str.charAt(i)==ch[index+4]){
                index++;
            }
            if(index==4){
                count++;
                index = 0;
            }
        }
        return count;
    }
}
