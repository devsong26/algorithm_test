package programmers;

public class PrintRectangle {
    public String solution(int a, int b) {
        StringBuilder sb = new StringBuilder();
        for(int l=0; l<b; l++){
            for(int c=0; c<a; c++){
                sb.append("*");
            }
            sb.append("\n");
        }

        return sb.substring(0, sb.length() - 1);
    }
}
