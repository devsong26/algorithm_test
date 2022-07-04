package programmers;

public class PhoneNumberHider {

    public static void main(String[] args){
        System.out.println(new Solution().solution("01033334444"));
    }

    static class Solution {
        public String solution(String phone_number) {
            String substring = phone_number.substring(0, phone_number.length() - 4);
            return phone_number.replace(
                     substring, substring.replaceAll("\\d", "*"));
        }
    }

}
