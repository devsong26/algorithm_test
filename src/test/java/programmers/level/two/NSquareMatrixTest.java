package programmers.level.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NSquareMatrixTest {

    @Test
    public void test_1(){
        int n = 3;
        long left = 2;
        long right = 5;

        int[] expected = {3,2,2,3};
        int[] actual = new NSquareMatrix().solution(n, left, right);

        assertEquals(expected.length, actual.length);
        for(int i=0; i<expected.length; i++){
            assertEquals(expected[i], actual[i]);
        }
    }

    @Test
    public void test_2(){
        int n = 4;
        long left = 7;
        long right = 14;

        int[] expected = {4,3,3,3,4,4,4,4};
        int[] actual = new NSquareMatrix().solution(n, left, right);

        assertEquals(expected.length, actual.length);
        for(int i=0; i<expected.length; i++){
            assertEquals(expected[i], actual[i]);
        }
    }

}