package JD;

import java.util.*;

public class demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] split = sc.nextLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int q = Integer.parseInt(split[1]);
        List<Integer>[] list = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            list[i] = new ArrayList<>();
            String[] s = sc.nextLine().split(" ");
            int index = 1;
            for (int j = 0; j < Integer.parseInt(s[0]); j++) {
                list[i].add(Integer.parseInt(s[index++]) - 1);
            }
        }

        Set<Integer> runner = new HashSet<>();
        for (int i = 0; i < q; i++) {
            String[] s = sc.nextLine().split(" ");
            if(s[0].equals("1")){
                starter(Integer.parseInt(s[1])-1, runner, list);
            }else if(s[0].equals("0")){
                stop(Integer.parseInt(s[1])-1, runner, list);
            }
            System.out.println(runner.size());
        }
    }

    private static void starter(int number, Set<Integer> set, List<Integer>[] list){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(number);
        set.add(number);
        while (!queue.isEmpty()){
            Integer now = queue.poll();
            for (int i = 0; i < list[now].size(); i++) {
                if(!set.contains(list[now].get(i))){
                    set.add(list[now].get(i));
                    queue.offer(list[now].get(i));
                }
            }
        }
    }

    private static void stop(int number, Set<Integer> set, List<Integer>[] list){
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(number);
        set.remove(number);
        while (!queue.isEmpty()){
            Integer now = queue.poll();
            for (int i = 0; i < list.length; i++) {
                if(list[i].contains(now) && set.contains(i)){
                    set.remove(i);
                    queue.offer(i);
                }
            }
        }
    }
}
