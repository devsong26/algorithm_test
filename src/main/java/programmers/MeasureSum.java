package programmers;

import java.util.stream.IntStream;

public class MeasureSum {

    public static void main(String[] args){
        System.out.println(new Solution().solution(12));
    }

    static class Solution {
        public int solution(final int n) {
            return IntStream.rangeClosed(1, n)
                            .filter(d -> n % d == 0)
                            .sum();
        }
    }

}
