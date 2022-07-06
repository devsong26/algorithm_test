package programmers.level.one;

public class DeterminingIntegerSquareRoots {

    public static void main(String[] args){
        System.out.println(new Solution().solution(121));
    }

    static class Solution {
        public long solution(long n) {
            double sqrt = Math.sqrt(n);
            long sqrtLongVal = (long)sqrt;
            return sqrt - sqrtLongVal > 0 ?
                    -1 : (sqrtLongVal + 1) * (sqrtLongVal + 1);
        }
    }

}
