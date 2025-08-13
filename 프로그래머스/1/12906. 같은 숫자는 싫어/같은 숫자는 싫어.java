public class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 0) return new int[0];

        // 1패스: 결과 크기 계산
        int cnt = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) cnt++;
        }

        // 2패스: 값 채우기
        int[] ans = new int[cnt];
        int w = 0;
        ans[w++] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) ans[w++] = arr[i];
        }
        return ans;
    }
}
