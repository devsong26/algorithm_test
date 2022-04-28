package programmers;

public class InsufficientAmount {
    public long solution(int price, int money, int count) {
        long answer = money - (Long.valueOf(count * (count + 1)) / 2) * price;
        return answer >= 0 ? 0 : -1 * answer;
    }
}
