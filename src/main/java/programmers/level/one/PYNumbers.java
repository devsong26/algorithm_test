package programmers.level.one;

public class PYNumbers {

    public static void main(String[] args){
        new Solution().solution("pPoooyY");
    }

    static class Solution {
        boolean solution(String s) {
            int pCnt = 0, yCnt = 0;

            for(char ch : s.toLowerCase().toCharArray()){
                if(ch == 'p') pCnt++;
                else if(ch == 'y') yCnt++;
            }

            return pCnt == yCnt;
        }
    }

}
