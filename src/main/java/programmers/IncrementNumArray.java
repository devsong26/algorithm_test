package programmers;

import java.util.stream.LongStream;

public class IncrementNumArray {

    public static void main(String[] args){
        new Solution().solution(2, 5);
    }

    static class Solution {
        public long[] solution(int x, int n) {
            long[] answer = new long[n];

            for(int i=0; i<n; i++){
                answer[i] = x * (long)(i + 1);
            }

            return answer;
        }
    }

}
