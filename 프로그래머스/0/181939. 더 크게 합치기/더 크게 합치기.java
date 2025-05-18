class Solution {
    public int solution(int a, int b) {
        String aa = String.valueOf(a);
        String bb = String.valueOf(b);
        
        String aabb = aa+bb;
        String bbaa = bb+aa;
        
        int ab = Integer.parseInt(aabb);
        int ba = Integer.parseInt(bbaa);
        
        int answer = 0;
        answer = Math.max(ab,ba);
        
        return answer;
    }
}