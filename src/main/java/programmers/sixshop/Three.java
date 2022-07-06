package programmers.sixshop;

import java.util.*;

public class Three {

    public static void main(String[] args){
        // expected result: {2,3,1,5,4}
        int n = 3;
        int[] coff = new int[]{4, 2, 2, 5, 3};
        new Solution().solution(n, coff);
    }

    static class Solution {
        public int[] solution(int N, int[] coffee_times) {
            int[] answer = new int[coffee_times.length];
            int ind = 0;
            int coffeeInd = 0;

            List<Map<Integer, Integer>> machines = new LinkedList<>();
            for(int i=0; i<N; i++){
                Map<Integer, Integer> map = new HashMap<>();
                map.put(coffeeInd+1, coffee_times[coffeeInd++]);
                machines.add(map);
            }

            while(checkZero(answer)){
                for(Map<Integer, Integer> machine : machines) {
                    for (Map.Entry<Integer, Integer> entry : machine.entrySet()) {
                        if (entry.getValue() - 1 == 0) {
                            answer[ind++] = entry.getKey();
                            machine.clear();

                            if (coffeeInd < coffee_times.length)
                                machine.put(coffeeInd + 1, coffee_times[coffeeInd++]);
                        } else {
                            entry.setValue(entry.getValue() - 1);
                        }
                    }
                }
            }

            return answer;
        }

        private boolean checkZero(int[] answer){
            for(int n : answer){
                if(n == 0) return true;
            }
            return false;
        }

    }

}
