class Solution {
    public int[] separateDigits(int[] nums) {
        List <Integer> arr = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            String s = Integer.toString(nums[i]);
            for (int j = 0; j < s.length(); j++) {
                arr.add(s.charAt(j) - '0');
            }
        }

        int ans [] = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }
        return ans;
    }
}