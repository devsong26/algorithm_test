package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import programmers.level.one.SumBoundaryNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumBoundaryNumberTest {

    private SumBoundaryNumber sumBoundaryNumber;

    @BeforeEach
    public void setUp(){
        sumBoundaryNumber = new SumBoundaryNumber();
    }

    @Test
    public void 입력_1(){
        assertEquals(12, sumBoundaryNumber.solution(3, 5));
    }

    @Test
    public void 입력_2(){
        assertEquals(3, sumBoundaryNumber.solution(3, 3));
    }

    @Test
    public void 입력_3(){
        assertEquals(12, sumBoundaryNumber.solution(5, 3));
    }

    @Test
    public void 입력_4(){
        assertEquals(0, sumBoundaryNumber.solution(
                -10000000, 10000000));
    }

}
