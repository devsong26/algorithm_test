package programmers;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class FailureRate {

    public static void main(String[] args){
        int n = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
        int[] expected = {3,4,2,1,5};

        Solution s = new Solution();
        int[] result = s.solution(n, stages);
        System.out.println(result);
    }

    static class Solution {
        public int[] solution(int N, int[] stages) {
            List<Double> failureRate = new LinkedList<>();
            int playerCnt = stages.length;

            for(int i=1, remainCnt = 0; i<=N; i++, playerCnt-=remainCnt, remainCnt = 0){
                for(int j=0; j<stages.length; j++){
                    if(stages[j] == i) remainCnt++;
                }

                failureRate.add(new BigDecimal(remainCnt).divide(
                        new BigDecimal(playerCnt), 4, RoundingMode.DOWN).doubleValue());
            }

            List<Integer> answer = new ArrayList<>();
            double maxRate = 0.0;
            for(int i=0; i<N; i++){
                for(int j=0; j<failureRate.size(); j++){
                    if(maxRate < failureRate.get(j)) maxRate = failureRate.get(j);
                }

                List<Integer> stageList = new ArrayList<>();
                for(int j=0; j<failureRate.size(); j++){
                    if(maxRate == failureRate.get(j)){
                        stageList.add((j + 1));
                    }
                }

                stageList.sort(Comparator.naturalOrder());
                answer.addAll(stageList);
                maxRate = 0.0;
            }

            return answer.stream().mapToInt(e -> e).toArray();
        }
    }

}
