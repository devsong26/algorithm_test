package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import programmers.level.one.BasicStringHandling;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BasicStringHandlingTest {

    private BasicStringHandling basicStringHandling;

    @BeforeEach
    public void setUp(){
        basicStringHandling = new BasicStringHandling();
    }

    @Test
    void 입력_1() {
        assertFalse(basicStringHandling.solution("a234"));
    }

    @Test
    void 입력_2() {
        assertTrue(basicStringHandling.solution("1234"));
    }

    @Test
    void 입력_3() {
        assertTrue(basicStringHandling.solution("0"));
    }

    @Test
    void 입력_4() {
        assertFalse(basicStringHandling.solution("O"));
    }

    @Test
    void 입력_5() {
        assertTrue(basicStringHandling.solution("01234567"));
    }
}
