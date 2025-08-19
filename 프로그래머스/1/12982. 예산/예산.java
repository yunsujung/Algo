import java.util.*;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        Arrays.sort(d); // 작은 금액부터 지원
        
        for (int i = 0; i < d.length; i++) {
            if (sum + d[i] <= budget) {
                sum += d[i];
                answer++;
            } else {
                break; // 더 이상 예산 초과 시 중단
            }
        }
        return answer;
    }
}
