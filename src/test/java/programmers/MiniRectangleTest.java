package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.crypto.spec.PSource;
import java.util.*;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MiniRectangleTest {

    private MiniRectangle rectangle;

    @BeforeEach
    public void setUp(){
        rectangle = new MiniRectangle();
    }

    @Test
    void 입력_1() {
        int[][] sizes = {
                {60, 50},
                {30, 70},
                {60, 30},
                {80, 40}};
        assertEquals(4000, rectangle.solution(sizes));
    }

    @Test
    void 입력_2() {
        int[][] sizes = {{60, 50}};
        assertEquals(3000, rectangle.solution(sizes));
    }

    @Test
    void 입력_3() {
        int[][] sizes = {{60, 50}, {60, 30}};
        assertEquals(3000, rectangle.solution(sizes));
    }

    @Test
    void 입력_4() {
        int[][] sizes = {
                {60, 50},
                {30, 70}};
        assertEquals(3500, rectangle.solution(sizes));
    }

    @Test
    void 입력_5() {
        int[][] sizes = {
            {10, 7},
            {12, 3},
            {8, 15},
            {14, 7},
            {5, 15}
        };
        assertEquals(120, rectangle.solution(sizes));
    }

    @Test
    void 입력_6() {
        int[][] sizes = {
            {14, 4},
            {19, 6},
            {6, 16},
            {18, 7},
            {7, 11}
        };
        assertEquals(133, rectangle.solution(sizes));

//        Set<Integer> rectangles =
//                Arrays.stream(sizes)
//                        .flatMap(a ->
//                                Arrays.stream(sizes)
//                                        .map(b -> a[0] * b[1])
//                        ).collect(Collectors.toSet());
//
//        Set<Integer> rectangles2 =
//                Arrays.stream(sizes)
//                        .flatMap(a ->
//                                Arrays.stream(sizes)
//                                        .map(b -> a[1] * b[0])
//                        ).collect(Collectors.toSet());
//
//        rectangles.addAll(rectangles2);
//
//        rectangles = rectangles.stream()
//                    .sorted(Comparator.comparingInt(Integer::intValue))
//                    .collect(Collectors.toCollection(TreeSet::new));
//
////        rectangles.forEach(e -> System.out.println(e));
//
//
//        for(int i=0; i<sizes.length; i++){
//            int rectangle = sizes[i][0] * sizes[i][1];
//            rectangles.removeIf(e -> e <= rectangle);
//        }
//
//        System.out.println(((TreeSet)rectangles).first());
    }

    @Test
    void 입력_7() {
        int[][] sizes = {
                {12, 3},
                {8, 15},
                {5, 15}
        };
        assertEquals(120, rectangle.solution(sizes));
    }
}
