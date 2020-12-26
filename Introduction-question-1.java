class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0, count = 0;
        for (int num : nums) {
            if (num == 1) {
                ans = Math.max(ans, ++count);//"Maths.max is a function refer copy1-page1"//
            } else {
                count = 0;
            }
        }
        return ans;
    }
}
