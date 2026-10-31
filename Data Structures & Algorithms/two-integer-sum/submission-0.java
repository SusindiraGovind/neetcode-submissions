class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> vMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int expectedValue = target - nums[i];
            if (vMap.containsKey(expectedValue)) {
                return new int[]{vMap.get(expectedValue), i};
            } else {
                vMap.put(nums[i], i);
            }
        }
        return new int[0];
    }
}
