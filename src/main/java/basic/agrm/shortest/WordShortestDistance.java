package basic.agrm.shortest;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class WordShortestDistance {
    public static void main(String[] args) {
        String[] words = {"practice", "makes", "perfect", "coding", "makes"};
        String a = "practice";
        String b = "makes";

        int d = shortestDistance(words,a,b);

        log.info("shortest distance is {}",d);
    }

    public static int shortestDistance(String[] words, String word1, String word2) {
        int i1 = -1, i2 = -1;
        int minDistance = words.length;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word1)) {
                i1 = i;
            } else if (words[i].equals(word2)) {
                i2 = i;
            }
            if (i1 != -1 && i2 != -1) { minDistance = Math.min(minDistance, Math.abs(i1 - i2)); }
        }
        return minDistance;
    }
}
