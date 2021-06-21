public class Solution1 {
    public static int countDigitOne(int n) {
        int[] res = new int[n+1];
        for(int i=0;i<=n;i++){
            res[i] =0;
            int k=i;
            while(k!=0){
                if(k%10 == 1){
                    res[i]++;
                }
                k = k/10;
            }
        }
        int count =0;
        for(int x:res){
            count+=x;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigitOne(13));
    }
}
