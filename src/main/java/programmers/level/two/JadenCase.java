package programmers.level.two;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JadenCase {

    public static void main(String[] args){
        Solution s = new Solution();

        String p = "44FFdd";
        System.out.println(s.solution(p));
    }

    private static class Solution {
        public String solution(String s) {
            String[] strs = s.toLowerCase().split(" ", s.length());

            for(int i=0; i< strs.length; i++){
                String str = strs[i];

                if(str.length() == 0) continue;

                char c = str.charAt(0);

                if( c >= 97 && c <= 122 ){
                    str = str.replaceFirst(String.valueOf(c), String.valueOf((char)(c - 32)));
                }

                strs[i] = str;
            }

            return Stream.of(strs).collect(Collectors.joining(" "));
        }
    }

}
