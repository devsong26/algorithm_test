package programmers;

public class FailureRate {

    public static void main(String[] args){
        int n = 10;
        int[] stages = {5,5,5,5,5};

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

                failureRate[i - 1] = (double) remainCnt / (double) (playerCnt == 0 ? 1 : playerCnt);
            }

            double maxRate = -1.0, sum = 0.0;
            int[] answer = new int[N];
            int i = 0;

            while(sum > (-2.0*N)){
                sum = 0;
                for(int j=0; j<failureRate.length; j++){
                    if(maxRate < failureRate[j]) maxRate = failureRate[j];
                }

                for(int j=0; j<failureRate.length; j++){
                    if(maxRate == failureRate[j]){
                        answer[i++] = (j + 1);
                        failureRate[j] = -2.0;
                    }
                }

                for(int j=0; j<failureRate.length; j++)
                    sum += failureRate[j];

                maxRate = -1.0;
            }

            return answer;
        }
    }

}
