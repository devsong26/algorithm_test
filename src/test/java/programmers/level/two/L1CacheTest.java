package programmers.level.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class L1CacheTest {

    @Test
    public void test_1(){
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        assertEquals(50, new L1Cache().solution(cacheSize, cities));
    }

    @Test
    public void test_2(){
        int cacheSize = 3;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"};

        assertEquals(21, new L1Cache().solution(cacheSize, cities));
    }

    @Test
    public void test_3(){
        int cacheSize = 2;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};

        assertEquals(60, new L1Cache().solution(cacheSize, cities));
    }

    @Test
    public void test_4(){
        int cacheSize = 5;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"};

        assertEquals(52, new L1Cache().solution(cacheSize, cities));
    }

    @Test
    public void test_5(){
        int cacheSize = 2;
        String[] cities = {"Jeju", "Pangyo", "NewYork", "newyork"};

        assertEquals(16, new L1Cache().solution(cacheSize, cities));
    }

    @Test
    public void test_6(){
        int cacheSize = 0;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "LA"};

        assertEquals(25, new L1Cache().solution(cacheSize, cities));
    }

    @Test
    public void test_7(){
        int cacheSize = 3;
        String[] cities = {"A", "B", "C", "A", "D", "G", "A"};

        assertEquals(27, new L1Cache().solution(cacheSize, cities));
    }

    @Test
    public void test_8(){
        int cacheSize = 0;
        String[] cities = {"Jeju", "Pangyo", "Seoul", "NewYork", "NewYork"};

        assertEquals(25, new L1Cache().solution(cacheSize, cities));
    }


}