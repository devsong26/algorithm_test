//package programmers.level.two;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class AccumulatedMin {
//
//    public static void main(String[] args){
//        Solution s = new Solution();
//
//        int[] a = {1, 4, 2};
//        int[] b = {5, 4, 4};
//
//        System.out.println(s.solution(a, b));
//    }
//
//    private static class Solution{
//        private int[] a;
//        private int[] b;
//        private Integer min = Integer.MAX_VALUE;
//
//        public int solution(int[] a, int[] b){
//            this.a = a;
//            this.b = b;
//            Set<Integer> visitA = new HashSet<>(),
//                         visitB = new HashSet<>();
//
//            recursive(visitA, visitB, 0);
//
//            return min;
//        }
//
//        private void recursive(Set<Integer> visitA, Set<Integer> visitB, Integer sum){
//            int maxSize = a.length;
//            if( (visitA.size() + visitB.size()) == maxSize << 1 ){
//                if( min > sum ) min = sum;
//                return;
//            }
//
//            for(int i=0; i<a.length; i++){
//                if( unvisited(visitA, i) ){
//                    sum += a[i];
//
//                    for()
//                }
//            }
//            recursive(new HashSet<>(visitA), new HashSet<>(visitB), sum);
//        }
//
//        private boolean unvisited(Set<Integer> visit, int i){
//            if(visit.contains(i)) return false;
//
//            visit.add(i);
//            return true;
//        }
//
//    }
//}
