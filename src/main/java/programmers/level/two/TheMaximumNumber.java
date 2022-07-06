package programmers.level.two;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TheMaximumNumber {

    public static void main(String[] args){
        int[] input = new int[]{3, 30, 34, 5, 9};
        System.out.println(new Solution().solution(input));
    }

    static class Solution {
        //TODO 다시풀기

        public String solution(int[] numbers) {
            String result = IntStream.of(numbers)
                                    .mapToObj(String::valueOf)
                                    .sorted((a, b) -> (b + a).compareTo(a + b))
                                    .collect(Collectors.joining());

            return result.charAt(0) == '0' ? "0" : result;
        }
    }

}