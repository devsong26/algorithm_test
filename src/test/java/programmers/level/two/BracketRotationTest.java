package programmers.level.two;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketRotationTest {

    @Test
    public void test_1(){
        String s = "[](){}";

        assertEquals(3, new BracketRotation().solution(s));
    }

    @Test
    public void test_2(){
        String s = "}]()[{";

        assertEquals(2, new BracketRotation().solution(s));
    }

    @Test
    public void test_3(){
        String s = "[)(]";

        assertEquals(0, new BracketRotation().solution(s));
    }

    @Test
    public void test_4(){
        String s = "}}}";

        assertEquals(0, new BracketRotation().solution(s));
    }

}