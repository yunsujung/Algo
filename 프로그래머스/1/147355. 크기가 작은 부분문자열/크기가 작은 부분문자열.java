class Solution {
    public int solution(String t, String p) {
        int m = p.length(), cnt = 0;
        for (int i = 0; i <= t.length() - m; i++) {
            // 같은 길이끼리의 사전식 비교 == 숫자 크기 비교
            if (t.substring(i, i + m).compareTo(p) <= 0) cnt++;
        }
        return cnt;
    }
}
