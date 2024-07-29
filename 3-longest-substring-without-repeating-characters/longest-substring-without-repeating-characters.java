class Solution {
    public static int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet<>();
        int maxLength = 0;
        int start = 0;

        for(int end = 0; end<s.length(); end++)
        {
           char currentChar = s.charAt(end);

            while(seen.contains(currentChar))
            {
                seen.remove(s.charAt(start));
                start++;
            }
            seen.add(currentChar);

            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
    public static void main(String[] args)
    {
        String s = "abcabcbb";
        System.out.println("Substring without repeating : "+lengthOfLongestSubstring(s));
    }
}