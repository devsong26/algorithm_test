package programmers.level.two;

public class NumExpression {

    public static void main(String[] args){
        Solution s = new Solution();

        System.out.println(s.solution(15));
        /*
        1 + 2 + 3 + 4 + 5 = 15
        4 + 5 + 6 = 15
        7 + 8 = 15
        15 = 15

        15	4
         */
    }

    private static class Solution {
        public int solution(int n) {
            int answer = 0;

            for(int i = 1; i <= n; i++){
                int sum = 0;

                for(int j = i; j <= n && sum <= n; j++){
                    sum += j;

                    if(sum == n) answer++;
                }
            }

            return answer;
        }
    }

}
