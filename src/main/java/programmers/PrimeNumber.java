package programmers;

public class PrimeNumber {

    public static void main(String[] args){
        int[] nums = {1,2,3,4};

        Solution s = new Solution();
        System.out.println(s.solution(nums));
    }

    static class Solution {
        public int solution(int[] nums) {
            int answer = 0;

            int i = 0, j = 1, k = 2, length = nums.length, sum = 0;
            while ((i + j + k) <= (length - 1) + (length - 2) + (length - 3)){
                sum = nums[i] + nums[j] + nums[k];
                if(isPrime(sum))
                    answer++;

                k++;
                if(k == length){
                    j++;
                    k = j + 1;
                }

                if(j == length - 1){
                    i++;
                    j = i + 1;
                    k = j + 1;
                }
            }

            return answer;
        }

        private boolean isPrime(int sum){
            int restZeroCnt = 0;
            for(int n = sum; n > 0; n--){
                if(sum % n == 0)
                    restZeroCnt++;
            }

            return restZeroCnt == 2 ? true : false;
        }
    }

}
