package programmers.storeLink;

public class Two {

    public static void main(String[] args){
        // 1 -> 1
        // 2 -> 2
        // 3 -> 3
        // 4 -> 5
        System.out.println(new Solution().solution(4));
    }

    static class Solution {
        public int solution(int N) {
            if(N <= 2) return N;

            int a1 = 1, a2 = 2;

            for(int i=3; i<=N; i++){
                int temp = a2;
                a2 += a1;
                a1 = temp;
            }

            return a2;
        }
    }

}
