class Solution {
    public String[] solution(String my_str, int n) {
        int length = 0;
        if (my_str.length() % n == 0) {
            length = my_str.length() / n;
        } else {
            length = (my_str.length() / n) + 1;
        }

        String[] answer = new String[length];

        for (int i = 0; i < length; i++) {
            int start = i * n;
            int end = Math.min(start + n, my_str.length());
            answer[i] = my_str.substring(start, end);
        }

        return answer;
    }
}
