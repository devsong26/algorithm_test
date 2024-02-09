package programmers.level.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NeighborSquareTest {

    @Test
    public void test_1(){
        String[][] board = {{"blue", "red", "orange", "red"}, {"red", "red", "blue", "orange"}, {"blue", "orange", "red", "red"}, {"orange", "orange", "red", "blue"}};
        int h = 1;
        int w = 1;
                
        assertEquals(2, new NeighborSquare().solution(board, h, w));
    }

    @Test
    public void test_2(){
        String[][] board = {{"yellow", "green", "blue"}, {"blue", "green", "yellow"}, {"yellow", "blue", "blue"}};
        int h = 0;
        int w = 1;

        assertEquals(1, new NeighborSquare().solution(board, h, w));
    }

}