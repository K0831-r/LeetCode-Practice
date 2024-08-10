class Solution {
    public int reverse(int x) {
        
        int reversed = 0;

        while(x != 0){

            int pop = x % 10; // get he last digit
            x /=10; // remove the last digit


            // check krenge ki overflow/underflow usse phle multiply or adding krenge
            if(reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && pop > 7))
            {
                return 0;
            }

            if(reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && pop < -8))
            {
                return 0;
            }

            reversed = reversed * 10 + pop;
        }

        return reversed;
    }

    public static void main(String[] args)
    {
        Solution s1 = new Solution();

        int x = 123;
        System.out.println(s1.reverse(x));

        x = -321;
        System.out.println(s1.reverse(x));

        x = 120;
        System.out.println(s1.reverse(x));
    }
}