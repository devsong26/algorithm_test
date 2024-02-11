package programmers.level.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MultipleInputLCMTest {

    @Test
    public void test_1(){
        final int[] arr = {2,6,8,14};

        assertEquals(168, new MultipleInputLCM().solution(arr));
    }

    @Test
    public void test_2(){
        final int[] arr = {1,2,3};

        assertEquals(6, new MultipleInputLCM().solution(arr));
    }

}