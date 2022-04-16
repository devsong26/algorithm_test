package programmers;

public class Measure {
    public int solution(int left, int right) {
        int sum = 0;

        for(int n=left; n<=right; n++){
            Double sqrt = Math.sqrt(n);
            sum += sqrt - sqrt.intValue() == 0 ? -n : n;
        }

        return sum;
    }
}
