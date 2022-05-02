package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NotDuplicateSerialNumberTest {

    private NotDuplicateSerialNumber notDuplicateSerialNumber;

    @BeforeEach
    public void setUp(){
        notDuplicateSerialNumber = new NotDuplicateSerialNumber();
    }

    @Test
    void 입력_1() {
        int[] expected = {1,3,0,1};
        int[] result = notDuplicateSerialNumber.solution(new int[]{1, 1, 3, 3, 0, 1, 1});

        assertNotNull(result);
        assertEquals(result.length, expected.length);
        assertEquals(result[0], expected[0]);
        assertEquals(result[1], expected[1]);
        assertEquals(result[2], expected[2]);
        assertEquals(result[3], expected[3]);
    }

    @Test
    void 입력_2() {
        int[] expected = {4, 3};
        int[] result = notDuplicateSerialNumber.solution(new int[]{4,4,4,3,3});

        assertNotNull(result);
        assertEquals(result.length, expected.length);
        assertEquals(result[0], expected[0]);
        assertEquals(result[1], expected[1]);
    }

}
