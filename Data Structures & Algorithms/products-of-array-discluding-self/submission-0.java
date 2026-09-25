class Solution {
    public int[] productExceptSelf(int[] nums) {
        int total = 1;
        int zeros = 0;
        for (int n : nums)
        {
            if (n == 0)
                zeros++;
            else
                total *= n;
        }

        if (zeros >= 2)
        {
            return new int[nums.length];
        }

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            if (zeros > 0)
            {
                if (nums[i] == 0)
                {
                    res[i] = total;
                }
                else
                {
                    res[i] = 0;
                }
            }
            else
                res[i] = total / nums[i]; 
        }

        return res;
    }
}  
