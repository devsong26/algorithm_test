package programmers.level.two;

import java.math.BigDecimal;

public class LongJump {

    public long solution(int n) {
        long answer;

        if(n > 1){
            BigDecimal[] fibonacci = new BigDecimal[n];
            fibonacci[0] = new BigDecimal(1);
            fibonacci[1] = new BigDecimal(2);

            for(int i=2; i< fibonacci.length; i++){
                fibonacci[i] = fibonacci[i - 2].add(fibonacci[i - 1]);
            }

            answer = fibonacci[fibonacci.length - 1].divideAndRemainder(
                    new BigDecimal(1234567))[1].longValue();
        }else{
            answer = 1;
        }

        return answer;
    }

}
