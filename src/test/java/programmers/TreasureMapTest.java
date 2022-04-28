package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TreasureMapTest {

    private TreasureMap treasureMap;

    @BeforeEach
    public void setUp(){
        treasureMap = new TreasureMap();
    }

    @Test
    public void 입력_1(){
        String[] map = treasureMap.solution(5, new int[]{9, 20, 28, 18, 11}, new int[]{30, 1, 21, 17, 28});
        assertNotNull(map);
        assertEquals(map[0], "#####");
        assertEquals(map[1], "# # #");
        assertEquals(map[2], "### #");
        assertEquals(map[3], "#  ##");
        assertEquals(map[4], "#####");
    }

}
