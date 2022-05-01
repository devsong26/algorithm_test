package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrToIntTest {

    private StrToInt strToInt;

    @BeforeEach
    public void setUp(){
        strToInt = new StrToInt();
    }

    @Test
    public void 입력_1() {
        assertEquals(1234, strToInt.solution("1234"));
    }
}
