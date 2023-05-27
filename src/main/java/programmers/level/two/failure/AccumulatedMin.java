package programmers.level.two.failure;

import java.util.Comparator;
import java.util.PriorityQueue;

public class AccumulatedMin {

    public static void main(String[] args){
        Solution s = new Solution();

        int[] a = {1, 4, 2};
        int[] b = {4, 4, 5};

        System.out.println(s.solution(a, b));
    }

    private static class Solution{

        public int solution(int[] a, int[] b){
            PriorityQueue<Integer> aQue = new PriorityQueue<>();
            PriorityQueue<Integer> bQue = new PriorityQueue<>(Comparator.reverseOrder());

            for(int i=0; i<a.length; i++){
                aQue.add(a[i]);
                bQue.add(b[i]);
            }

            int answer = 0;

            while( ! aQue.isEmpty() ){
                answer += (aQue.poll() * bQue.poll());
            }

            return answer;
        }

    }
}
