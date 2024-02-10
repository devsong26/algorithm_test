package programmers.level.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuerySelectorTest {

    @Test
    public void test_1(){
        int[][] data = {{1, 20300104, 100, 80}, {2, 20300804, 847, 37}, {3, 20300401, 10, 8}};
        String ext = "date";
        int val_ext = 20300501;
        String sort_by = "remain";


        int[][] expected = {{3,20300401,10,8},{1,20300104,100,80}};
        int[][] actual = new QuerySelector().solution(data, ext, val_ext, sort_by);

        assertEquals(expected.length, actual.length);
        assertEquals(expected[0].length, actual[0].length);

        for(int i=0; i<expected.length; i++){
            for(int j=0; j<expected[i].length; j++){
                assertEquals(expected[i][j], actual[i][j]);
            }
        }
    }

}