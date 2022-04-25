package programmers;

import java.util.*;
import java.util.stream.Collectors;

public class MiniRectangle {
//    public int solution(int[][] sizes) {
//        int max_h = 0, max_w = 0;
//
//        for(int[] s : sizes){
//            if(max_w < s[0]) max_w = s[0];
//            if(max_h < s[1]) max_h = s[1];
//        }
//
//        int minimum = max_h * max_w;
//
//        for(int i=0; i<sizes.length; i++){
//            max_w = sizes[i][1];
//            max_h = sizes[i][0];
//
//            int[][] cloneSizes = Arrays.copyOf(sizes, sizes.length);
//            int selInd = max_w > max_h ? 1 : 0;
//
//            for(int j=0; j<cloneSizes.length; j++){
//                if ((selInd == 1 && cloneSizes[j][1] == max_w) ||
//                    (selInd == 0 && cloneSizes[j][0] == max_h) ) {
//                    int temp = cloneSizes[j][1];
//                    cloneSizes[j][1] = cloneSizes[j][0];
//                    cloneSizes[j][0] = temp;
//                }
//            }
//
//            for(int j=0; j<cloneSizes.length; j++){
//                if(i == j) continue;
//
//                if(max_w < cloneSizes[j][0]) max_w = cloneSizes[j][0];
//                if(max_h < cloneSizes[j][1]) max_h = cloneSizes[j][1];
//            }
//
//            if(minimum > max_w * max_h) minimum = max_w * max_h;
//        }
//
//        return minimum;
//    }

    public int solution(int[][] sizes) {
        final TreeSet<Integer> rectangles =
                Arrays.stream(sizes)
                        .flatMap(a ->
                                Arrays.stream(sizes)
                                        .filter(b -> a != b)
                                        .map(b -> Arrays.asList(
                                                new Integer[]{
                                                        a[0] * b[1],
                                                        a[1] * b[0],
                                                        a[0] * a[1],
                                                        b[0] * b[1],
                                                        a[0] * b[0],
                                                        a[1] * b[1]}))
                        ).reduce(new ArrayList<>(), (a, b) -> {
                            a.addAll(b);
                            return a;
                        }).stream().collect(Collectors.toCollection(TreeSet::new));

        TreeSet<Integer> clone = (TreeSet<Integer>)rectangles.clone();

        Arrays.stream(sizes)
                .map(e -> e[0] * e[1])
                .forEach(e -> rectangles.removeIf(e2 -> e2 <= e));

        return rectangles.size() == 0 ? clone.last() : rectangles.first();

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
//                .sorted(Comparator.comparingInt(Integer::intValue))
//                .collect(Collectors.toCollection(TreeSet::new));
//
//        for(int i=0; i<sizes.length; i++){
//            int rectangle = sizes[i][0] * sizes[i][1];
//            rectangles.removeIf(e -> e <= rectangle);
//        }

//        return (Integer) ((TreeSet)rectangles).first();
    }

}
