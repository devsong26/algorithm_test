package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseTernaryTest {

    private ReverseTernary rt;

    @BeforeEach
    public void setUp(){
        rt = new ReverseTernary();
    }

    @Test
    void 입력_1() {
        assertEquals(7, rt.solution(45));
    }

    @Test
    void 입력_2() {
        assertEquals(229, rt.solution(125));
    }
}
