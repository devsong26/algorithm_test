package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchKimTest {

    private SearchKim searchKim;

    @BeforeEach
    public void setUp(){
        searchKim = new SearchKim();
    }

    @Test
    public void 입력_1(){
        String[] seoul = new String[]{"Jane", "Kim"};
        assertEquals("김서방은 1에 있다", searchKim.solution(seoul));
    }

}
