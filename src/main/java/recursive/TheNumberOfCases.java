package recursive;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

// 경우의 수
public class TheNumberOfCases {

    public static void main(String[] args){
        int[] a = {1, 1, 1, 1};

        for(int i=0; i<a.length; i++) {
            Set<Integer> visit = new LinkedHashSet<>();
            foo(a, visit, i);
        }
    }

    private static void foo(int[] a, Set<Integer> visit, int i){
        if( visit.contains(i) ) return;

        visit.add(i);

        if(visit.size() == a.length){
            printVisit(visit);
            return;
        }

        for(int j = i + 1; j < a.length; j++) foo(a, new LinkedHashSet<>(visit), j);
        for(int j = i - 1; j >= 0; j--) foo(a, new LinkedHashSet<>(visit), j);
    }

    private static void printVisit(Set<Integer> visit){
        System.out.println(visit.stream().map(String::valueOf).collect(Collectors.joining(" ")));
    }
}
