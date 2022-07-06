package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import programmers.level.one.Measure;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MeasureTest {

    private Measure measure;

    @BeforeEach
    public void setUp(){
        measure = new Measure();
    }

    @Test
    void 입력_1() {
        int left = 13;
        int right = 17;
        assertEquals(43, measure.solution(left, right));
    }

    @Test
    void 입력_2() {
        int left = 24;
        int right = 27;
        assertEquals(52, measure.solution(left, right));
    }

    @Test
    void 제곱수_확인() {
        Double sqrt = Math.sqrt(24);
        System.out.println((sqrt - sqrt.intValue()));
    }
}
