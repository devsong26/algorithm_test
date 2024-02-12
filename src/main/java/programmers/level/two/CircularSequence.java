package programmers.level.two;

import java.util.HashSet;
import java.util.Set;

public class CircularSequence {

    public int solution(int[] elements) {
        final int maxLen = elements.length;
        final Set<Integer> set = new HashSet<>();

        for(int nowLen = 1; nowLen <= maxLen; nowLen++){
            for(int i=0; i<maxLen; i++){
                int n = 0, inI = i;

                for(int j=0; j<nowLen; j++){
                    n += elements[inI % maxLen];
                    inI++;
                }

                set.add(n);
            }
        }

        return set.size();
    }

}
