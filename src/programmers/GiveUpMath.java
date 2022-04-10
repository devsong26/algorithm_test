package programmers;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class GiveUpMath {

    public static void main(String[] args){
        int[] answers = {1,2,3,4,5};

        Solution s = new Solution();
        int[] result = s.solution(answers);
    }

    static class Solution {
        public int[] solution(int[] answers) {
            Map<Integer, Integer> results = new HashMap<>();
            int[][] checks = {
                    {1, 2, 3, 4, 5},
                    {2, 1, 2, 3, 2, 4, 2, 5},
                    {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

            for(int i=0; i<checks.length; i++){
                results.put((i + 1), getMatchCnt(answers, checks[i]));
            }

            final int maxCnt = Math.max(results.get(1), Math.max(results.get(2), results.get(3)));
            return results.entrySet()
                    .stream()
                    .filter(e -> e.getValue() >= maxCnt)
                    .sorted(Comparator.comparingInt(Map.Entry::getKey))
                    .mapToInt(Map.Entry::getKey)
                    .toArray();
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
