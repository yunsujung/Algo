import java.util.*;

class Solution {
    public int solution(String s) {
    String[] tokens = s.split(" ");
    int answer = 0;
    Stack<Integer> stack = new Stack<>();

    for (int i = 0; i < tokens.length; i++) {
        String token = tokens[i];
        if (token.equals("Z")) {
            if (!stack.isEmpty()) answer -= stack.pop();
        } else {
            int num = Integer.parseInt(token);
            stack.push(num);
            answer += num;
        }
    }

    return answer;
    }
}