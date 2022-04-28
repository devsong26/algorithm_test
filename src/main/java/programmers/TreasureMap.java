package programmers;

public class TreasureMap {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] map = new String[n];
        String format = "%" + n + "s";

        for(int i=0; i<n; i++){
            String one = String.format(format, Integer.toBinaryString(arr1[i])).replaceAll(" ", "0");
            String two = String.format(format, Integer.toBinaryString(arr2[i])).replaceAll(" ", "0");

            StringBuilder sb = new StringBuilder();
            for(int j=0; j<n; j++){
                sb.append(
                        one.charAt(j) == two.charAt(j) && one.charAt(j) == '0' ?
                                " " : "#");
            }
            map[i] = sb.toString();
        }

        return map;
    }
}
