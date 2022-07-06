package programmers.level.one;

public class PrimeNumberCnt {

    public static void main(String[] args){
        System.out.println(new Solution().solution(10));
    }

    static class Solution {
        public int solution(int n) {
            // 에라토스테네스의 체 알고리즘
            // 출처: https://hongpossible.tistory.com/entry/Java-%EC%9E%85%EB%A0%A5%EB%B0%9B%EC%9D%80-%EC%88%AB%EC%9E%90-n%EA%B9%8C%EC%A7%80%EC%9D%98-%EC%86%8C%EC%88%98%EA%B0%AF%EC%88%98-%EA%B5%AC%ED%95%98%EA%B8%B0

            int[] arr = new int[n + 1];

            for(int i=2; i<=n; i++){
                arr[i] = i;
            }

            int sqrt = (int) Math.sqrt(n);
            for(int i = 2; i<=sqrt; i++){
                if(arr[i] == 0)continue;

                for(int j = i + i; j <= n; j+=i) arr[j] = 0;
            }

            int c = 0;
            for(int i = 2; i <= n; i++){
                if(arr[i] != 0) c++;
            }

            return c;
        }
    }

}
