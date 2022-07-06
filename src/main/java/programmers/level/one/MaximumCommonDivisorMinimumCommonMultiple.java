package programmers.level.one;

public class MaximumCommonDivisorMinimumCommonMultiple {

    public static void main(String[] args){
        new Solution().solution(72, 30);
    }

    static class Solution {
        public int[] solution(int n, int m) {
            // 유클리드 호제법 Euclidean Algorithm
            // 출처: https://myjamong.tistory.com/138

            int[] answer = new int[2];
            answer[0] = gcd(Math.max(n, m), Math.min(n, m));
            answer[1] = (n * m) / answer[0];

            return answer;
        }

        private int gcd(int n, int m){
            if(m == 0) return n;
            return gcd(m, n % m);
        }
    }

}
