class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Key - Count (how many times it appears)
        // Value - List of values of that count
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        // Fill count array for mapping keys
        // Key/Value - Number/HowManyTimes
        HashMap<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++)
        {
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
        }

        // Fill map with num values and frequencies
        for (int num : countMap.keySet())
        {
            int key = countMap.get(num);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(num);
        }

        // Return frequencies
        int[] result = new int[k];
        int count = 0;
        for (int i = nums.length; i > 0; i--)
        {
            // Contains i since if all values were same is starting point
            if (map.containsKey(i))
            {
                for (int j = 0; j < map.get(i).size(); j++)
                {
                    result[count] = map.get(i).get(j);
                    count++;

                    if (count == k)
                    {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
