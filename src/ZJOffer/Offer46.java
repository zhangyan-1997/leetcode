package ZJOffer;

public class Offer46 {
    public static int translateNum(int num) {
        char[] chars = Integer.toString(num).toCharArray();
        System.out.println(String.valueOf(chars));
        return backstrack(chars,0);


    }
    public static int backstrack(char[] chars,int index){
        if(index>=chars.length) return 1;
        int x1= backstrack(chars,index+1);
        int x2 =0;
        if(index+1<chars.length&&(Integer.parseInt(String.valueOf(chars[index])+String.valueOf(chars[index+1]))<=25)&&chars[index]!='0'){
            x2 = backstrack(chars,index+2);
        }
        return x1+x2;
    }

    public static void main(String[] args) {
        System.out.println(translateNum(506));
    }
}
