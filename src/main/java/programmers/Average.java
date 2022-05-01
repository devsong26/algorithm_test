package programmers;

import java.util.stream.IntStream;

public class Average {
    public double solution(int[] arr) {
        return IntStream.of(arr).average().orElse(0);
    }
}
