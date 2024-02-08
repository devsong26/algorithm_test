package programmers.level.one;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GiftTest {

    @Test
    public void test_1(){
        String[] friends = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};

        assertEquals(2, new Gift().solution(friends, gifts));
    }

    @Test
    public void test_2(){
        String[] friends = {"joy", "brad", "alessandro", "conan", "david"};
        String[] gifts = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};

        assertEquals(4, new Gift().solution(friends, gifts));
    }

    @Test
    public void test_3(){
        String[] friends = {"a", "b", "c"};
        String[] gifts = {"a b", "b a", "c a", "a c", "a c", "c a"};

        assertEquals(0, new Gift().solution(friends, gifts));
    }

}