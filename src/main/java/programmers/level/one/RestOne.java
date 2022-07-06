package programmers.level.one;

public class RestOne {
    public int solution(int n) {
        for(int r = 2; ; r++){
            if(n % r == 1){
                return r;
            }
        }
    }
}
