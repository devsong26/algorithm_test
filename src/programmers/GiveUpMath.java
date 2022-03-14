package programmers;

public class GiveUpMath {

    public static void main(String[] args){
        int[] answers = {1,2,3,4,5};

        Solution s = new Solution();
        s.solution(answers);
    }

    static class Solution {
        public int[] solution(int[] answers) {
            int aMatchCnt = getMatchCnt(answers, new int[]{1, 2, 3, 4, 5}),
                bMatchCnt = getMatchCnt(answers, new int[]{2, 1, 2, 3, 2, 4, 2, 5}),
                cMatchCnt = getMatchCnt(answers, new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5});

            int[] answer = {aMatchCnt, bMatchCnt, cMatchCnt};

            for(int i=0, j=0; i<answers.length; i++){
                //TODO for 문 하나로 이 문제를 해결할 수 있을까?
            }

            return answer;
        }

        private int getMatchCnt(int[] answers, int[] checks){
            int matchCnt = 0;

            for(int i=0; i<answers.length; i++){
                if(checks[i % checks.length] == answers[i]) matchCnt++;
            }

            return matchCnt;
        }
    }

}
