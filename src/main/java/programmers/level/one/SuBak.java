package programmers.level.one;

public class SuBak {
    public String solution(int n) {
        StringBuilder res = new StringBuilder();

        for(int i=0; i<=n/2; i++){
            res.append("수박");
        }

        return res.substring(0, n);
    }
}
