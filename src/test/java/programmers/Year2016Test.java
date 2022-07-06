package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import programmers.level.one.Year2016;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Year2016Test {

    private Year2016 year2016;

    @BeforeEach
    public void setUp(){
        year2016 = new Year2016();
    }

    @Test
    void 입력_1() {
        assertEquals(year2016.solution(5, 24), "TUE");
    }

}
