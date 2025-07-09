class Solution {
    public int solution(String my_string) {
        String[] tokens = my_string.split(" "); // 공백 기준으로 분리
        int answer = Integer.parseInt(tokens[0]); // 첫 번째 숫자부터 시작

        for (int i = 1; i < tokens.length; i += 2) {
            String operator = tokens[i];//연산자
            int number = Integer.parseInt(tokens[i + 1]);//숫자

            if (operator.equals("+")) {
                answer += number;
            } else if (operator.equals("-")) {
                answer -= number;
            }
        }

        return answer;
    }
}
