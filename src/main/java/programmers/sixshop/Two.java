package programmers.sixshop;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Two {

    public static void main(String[] args){
        int k = 2;
        //String[] userScores = new String[]{"a 100", "ch 200", "co 150", "lu 100", "a 120", "co 300", "ch 110"};
        //String[] userScores = new String[]{"a 100", "ch 200", "a 200", "ch 150", "co 50", "co 200"};
        String[] userScores = new String[]{"ch 200", "a 100", "co 150", "py 120"};
        System.out.println(new Solution().solution(k, userScores));
    }

    static class Solution {
        public int solution(int K, String[] user_scores) {
            List<Map<Integer, String>> scores = new ArrayList<>(K);
            int changeCnt = 0;

            for(int i=0; i<user_scores.length; i++){
                String[] spt = user_scores[i].split(" ");
                Map<Integer, String> score = new HashMap<>();

                Integer nowScore = Integer.parseInt(spt[1]);
                String nowName = spt[0];
                if(scores.size() > 0){
                    for(int j=0; j<scores.size(); j++){
                        Map<Integer, String> saved = scores.get(j);
                        // 순회하면서 지금 점수보다 낮은게 있다면 랭킹 변경
                        // 랭킹 점수가 변경됐지만 같은 사용자라면 changeCnt 증가 없음
                        // 위의 경우가 아니면 changeCnt 변경, 목록 랭킹 재정렬 키로
                    }
                }else{
                    score.put(nowScore, nowName);
                    scores.add(score);
                }
            }

            return changeCnt;
        }
    }

}

/**
 * String value, sptName = spt[0];
 *                 Integer key, sptValue = Integer.parseInt(spt[1]);
 *                 if(scores.entrySet().size() == K){
 *                     for(Map.Entry<Integer, String> entry : scores.entrySet()){
 *                         key = entry.getKey();
 *                         value = entry.getValue();
 *                         if(key < sptValue){
 *                             scores.remove(key, value);
 *                             scores.put(sptValue, sptName);
 *                             if(!value.equals(sptName)){
 *                                 changeCnt++;
 *                             }
 *                             break;
 *                         }
 *                     }
 *                 }else{
 *                     if(scores.entrySet().size() > 0) {
 *                         for (Map.Entry<Integer, String> entry : scores.entrySet()) {
 *                             key = entry.getKey();
 *                             value = entry.getValue();
 *                             if (!value.equals(sptName)) {
 *                                 scores.put(sptValue, sptName);
 *                                 changeCnt++;
 *                                 break;
 *                             }else{
 *                                 scores.remove(key, value);
 *                                 scores.put(sptValue, sptName);
 *                                 break;
 *                             }
 *                         }
 *                     }else{
 *                         scores.put(sptValue, sptName);
 *                         changeCnt++;
 *                     }
 *                 }
 */