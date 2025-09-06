class Solution {
    public int solution(int n) {
        // 1. 3진법으로 변환
        String ternary = Integer.toString(n, 3);
        
        // 2. 문자열 뒤집기
        String reversed = new StringBuilder(ternary).reverse().toString();
        
        // 3. 10진법으로 변환
        return Integer.parseInt(reversed, 3);
    }
}
