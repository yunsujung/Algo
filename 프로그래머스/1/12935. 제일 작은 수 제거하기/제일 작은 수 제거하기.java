import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        // 배열이 하나만 있을 경우 [-1] 반환
        if (arr.length == 1) return new int[]{-1};

        // 가장 작은 값 찾기
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }

        // 가장 작은 값을 제외하고 리스트에 담기
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num != min) {
                list.add(num);
            }
        }

        // 리스트를 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
