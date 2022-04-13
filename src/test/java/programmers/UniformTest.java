package programmers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UniformTest {

    @Test
    void 전체학생_수는_2명미만_30명초과() {
        int[] lost = {2, 4}; //체육복을 도난 당한 학생들
        int[] reserve = {1, 3, 5}; //여벌의 체육복을 가진 학생수

        Assertions.assertThrows(RuntimeException.class,
                ()->{
                    Uniform uniform = new Uniform();
                    uniform.solution(1, lost, reserve);
                });

        Assertions.assertThrows(RuntimeException.class,
                ()->{
                    Uniform uniform = new Uniform();
                    uniform.solution(31, lost, reserve);
                });
    }

    @Test
    void name() {
        int[] lost = {2, 4}; //체육복을 도난 당한 학생들
        int[] reserve = {1, 3, 5}; //여벌의 체육복을 가진 학생수
        Uniform uniform = new Uniform();
        uniform.solution(5, lost, reserve);
    }

//    @Test
//    void getLostReserveCnt() {
//        int[] lost = {1, 2, 4}; //체육복을 도난 당한 학생들
//        int[] reserve = {1, 3, 5}; //여벌의 체육복을 가진 학생수
//
//        Uniform uniform = new Uniform();
//        System.out.println(uniform.getLostReserveCnt(lost, reserve));
//        System.out.println();
//    }
//
//    @Test
//    void getBorrowerCnt(){
//        int[] lost = {0, 2, 4}; //체육복을 도난 당한 학생들
//        int[] reserve = {0, 3, 5}; //여벌의 체육복을 가진 학생수
//
//        Uniform uniform = new Uniform();
//        Assertions.assertEquals(uniform.getBorrowerCnt(lost, reserve), 2);
//    }
}
