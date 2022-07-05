package programmers;

public class Harshad {

    public static void main(String[] args){
        System.out.println(new Solution().solution(10));
    }

    static class Solution {
        public boolean solution(int x) {
            int sum = 0;
            int cloneX = x;

            while(x/10 > 0){
                sum += x % 10;
                x/=10;
            }
            sum += x;

            return cloneX % sum == 0;
        }
    }

}
