package programmers;

public class Collatz {

    public static void main(String[] args){
        System.out.println(new Solution().solution(626331));
    }

    static class Solution {
        public int solution(int num) {
            int rollingCnt = 0;

            while(num != 1){
                if(num % 2 == 0) num/=2;
                else if(num % 2== 1) num = num * 3 + 1;

                if(++rollingCnt > 500) break;
            }

            return rollingCnt > 500 ? -1 : rollingCnt;
        }
    }

}
