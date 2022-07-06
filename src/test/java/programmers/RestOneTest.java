package programmers;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import programmers.level.one.RestOne;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class RestOneTest {

    private RestOne restOne;

    @BeforeEach
    public void setUp(){
        restOne = new RestOne();
    }

    @Test
    void 입력_1() {
        assertEquals(3, restOne.solution(10));
    }

    @Test
    void 입력_2() {
        assertEquals(11, restOne.solution(12));
    }

}
