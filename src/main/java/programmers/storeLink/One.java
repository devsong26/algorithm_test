package programmers.storeLink;

public class One {

    public static void main(String[] args){
        // 21 -> 22
        // 3462 -> 3462
        // 235386
        System.out.println(new Solution().solution(235386));
    }

    static class Solution {
        public int solution(int num) {
            int answer = 0;

            for(int n=num; answer == 0; n++){
                String number = String.valueOf(n);
                if(number.length() % 2 == 1) continue;

                int frontMultiply = multiplyNumberDigits(number.substring(0, number.length() / 2));
                int backMultiply = multiplyNumberDigits(number.substring(number.length() / 2));

                if(frontMultiply == backMultiply){
                    answer = n;
                }
            }

            return answer;
        }

        private int multiplyNumberDigits(String numberStr){
            int multiply = 1;
            int asciiZero = 48;

            for(int i=0; i<numberStr.length(); i++){
                multiply *= (numberStr.charAt(i) - asciiZero);
            }

            return multiply;
        }
    }

}
