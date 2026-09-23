class Solution {
    public int singleNumber(int[] nums) {
        int res = 0;
        // [7,6,6,7,8]
        // 1. res = 7
        // 2. res = 1
        // 3. res = 7
        // 4. res = 0
        // 5. res = 8

        // [3,2,3]
        // 1. res = 3
        // 2. res = 1
        // 3. res = 2
        for (int n : nums)
        {
            res ^= n; // res = res ^ n
        }
        return res;
    }
}
