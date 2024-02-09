package programmers.level.one;

import java.util.Optional;

public class NeighborSquare {

    public int solution(String[][] board, int h, int w) {
        final String target = board[h][w];
        int answer = 0;

        String[] neighbors = new String[4];

        if(h - 1 >= 0){
            neighbors[0] = board[h - 1][w];
        }
        if(h + 1 <= board.length - 1){
            neighbors[1] = board[h + 1][w];
        }
        if(w - 1 >= 0){
            neighbors[2] = board[h][w - 1];
        }
        if(w + 1 <= board[0].length - 1){
            neighbors[3] = board[h][w + 1];
        }

        for(String neighbor : neighbors){
            answer += Optional.ofNullable(neighbor)
                    .map(n -> n.equals(target) ? 1 : 0)
                    .orElse(0);
        }

        return answer;
    }

}
