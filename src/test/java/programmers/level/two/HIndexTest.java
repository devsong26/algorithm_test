package programmers.level.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HIndexTest {

    @Test
    public void test_1(){
        int[] citations = {3, 0, 6, 1, 5};

        assertEquals(3, new HIndex().solution(citations));
    }

    @Test
    public void test_2(){
        int[] citations = {3};

        assertEquals(1, new HIndex().solution(citations));
    }

    @Test
    public void test_3(){
        int[] citations = {22, 42};

        assertEquals(2, new HIndex().solution(citations));
    }


}