package programmers;

import java.util.stream.LongStream;

public class SumBoundaryNumber {
    public long solution(int a, int b) {
        return LongStream.rangeClosed(
                            Math.min(a, b),
                            Math.max(a, b)
                        ).sum();
    }
}
