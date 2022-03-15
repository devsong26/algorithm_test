package programmers;

public class GiveUpMath {

    public static void main(String[] args){
        int[] answers = {1,2,3,4,5};

        Solution s = new Solution();
        s.solution(answers);
    }

    static class Solution {
        public int[] solution(int[] answers) {
            int[][] checks = {
                    {1, 2, 3, 4, 5},
                    {2, 1, 2, 3, 2, 4, 2, 5},
                    {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
            int[][] matchList = new int[checks.length][2];
            int positiveNumCnt = 0;

            //입력
            for(int i=0; i<checks.length; i++){
                int matchCnt = getMatchCnt(answers, checks[i]);
                if(matchCnt == 0) continue;

                matchList[i][0] = (i + 1);
                matchList[i][1] = matchCnt;
                positiveNumCnt++;
            }

            //정렬
            for(int i=0, j=0; i<matchList.length; i++){
                if(matchList[i][1] > matchList[j][1]){
                    int[] temp = matchList[i];
                    matchList[i] = matchList[j];
                    matchList[j] = temp;
                }

                j++;
                if(j == matchList.length - 1){
                    i++;
                    j = 0;
                }
            }

            int[] results = new int[positiveNumCnt];
            for(int i=0; i<matchList.length; i++){
                if(matchList[i][1] > 0) results[i] = matchList[i][0];
            }

            return results;
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
