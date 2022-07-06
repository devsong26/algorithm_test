package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import programmers.level.one.Average;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageTest {

    private Average average;

    @BeforeEach
    public void setUp(){
        average = new Average();
    }

    @Test
    public void 입력_1(){
        assertEquals(2.5, average.solution(new int[]{1,2,3,4}));
    }

    @Test
    public void 입력_2(){
        assertEquals(5, average.solution(new int[]{5,5}));
    }

}
