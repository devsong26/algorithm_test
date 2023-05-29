package programmers.level.two;

public class Fibonacci {

    public static void main(String[] args){
        Solution s = new Solution();

        int p = 100_000;
        System.out.println(s.solution(p));
    }

    private static class Solution {
        public int solution(int n) {
            return fibonacci(0, 1, 2, n);
        }

        private int fibonacci(int a1, int a2, int i, int n){
            int sum = (a1 + a2) % 1234567;

            if(n == i) {
//                System.out.println(i + " >> " + sum);
                return sum;
            }

            return fibonacci(a2, sum, i + 1, n);
        }
    }

}
