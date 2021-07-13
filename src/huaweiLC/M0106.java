package huaweiLC;

public class M0106 {
    public String compressString(String S) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < S.length()){
            int j = i+1;
            while (j<S.length()&&S.charAt(j)==S.charAt(i)) j++;
            sb.append(S.charAt(i));
            sb.append((j-i));
            i = j;
        }
        return sb.toString().length() < S.length()? sb.toString() : S;
    }

    public static void main(String[] args) {
        M0106 m0106 = new M0106();
        System.out.println(m0106.compressString("abbccd"));
    }
}
