package huaweiLC;

import utils.Master;
import utils.MasterImpl;
import utils.WordList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class No843 {
    public void findSecretWord(String[] wordlist, Master master) {
        if(wordlist==null || wordlist.length==0) return;
        List<String> list = new ArrayList<>(Arrays.asList(wordlist));
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int index = random.nextInt(100)%(list.size());
            int match = master.guess(list.get(index));
            if(master.isMatch(list.get(index))){
                System.out.println("恭喜您，猜对了！");
                System.out.println("您猜了"+ (i+1) + "次");
                return;
            }
            List<String> cand = new ArrayList<>();
            for (int j = 0; j < list.size(); j++) {
                if(getMatch(list.get(index), list.get(j))==match) cand.add(list.get(j));
            }
            list = cand;
        }
        System.out.println("很遗憾，失败了");
    }

    private int getMatch(String str, String pick){
        if(str == null || str.length()==0 || pick == null || pick.length()==0) return 0;
        int count = 0;
        for (int i = 0; i < Math.min(str.length(), pick.length()); i++) {
            if (str.charAt(i)==pick.charAt(i)) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        No843 no843 = new No843();
        no843.findSecretWord(WordList.getWordList(), new MasterImpl());
    }
}
