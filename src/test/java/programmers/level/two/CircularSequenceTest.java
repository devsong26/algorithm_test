package programmers.level.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CircularSequenceTest {

    @Test
    public void test_1(){
        int[] elements = {7,9,1,1,4};

        assertEquals(18, new CircularSequence().solution(elements));
    }

}