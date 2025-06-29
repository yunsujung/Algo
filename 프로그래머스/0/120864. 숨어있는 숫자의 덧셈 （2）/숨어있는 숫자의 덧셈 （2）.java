class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String temp = "";

        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);

            if (Character.isDigit(c)) {
                temp += c; // 숫자 누적
            } else {//이미 숫자가 아닌 문자.
                if (!temp.isEmpty()) {//빈문자열이 아니라면
                    answer += Integer.parseInt(temp); // 누적된 숫자 더함
                    temp = ""; // 초기화
                }
            }
        }

        // 문자열이 숫자로 끝난 경우 처리
        if (!temp.isEmpty()) {
            answer += Integer.parseInt(temp);
        }

        return answer;
    }
}
