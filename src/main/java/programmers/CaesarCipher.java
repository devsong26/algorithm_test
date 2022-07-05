package programmers;

public class CaesarCipher {

    public static void main(String[] args){
        System.out.println(new Solution().solution("AB", 3));
    }

    static class Solution {
        public String solution(String s, int n) {
            char[] chArr = s.toCharArray();
            int interval = 26;

            for(int j=0; j<chArr.length; j++){
                if(chArr[j] == ' ') continue;

                chArr[j] += n;

                if(chArr[j] > 'Z' || chArr[j] < 'a'){
                    chArr[j] -= interval;
                }
                if(chArr[j] > 'z'){
                    chArr[j] -= interval;
                }
            }

            return new String(chArr);
        }
    }

}
