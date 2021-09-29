package tencent2;

public class demo07 {
    public static double get_info(String str){
        int[] map = new int[4];
        int n = str.length();
        for (int i = 0; i < n; i++) {
            map[str.charAt(i) - 'A']++;
        }
        double[] p = new double[4];
        double res = 0;
        for (int i = 0; i < 4; i++) {
            if(map[i]!=0){
                p[i] = ((double) map[i])/n;
                res += p[i] * (Math.log(p[i])/Math.log(2));
            }
        }
        return 0-res;
    }

    public static void main(String[] args) {
        String str = "AABB";
        System.out.println(get_info(str));

    }
}
