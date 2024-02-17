package programmers.level.two;

import java.util.HashMap;
import java.util.Map;

public class L1Cache {

    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        final Map<String, Integer> cache = new HashMap<>();

        for(int i = 0; i < cities.length; i++){
            String city = cities[i].toLowerCase();

            if(cache.containsKey(city)){
                answer++;
                cache.put(city, i);
            }else{
                if(cacheSize > 0 && cache.size() == cacheSize){
                    String notLeastRecentlyUsed = null;
                    int minUseCnt = Integer.MAX_VALUE;

                    for(Map.Entry<String, Integer> entry : cache.entrySet()){
                        if(minUseCnt > entry.getValue()){
                            minUseCnt = entry.getValue();
                            notLeastRecentlyUsed = entry.getKey();
                        }
                    }

                    cache.remove(notLeastRecentlyUsed);
                    cache.put(city, i);
                }else if(cacheSize > 0 && cache.size() < cacheSize){
                    cache.put(city, i);
                }

                answer+=5;
            }
        }

        return answer;
    }

}
