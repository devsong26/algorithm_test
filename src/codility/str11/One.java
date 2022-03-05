package codility.str11;

public class One {

    public static void main(String[] args){
        System.out.println(new Solution().solve(1000));
    }

    static class Solution{

        public int solve(int N){
            int sum = sumOfDigits(N);
            int searchN = N + 1, searchSum = sumOfDigits(searchN);

            while(searchSum != sum){
                searchSum = sumOfDigits(++searchN);
            }

            return searchN;
        }

        private int sumOfDigits(int N){
            int sum = 0;

            while(N > 0){
                sum += (N % 10);
                N /= 10;
            }

            return sum;
        }

    }

}
