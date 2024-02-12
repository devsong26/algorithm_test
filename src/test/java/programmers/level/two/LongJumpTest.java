package programmers.level.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongJumpTest {

    @Test
    public void test_1(){
        int n = 4;
        assertEquals(5L, new LongJump().solution(n));
    }

    @Test
    public void test_2(){
        int n = 3;
        assertEquals(3L, new LongJump().solution(n));
    }

    @Test
    public void test_3(){
        int n = 1;
        assertEquals(1L, new LongJump().solution(n));
    }

    @Test
    public void test_4(){
        int n = 2;
        assertEquals(2L, new LongJump().solution(n));
    }

}