package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintRectangleTest {

    private PrintRectangle printRectangle;

    @BeforeEach
    public void setUp(){
        printRectangle = new PrintRectangle();
    }

    @Test
    void 입력_1() {
        String expected = "*****\n" +
                          "*****\n" +
                          "*****";
        assertEquals(expected, printRectangle.solution(5, 3));
    }
}
