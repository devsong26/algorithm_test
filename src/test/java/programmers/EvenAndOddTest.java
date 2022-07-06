package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import programmers.level.one.EvenAndOdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenAndOddTest {

    private EvenAndOdd evenAndOdd;

    @BeforeEach
    public void setUp(){
        evenAndOdd = new EvenAndOdd();
    }

    @Test
    public void 입력_1(){
        assertEquals("Odd", evenAndOdd.solution(3));
    }

    @Test
    public void 입력_2(){
        assertEquals("Even", evenAndOdd.solution(4));
    }

}
