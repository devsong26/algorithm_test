package programmers.level.one;

public class AbnormalStringMaker {

    public static void main(String[] args){
        System.out.println(new Solution().solution("try hello world"));
    }

    static class Solution {
        public String solution(String s) {
            char[] chArr = s.toCharArray();
            for(int i=0, j=0; i<chArr.length; i++, j++){
                if(chArr[i] == ' '){
                    j = -1;
                    continue;
                }

                if(j % 2 == 0){
                    chArr[i] = chArr[i] >= 97 ? (char)(chArr[i] - 32) : chArr[i];
                }else{
                    chArr[i] = chArr[i] <= 90 ? (char)(chArr[i] + 32) : chArr[i];
                }
            }
            return String.valueOf(chArr);
        }
    }

}
