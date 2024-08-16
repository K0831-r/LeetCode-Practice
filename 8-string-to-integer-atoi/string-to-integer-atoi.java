class Solution {
    public int myAtoi(String s) 
    {
       

        if(s == null || s.length() == 0)
        {
            return 0;
        }
    
       // this line to create variable type of integer
        int index = 0, n = s.length();
        int sign  = 1;
        int result = 0;
        int digit = 0;

       // ignore kiya jaa rha hai leading whitespace
        while(index < n && s.charAt(index) == ' ')
        {
            index++;
        }
       

       // check krenge ki agla character '+' ya  '-' hai
       if(index < n && (s.charAt(index) == '+' || s.charAt(index) == '-'))
       {
        sign = (s.charAt(index) == '-') ? -1 : 1;
        index++;
       }

       // convert krenge digits ko integer me.
        while(index < n && Character.isDigit(s.charAt(index)))
        {
             digit = s.charAt(index) - '0';
        
            if(result > (Integer.MAX_VALUE - digit)/10)
            {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
             
            result = result * 10 + digit;
            index++;  

        }

        
         return result * sign;
    }
      

    public static void main(String[] args)
    {
        Solution s1 = new Solution();

        System.out.println(s1.myAtoi("42"));
    }
}
