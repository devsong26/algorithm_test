package programmers.level.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChoiceTangerineTest {

    @Test
    public void test_1(){
        int k = 6;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};

        assertEquals(3, new ChoiceTangerine().solution(k, tangerine));
    }

    @Test
    public void test_2(){
        int k = 4;
        int[] tangerine = {1, 3, 2, 5, 4, 5, 2, 3};

        assertEquals(2, new ChoiceTangerine().solution(k, tangerine));
    }

    @Test
    public void test_3(){
        int k = 2;
        int[] tangerine = {1, 1, 1, 1, 2, 2, 2, 3};

        assertEquals(1, new ChoiceTangerine().solution(k, tangerine));
    }

    @Test
    public void test_4(){
        int k = 8;
        int[] tangerine = {1, 1, 1, 1, 1, 1, 1, 3};

        assertEquals(2, new ChoiceTangerine().solution(k, tangerine));
    }

    @Test
    public void test_5(){
        int k = 8;
        int[] tangerine = {1, 1, 1, 1, 1, 1, 1, 1};

        assertEquals(1, new ChoiceTangerine().solution(k, tangerine));
    }

    @Test
    public void test_6(){
        int k = 1;
        int[] tangerine = {5, 4, 3, 2, 1};

        assertEquals(1, new ChoiceTangerine().solution(k, tangerine));
    }



}