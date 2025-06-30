import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int n = emergency.length;
        int[] answer = new int[n];

        // 1. emergency 배열 복사
        int[] sorted = emergency.clone();

        // 2-1. 오름차순 정렬
        Arrays.sort(sorted);
        // 2-2. 내림차순 정렬
        for (int i = 0; i < n / 2; i++) {
            int temp = sorted[i];
            sorted[i] = sorted[n - 1 - i];
            sorted[n - 1 - i] = temp;
        }

        // 3. 원본에서 정렬된 배열에서의 순위 찾기
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (emergency[i] == sorted[j]) {
                    answer[i] = j + 1;
                    break;
                }
            }
        }

        return answer;
    }
}
