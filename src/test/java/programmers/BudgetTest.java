package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BudgetTest {

    private Budget bd;

    @BeforeEach
    public void setUp(){
        bd = new Budget();
    }

    @Test
    void 입력_1() {
        int[] d = {1,3,2,5,4};
        int budget = 9;

        assertEquals(3, bd.solution(d, budget));
    }

    @Test
    void 입력_2() {
        int[] d = {2,2,3,3};
        int budget = 10;

        assertEquals(4, bd.solution(d, budget));
    }

    @Test
    void 입력_3(){
        int[] d = {11, 1};
        int budget = 10;

        assertEquals(1, bd.solution(d, budget));
    }
}
