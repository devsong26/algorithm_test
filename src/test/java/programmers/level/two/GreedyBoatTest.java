package programmers.level.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreedyBoatTest {

    @Test
    public void test_1(){
        int[] people = {70, 50, 80, 50};
        int limit = 100;

        assertEquals(3, new GreedyBoat().solution(people, limit));
    }

    @Test
    public void test_2(){
        int[] people = {70, 80, 50};
        int limit = 100;

        assertEquals(3, new GreedyBoat().solution(people, limit));
    }

    @Test
    public void test_3(){
        int[] people = {60, 50, 50, 40};
        int limit = 100;

        assertEquals(2, new GreedyBoat().solution(people, limit));
    }

    @Test
    public void test_4(){
        int[] people = {60, 70, 80, 80};
        int limit = 100;

        assertEquals(4, new GreedyBoat().solution(people, limit));
    }

    @Test
    public void test_5(){
        int[] people = {60, 50, 50, 50, 40};
        int limit = 100;

        assertEquals(3, new GreedyBoat().solution(people, limit));
    }

    @Test
    public void test_6(){
        int[] people = {60, 60, 60, 60, 60};
        int limit = 100;

        assertEquals(5, new GreedyBoat().solution(people, limit));
    }

    @Test
    public void test_7(){
        int[] people = {100, 90, 80, 70, 60};
        int limit = 110;

        assertEquals(5, new GreedyBoat().solution(people, limit));
    }

    @Test
    public void test_8(){
        int[] people = {10,20,30,40,50,60,70,80,90};
        int limit = 100;

        assertEquals(5, new GreedyBoat().solution(people, limit));
    }

    @Test
    public void test_9(){
        int[] people = {40, 40, 40};
        int limit = 100;

        assertEquals(2, new GreedyBoat().solution(people, limit));
    }

    @Test
    public void test_10(){
        int[] people = {60, 70, 50, 80, 50};
        int limit = 140;

        assertEquals(3, new GreedyBoat().solution(people, limit));
    }

    @Test
    public void test_11(){
        int[] people = {50, 80, 240};
        int limit = 240;

        assertEquals(2, new GreedyBoat().solution(people, limit));
    }

    @Test
    public void test_12(){
        int[] people = {39, 91, 201, 149};
        int limit = 240;

        assertEquals(2, new GreedyBoat().solution(people, limit));
    }

}
