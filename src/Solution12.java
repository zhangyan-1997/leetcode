public class Solution12 {
    public static String countAndSay(int n){
        if(n==1) return "1";
        if(n==2) return "11";
        String res ="11";
        for(int i=3;i<=n;i++){
            res = nextString(res);
        }
        return res;
    }
    private static String nextString(String s){
        char[] string = s.toCharArray();
        int count = 1;
        StringBuilder res = new StringBuilder();
        for (int i = 1; i < string.length; i++) {
            if(string[i]==string[i-1]){
                count++;
            }else {
                res.append(count);
                res.append(string[i-1]);
                count = 1;
            }
            if(i==string.length-1){
                res.append(count);
                res.append(string[i]);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(countAndSay(30));
    }
}
