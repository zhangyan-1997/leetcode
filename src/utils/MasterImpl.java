package utils;

import java.util.Random;

public class MasterImpl implements Master{
    @Override
    public int guess(String word) {
        String str = generateWord();
        if(str == null || str.length()==0 || word == null || word.length()==0) return 0;
        int count = 0;
        for (int i = 0; i < Math.min(str.length(), word.length()); i++) {
            if (str.charAt(i)==word.charAt(i)) count++;
        }
        return count;
    }

    @Override
    public boolean isMatch(String word) {
        return guess(word)==6;
    }

    private String generateWord(){
        Random random = new Random();
        String[] words = WordList.getWordList();
        return words[random.nextInt(words.length)];
    }
}
