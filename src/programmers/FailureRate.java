package programmers;

public class FailureRate {

    public static void main(String[] args){
        int n = 4;
        int[] stages = {4,4,4,4,4};

        Solution s = new Solution();
        int[] result = s.solution(n, stages);
        System.out.println(result);
    }

    static class Solution {
        public int[] solution(int N, int[] stages) {
            double[] failureRate = new double[N];
            int playerCnt = stages.length;

            for(int i=1, remainCnt = 0; i<=N; i++, playerCnt-=remainCnt, remainCnt = 0){
                for(int j=0; j<stages.length; j++){
                    if(stages[j] == i) remainCnt++;
                }

                failureRate[i - 1] = (double) remainCnt / (double) playerCnt;
            }

            int[] answer = new int[N], subStages;
            double maxRate = 0.0;
            for(int i=0, isAllCheck = 0; isAllCheck < N;){
                isAllCheck = 0;
                for(int j=0; j<failureRate.length; j++){
                    if(maxRate < failureRate[j]) maxRate = failureRate[j];
                }

                subStages = new int[N];
                for(int j=0; j<failureRate.length; j++){
                    if(maxRate == failureRate[j]){
                        subStages[j] = (j + 1);
                        failureRate[j] = -1.0;
                    }
                }

                for(int j = 0; j < subStages.length; j++){
                    for(int k = j + 1; k<subStages.length; k++){
                        if(subStages[j] > subStages[k]){
                            int temp = subStages[k];
                            subStages[k] = subStages[j];
                            subStages[j] = temp;
                        }
                    }
                }


                for (int n : subStages){
                    if(n > 0) answer[i++] = n;
                }
                maxRate = 0.0;

                for(int n : answer){
                    if(n > 0) isAllCheck++;
                }
            }

            return answer;
        }
    }

}
