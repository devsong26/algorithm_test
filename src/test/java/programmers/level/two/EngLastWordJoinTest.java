package programmers.level.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EngLastWordJoinTest {
    
    @Test
    public void test_1(){
        int n = 3;
        String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
        
        int[] expected = {3,3};
        int[] actual = new EngLastWordJoin().solution(n, words);

        assertEquals(2, actual.length);
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    @Test
    public void test_2(){
        int n = 5;
        String[] words = {"hello", "observe", "effect", "take", "either", "recognize", "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"};
        
        int[] expected = {0,0};
        int[] actual = new EngLastWordJoin().solution(n, words);

        assertEquals(2, actual.length);
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    @Test
    public void test_3(){
        int n = 2;
        String[] words = {"hello", "one", "even", "never", "now", "world", "draw"};

        int[] expected = {1,3};
        int[] actual = new EngLastWordJoin().solution(n, words);

        assertEquals(2, actual.length);
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

}