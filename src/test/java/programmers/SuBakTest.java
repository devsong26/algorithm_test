package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SuBakTest {

    private SuBak suBak;

    @BeforeEach
    public void setUp(){
        suBak = new SuBak();
    }

    @Test
    public void 입력_1(){
        assertEquals("수박수", suBak.solution(3));
    }

    @Test
    public void 입력_2(){
        assertEquals("수박수박", suBak.solution(4));
    }

}
