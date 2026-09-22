class Solution {
    public int maxArea(int[] heights) {
        int l = 0;
        int r = heights.length - 1;
        int largestArea = 0;

        while (l < r)
        {
            int base = r - l;
            int area = base * min(heights[l], heights[r]);

            if (area > largestArea)
            {
                largestArea = area;
            }

            if (heights[l] <= heights[r])
            {
                l++;
            }
            else 
            {
                r--;
            }
        }
        return largestArea;
    }

    public int min(int x, int y)
    {
        if (x <= y)
        {
            return x;
        }
        else
        {
            return y;
        }
    }
}
