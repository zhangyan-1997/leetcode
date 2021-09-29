package honor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] split = line.split("\\|");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < split.length; i++) {
            int index = 0;
            while (index<split[i].length() && split[i].charAt(index)!=' ') index++;
            int lineNumber = Integer.parseInt(split[i].substring(0, index));
            if(lineNumber==0) {
                System.out.println("error");
                break;
            }
            index++;
            if(list.size()==0 && split[i].charAt(index)!='i') {
                System.out.println("error");
                break;
            }
            else if(split[i].charAt(index)=='i'){
                list.add(lineNumber-1, split[i].substring(index+2));
            }
            else if(split[i].charAt(index)=='a'){
                list.add(lineNumber, split[i].substring(index+2));
            }else if(split[i].charAt(index)=='r'){
                list.remove(lineNumber-1);
                list.add(lineNumber-1, split[i].substring(index+2));
            }
            else if(split[i].charAt(index)=='d'){
                list.remove(lineNumber-1);
            }
            else {
                System.out.println("error");
                break;
            }
        }
        for (String ll: list){
            System.out.println(ll);
        }

    }
}
