package hanoitower;

import java.util.ArrayList;
import java.util.Stack;

public class One {

    public static void main(String[] args){
        One one = new One();
        one.solution(2);
    }

    private int[][] solution(int n){
        int[][] answer = {};

        Stack<Integer> a = new Stack<>();
        Stack<Integer> b = new Stack<>();
        Stack<Integer> c = new Stack<>();

        setPanel(a, n);
        movePanel(a, b, c, n);

        return answer;
    }

    private void setPanel(Stack<Integer> s, int n){
        for(int i=n; i>0; i--){
            int top = s.empty() ? Integer.MAX_VALUE : s.peek();
            if(top > i){
                s.push(i);
            }
        }
    }

    private void movePanel(Stack<Integer> a, Stack<Integer> b, Stack<Integer> c, int n){
        if(c.size() == n){
            return;
        }

        if(!a.empty() && (b.empty() || b.peek() > a.peek())){ // a -> b
            b.push(a.pop());
            movePanel(a, b, c, n);
        }
        if(!a.empty() && (c.empty() || c.peek() > a.peek())){ // a -> c
            c.push(a.pop());
            movePanel(a, b, c, n);
        }
        if(!b.empty() && (a.empty() ||a.peek() > b.peek())){ // b -> a
            a.push(b.pop());
            movePanel(a, b, c, n);
        }
        if(!b.empty() && (c.empty() ||c.peek() > b.peek())){ // b -> c
            c.push(b.pop());
            movePanel(a, b, c, n);
        }
        if(!c.empty() && (a.empty() ||a.peek() > c.peek())){ // c -> a
            a.push(c.pop());
            movePanel(a, b, c, n);
        }
        if(!c.empty() && (b.empty() || b.peek() > c.peek())){ // c -> b
            b.push(c.pop());
            movePanel(a, b, c, n);
        }
    }

//    private void movePanel(Stack<Integer> from, Stack<Integer> to){
//        boolean isFrom2To =
//                to.empty() ||
//                to.peek() > from.peek();
//        if(isFrom2To){
//            to.push(from.pop());
//        }else{
//            break;
//        }
//    }

}
