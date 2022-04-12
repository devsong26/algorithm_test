package programmers;

import java.util.*;
import java.util.stream.Collectors;

public class Uniform {
    public int solution(int n, int[] lost, int[] reserve) {
        List<Integer> reserves =
                Arrays.stream(reserve)
                        .filter(e -> {
                            boolean notContain = true;
                            for(int l : lost){
                                if(l == e) notContain = false;
                            }
                            return notContain;
                        })
                        .boxed()
                        .collect(Collectors.toList());

        int result = n - lost.length;

        for(int l : lost){
            Integer after = (l + 1);
            Integer before = (l - 1);
            if(reserves.contains(before)){
                result++;
                reserves.remove(before);
            }else if(reserves.contains(after)){
                result++;
                reserves.remove(after);
            }
        }

        return result;
    }
}
