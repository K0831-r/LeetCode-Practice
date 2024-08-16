class Solution {
   public boolean isPalindrome(int x) 
    {
        // check krenge agar hamara value 0 se chota ho then print false
        if(x < 0)
        {
            return false;
        }
       
       // crate two variable
        int rev = 0;
        int ori = x;

       // condition check krega
        while(x!=0)
        {
            rev = rev * 10 + x % 10;
            x/=10;
        }
        return ori==rev;
    }
    public static void main(String[] args)
    {
        Solution s1 = new Solution();
        System.out.println(s1.isPalindrome(121));
    }
}