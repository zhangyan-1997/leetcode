package HuaWei;

import java.util.*;

/**
 * <h3>leetcode</h3>
 * <p>第四题</p>
 *
 * @author : 张严
 * @date : 2021-04-24 15:32
 **/
public class ZX_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        Map<Integer,Integer> map1 = new LinkedHashMap<>();  //key存储value , value存储index
        Map<Integer,Integer> map2 = new LinkedHashMap<>();
         for (int i = 0; i < n1; i++) {
            map1.put(i+1,i);
        }
        for (int i = 0; i < n2; i++) {
            map2.put(n1+i+1,i);
        }
        int q = sc.nextInt();
        for(int i=0;i<q;i++){
            int x = sc.nextInt();
            if(map1.containsKey(x)&&map1.get(x)!=-1) {
                map1.put(x,-1);
                map2.put(x,map2.size());
            }else if(map2.containsKey(x)&&map2.get(x)!=-1) {
                map2.put(x,-1);
                map1.put(x,map1.size());
            }
        }
       List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < map1.size(); i++) {
            list1.add(0);
        }
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < map2.size(); i++) {
            list2.add(0);
        }
        for (Map.Entry<Integer,Integer> set:map1.entrySet()){
            if(set.getValue()!=-1) list1.add(set.getValue(),set.getKey());
        }

        for (Map.Entry<Integer,Integer> set:map2.entrySet()){
            if(set.getValue()!=-1) list2.add(set.getValue(),set.getKey());
        }

        for (int i = 0;i<list1.size();i++){
            if(list1.get(i)!=0) System.out.printf(list1.get(i)+" ");
        }
        System.out.println();
        for (int i=0;i<list2.size();i++){
            if(list2.get(i)!=0) System.out.printf(list2.get(i)+" ");
        }
        System.out.println();

    }
}
