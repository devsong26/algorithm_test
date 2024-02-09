package programmers.level.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BandageTest {

    @Test
    public void test_1(){
        int[] bandage = {5, 1, 5};
        int health = 30;
        int[][] attacks = {{2, 10}, {9, 15}, {10, 5}, {11, 5}};

        assertEquals(5, new Bandage().solution(bandage, health, attacks));
    }

    @Test
    public void test_2(){
        int[] bandage = {3, 2, 7};
        int health = 20;
        int[][] attacks = {{1, 15}, {5, 16}, {8, 6}};

        assertEquals(-1, new Bandage().solution(bandage, health, attacks));
    }

    @Test
    public void test_3(){
        int[] bandage = {4, 2, 7};
        int health = 20;
        int[][] attacks = {{1, 15}, {5, 16}, {8, 6}};

        assertEquals(-1, new Bandage().solution(bandage, health, attacks));
    }

    @Test
    public void test_4(){
        int[] bandage = {1, 1, 1};
        int health = 5;
        int[][] attacks = {{1, 2}, {3, 2}};

        assertEquals(3, new Bandage().solution(bandage, health, attacks));
    }
    
    @Test
    public void test_5(){
        int[] bandage = {10,10,100};
        int health = 10;
        int[][] attacks = {{1,15}, {3,1}};

        assertEquals(-1, new Bandage().solution(bandage, health, attacks));
    }
    
}