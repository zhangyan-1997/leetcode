package honor;

import java.util.*;

public class demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        compose(str);
    }

    private static void compose(String str){
        HashMap<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int index = 0;
        int count = 1;
        while (index < str.length()){
            int j = index+1;
            while (j<str.length() && str.charAt(j)==str.charAt(index)) index++;
            if(j-index>=4) {
                map.put(str.substring(index, j), count++);
                sb.append("["+(count-1)+"]");
            }
            index = j;
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry entry: map.entrySet()){
            list.add(entry.getValue().toString() + entry.getKey());
        }
        Collections.sort(list);
        for (int i = list.size()-1; i >=0 ; i--) {
            sb.append(list.get(i));
        }
        sb.append("@");
        if(str.length()<sb.length()){
            System.out.println(str);
        }else {
            System.out.println("compress" + sb.toString());
            System.out.println("decompression" + str);
        }

    }
}
