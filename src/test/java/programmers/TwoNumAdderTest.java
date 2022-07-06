package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import programmers.level.one.TwoNumAdder;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoNumAdderTest {

    private TwoNumAdder adder;

    @BeforeEach
    public void setUp(){
        adder = new TwoNumAdder();
    }

    @Test
    public void 입력_1(){
        int[] numbers = {2,1,3,4,1};
        int[] result = adder.solution(numbers);
        int[] expected = {2,3,4,5,6,7};

        for(int i=0; i< result.length; i++){
            assertEquals(expected[i], result[i]);
        }
    }

    @Test
    public void 입력_2(){
        int[] numbers = {5,0,2,7};
        int[] result = adder.solution(numbers);
        int[] expected = {2,5,7,9,12};

        for(int i=0; i< result.length; i++){
            assertEquals(expected[i], result[i]);
        }
    }

}
