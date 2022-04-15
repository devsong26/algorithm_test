package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PocketMonsterTest {

    private PocketMonster pm;

    @BeforeEach
    public void setUp(){
        pm = new PocketMonster();
    }

    @Test
    void 입력_1() {
        int[] nums = {4, 4, 3, 2};
        assertEquals(pm.solution(nums), 2);
    }

    @Test
    void 입력_2() {
        int[] nums = {3,3,3,2,2,4};
        assertEquals(pm.solution(nums), 3);
    }

    @Test
    void 입력_3() {
        int[] nums = {3,3,3,2,2,2};
        assertEquals(pm.solution(nums), 2);
    }
}
