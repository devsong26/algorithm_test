package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import programmers.level.one.InsufficientAmount;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsufficientAmountTest {

    private InsufficientAmount insufficientAmount;

    @BeforeEach
    public void setUp(){
        insufficientAmount = new InsufficientAmount();
    }

    @Test
    public void 입력_1(){
        assertEquals(10, insufficientAmount.solution(3, 20, 4));
    }

    @Test
    public void 입력_2(){
        assertEquals(0, insufficientAmount.solution(1, 1, 1));
    }

    @Test
    public void 입력_3(){
        assertEquals(6815625000L, insufficientAmount.solution(2500, 1000000000, 2500));
    }

}
