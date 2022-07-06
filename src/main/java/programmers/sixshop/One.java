package programmers.sixshop;

public class One {

    public static void main(String[] args){
        int[] est = new int[]{10, 1, 10, 1, 1, 4, 3, 10};
        System.out.println(new Solution().solution(est, 6));
    }

    static class Solution {
        public int solution(int[] estimates, int k) {
            int[] result = new int[estimates.length];

            for(int i = 0, t = 0; i <= estimates.length - k; i++){
                int sum = 0;
                for(int j=i; j<i+k; j++){
                    sum += estimates[j];
                }
                result[t++] = sum;
            }

            int max = 0;
            for (int j : result) {
                if (j == 0) break;
                if (max < j) max = j;
            }

            return max;
        }
    }

}
