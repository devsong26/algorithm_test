package programmers;

import java.util.Arrays;

public class Budget {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);

        int result = 0;

        for(int e : d){
            if((budget -= e) >= 0){
                result++;
            }
        }

        return result;
    }
}
