package programmers.level.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BargainSaleTest {

    @Test
    public void test_1(){
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int[] number = {3, 2, 2, 2, 1};
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};

        assertEquals(3, new BargainSale().solution(want, number, discount));
    }

    @Test
    public void test_2(){
        String[] want = {"apple"};
        int[] number = {10};
        String[] discount = {"banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"};

        assertEquals(0, new BargainSale().solution(want, number, discount));
    }

    @Test
    public void test_3(){
        String[] want = {"apple"};
        int[] number = {10};
        String[] discount = {"apple", "apple", "apple", "apple", "apple", "apple", "apple", "apple", "apple", "apple"};

        assertEquals(1, new BargainSale().solution(want, number, discount));
    }

    @Test
    public void test_4(){
        String[] want = {"apple", "banana"};
        int[] number = {1, 9};
        String[] discount = {"apple", "apple", "apple", "apple", "apple", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"};

        assertEquals(0, new BargainSale().solution(want, number, discount));
    }

    @Test
    public void test_5(){
        String[] want = {"apple", "banana"};
        int[] number = {1, 9};
        String[] discount = {"apple", "apple", "apple", "apple", "apple", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana", "banana"};

        assertEquals(1, new BargainSale().solution(want, number, discount));
    }

}