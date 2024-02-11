package programmers.level.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExpectationMatchListTest {

    @Test
    public void test_1(){
        int n = 8;
        int a = 4;
        int b = 7;

        assertEquals(3, new ExpectationMatchList().solution(n, a, b));
    }

}