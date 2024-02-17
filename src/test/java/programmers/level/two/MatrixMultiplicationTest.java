package programmers.level.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixMultiplicationTest {

    @Test
    public void test_1(){
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        int[][] expected = {{15, 15}, {15, 15}, {15, 15}};
        int[][] actual = new MatrixMultiplication().solution(arr1, arr2);

        assertEquals(expected.length, actual.length); // check row
        assertEquals(expected[0].length, actual[0].length); // check col

        for(int i=0; i<expected.length; i++){
            for(int j=0; j<expected[0].length; j++){
                assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }

    @Test
    public void test_2(){
        int[][] arr1 = {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        int[][] arr2 = {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};

        int[][] expected = {{22, 22, 11}, {36, 28, 18}, {29, 20, 14}};
        int[][] actual = new MatrixMultiplication().solution(arr1, arr2);
        
        assertEquals(expected.length, actual.length); // check row
        assertEquals(expected[0].length, actual[0].length); // check col
        
        for(int i=0; i<expected.length; i++){
            for(int j=0; j<expected[0].length; j++){
                assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }

}