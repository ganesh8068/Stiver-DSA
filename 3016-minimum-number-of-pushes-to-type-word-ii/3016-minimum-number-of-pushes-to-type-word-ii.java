// Count → Sort → Assign ✅
class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int arr[] = new int[26];
        for (int i = 0 ; i < n; i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            arr[index]++;
        }
        int minPushing = 0, pushCnt = 0;
        Arrays.sort(arr);
        for (int i = 25; i >= 0; i--) {
            int currEleIdx = 25 - i;
            if (currEleIdx % 8 == 0) pushCnt++;
            minPushing += arr[i] * pushCnt;
        }
        return minPushing;
    }
}