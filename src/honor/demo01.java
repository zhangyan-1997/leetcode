package honor;

import java.util.Scanner;

public class demo01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String[] data = line1.split(" ");
        String[] s = line2.split(" ");
        int start = Integer.parseInt(s[0]) - 1;
        int end = Integer.parseInt(s[1]) + start;
        int flag = 1;
        while (start<data.length && start<end){
            if(flag == 20){
                System.out.println(data[start++]);
                flag = 1;
            }else if(start == end - 1 ){
                System.out.println(data[start++]);
            }else {
                System.out.print(data[start++] + ";");
                flag++;
            }
        }
    }
}
