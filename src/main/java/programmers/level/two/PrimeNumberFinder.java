package programmers.level.two;

import java.util.HashSet;
import java.util.Set;

public class PrimeNumberFinder {

    public static void main(String[] args){
        System.out.println(new Solution().solution("1231"));
    }

    static class Solution {
        private Set<Integer> intSet = new HashSet<>();

        public int solution(String numbers) {
            char[] chArr = numbers.toCharArray();

            for(int r=1; r<=numbers.length(); r++){
                permutation(chArr, 0, chArr.length, r, "");
            }

            int primeCnt = 0;
            for(Integer n : intSet){
                if(isPrime(n)) primeCnt++;
            }

            return primeCnt;
        }

        private boolean isPrime(int n){
            for(int i=2; i*i<=n; i++){ // 1과 자기 자신 이외에 수에서 약수를 가지는지 판단
                if(n % i == 0) return false;
            }
            return n != 1 && n != 0;
        }

        private void permutation(char[] arr, int depth, int n, int r, String number) {
            if (depth == r) {
                intSet.add(Integer.parseInt(number));
                return;
            }

            for (int i=depth; i<n; i++) {
                swap(arr, depth, i);
                permutation(arr, depth + 1, n, r, number + (arr[depth] - 48));
                swap(arr, depth, i);
            }
        }

        private void swap(char[] arr, int depth, int i) {
            char temp = arr[depth];
            arr[depth] = arr[i];
            arr[i] = temp;
        }

    }

}
