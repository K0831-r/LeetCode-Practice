class Solution {
    public String longestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        int start = 0, end = 0; 

        for (int i = 0; i < s.length(); i++) {
            // odd length palindrome, single character ke liye jo center 
            int eac1 = expandAroundCenter(s, i, i);
            // even length palindrome, two character ke liye  
            int eac2 = expandAroundCenter(s, i, i + 1);
            int eac = Math.max(eac1, eac2);

            if (eac > (end - start)) {
                start = i - (eac - 1) / 2;
                end = i + eac / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    private int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }
    public static void main(String[] args)
    {
    	Solution s1 = new Solution();

    	System.out.println(s1.longestPalindrome("babad"));
    	
    	System.out.println(s1.longestPalindrome("cbbd"));
    }
}