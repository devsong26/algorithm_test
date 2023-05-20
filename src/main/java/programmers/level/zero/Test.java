package programmers.level.zero;

public class Test {

    public static void main(String[] args){
        int a = 2, b = 1, n = 20;

        System.out.println(new Solution().solution(a, b, n));
    }

}

class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0, returnCoke = 0;

        while(n >= a){
            returnCoke = (n / a) * b;
            answer += returnCoke;
            n = (n % a) + returnCoke;
        }

        return answer;
    }
}