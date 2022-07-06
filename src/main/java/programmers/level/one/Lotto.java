package programmers.level.one;

public class Lotto {

    public static void main(String[] args){
        Solution s = new Solution();
//        int[] lottos = {44, 1, 0, 0, 31, 25};
//        int[] win_nums = {31, 10, 45, 1, 6, 19};
        int[] lottos = {0, 0, 0, 0, 0, 0};
        int[] win_nums = {38, 19, 20, 40, 15, 25};

        int[] results = s.solution(lottos, win_nums);
        for(int result : results){
            System.out.println(result);
        }
    }

    static class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int zeroCnt = 0;
            for(int lot : lottos){
                if(lot == 0) zeroCnt++;
            }

            int matchCnt = 0;
            for(int win : win_nums){
                for(int lot : lottos){
                    if(win == lot){
                        matchCnt++;
                        break;
                    }
                }
            }

            int[] answer = {6, 6};
            answer[1] = (answer[1] - (matchCnt == 0 ? 1 : matchCnt)) + 1;
            answer[0] = (answer[0] - ((matchCnt+=zeroCnt) == 0 ? 1 : matchCnt)) + 1;
            return answer;
        }
    }

}
