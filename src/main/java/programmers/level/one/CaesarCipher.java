package programmers.level.one;

public class CaesarCipher {

    public static void main(String[] args){
        System.out.println(new Solution().solution("y", 2));
    }

    static class Solution {
        public String solution(String s, int n) {
            char[] chArr = s.toCharArray();
            int interval = 26;

            for(int j=0; j<chArr.length; j++){
                if(chArr[j] == ' ') continue;

                // og: 'Y', n: 2 -> 'A' / og: 'Z', n: 1 -> 'A'
                // og: 'z', n: 1 -> 'a' / og: 'y', n: 2 -> 'a'
                if( (chArr[j] <= 'Z' && chArr[j] + n > 'Z') // 대문자
                    || (chArr[j] <= 'z' && chArr[j] + n > 'z') //  소문자
                ){
                    chArr[j] += (n - interval);
                }else{
                    chArr[j] += n;
                }
            }

            return new String(chArr);
        }
    }

}
