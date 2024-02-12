package programmers.level.two;

import java.util.*;

public class ChoiceTangerine {

    public int solution(int k, int[] tangerine) {
        int answer = 0;
        final Map<Integer, Integer> counter = new HashMap<>();

        for(int t : tangerine){
            if(counter.containsKey(t)){
                counter.put(t, counter.get(t) + 1);
            }else{
                counter.put(t, 1);
            }
        }


        final List<Map.Entry<Integer,Integer>> sortedEntries =
                counter.entrySet().stream()
                        .sorted(
                                Collections.reverseOrder(
                                        Comparator.comparingInt(Map.Entry::getValue))
                        ).toList();


        for(Map.Entry<Integer, Integer> entry : sortedEntries){
            if(k >= entry.getValue() || 0 < k){
                k -= entry.getValue();
                answer++;
            }else{
                break;
            }
        }

        return answer;
    }

}
