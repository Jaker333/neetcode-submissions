class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Key - int array to string; 
        // Value - List of strings of same frequency
        HashMap<String,List<String>> map = new HashMap<String,List<String>>();
        for (int i = 0; i < strs.length; i++)
        {
            // Add characters to array
            int[] array = new int[26];
            for (int j = 0; j < strs[i].length(); j++)
            {
                array[strs[i].charAt(j) - 'a']++;
            }

            // Turn int array to string
            String key = Arrays.toString(array);
            // Add string to key matching array
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(strs[i]);
        }
        
        return new ArrayList<>(map.values());
    }
}
