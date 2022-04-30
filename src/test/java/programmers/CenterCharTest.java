package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CenterCharTest {

    private CenterChar centerChar;

    @BeforeEach
    public void setUp(){
        centerChar = new CenterChar();
    }

    @Test
    public void 입력_1(){
        assertEquals("c", centerChar.solution("abcde"));
    }

    @Test
    public void 입력_2(){
        assertEquals("we", centerChar.solution("qwer"));
    }

}
