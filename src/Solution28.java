public class Solution28 {
    public static int strToInt(String str){
        int res = 0;
        int budry = Integer.MAX_VALUE/10;
        char[] chars = str.trim().toCharArray();
        if(chars.length==0) return 0;
        int i=0;
        boolean flag = chars[0]=='-'?false:true;
        while (i<chars.length){
            if(chars[i]=='-'){
                flag = false;
            }else if(chars[i]<'0'||chars[i]>'9'){
                break;
            }else {
                if((res>budry)||(res==budry&&chars[i]>'7')) return flag?Integer.MAX_VALUE:Integer.MIN_VALUE;
                res = res*10+(chars[i]-'0');
            }
            i++;
        }
        return flag?res:-res;
    }

    public static void main(String[] args) {
        System.out.println(strToInt("-91283472332"));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
