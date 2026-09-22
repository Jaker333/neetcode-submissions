class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Use HashSet of characters to keep track of duplicate characters
        HashSet<Character> charSet = new HashSet<>();
        // Use l to keep track of left of longest substring
        int l = 0;
        // length of longest substring
        int result = 0;

        // Iterate through the string, with the right bound
        for (int r = 0; r < s.length(); r++)
        {
            // If any values are already in the set, remove them and increment 'l'
            while (charSet.contains(s.charAt(r)))
            {
                charSet.remove(s.charAt(l));
                l++;
            }
            // Always add character on the right to the set
            charSet.add(s.charAt(r));
            // Keep track of the length of the substring
            result = Math.max(r-l + 1, result);
        }
        // returns the longest substring at the end
        return result;
    }
}
