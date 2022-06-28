package codility.str11;

import java.util.*;

public class Four {

    public static void main(String[] args){
        // 반례 케이스: ccaabb
        System.out.println("result >> " + new Solution().solution("azz"));
    }

    static class Solution {
        String solution(String S) {
            int[] occurrences = new int[26];
            for (char ch : S.toCharArray()) {
                occurrences[ch - 'a']++;
            }

            char best_char = 'a';
            int  best_res  = occurrences[0];

            for (int i = 1; i < 26; i++) {
                if (occurrences[i] > best_res) {
                    best_char = (char)((int)'a' + i);
                    best_res  = occurrences[i];
                }
            }

            return Character.toString(best_char);
        }
    }

}