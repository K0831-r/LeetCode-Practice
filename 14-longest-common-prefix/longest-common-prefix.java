class Solution {
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0)
        {
            return "";
        }
        
       // start krenge first string kaha se prefix se
        String prefix = strs[0];

        // Compare krenge prefix ke sath each string
        for(int i=1; i< strs.length; i++)
        {
            // used krenege while loop chalayenge or current string start nahi hoga ke sath current
           // prefix

           while(!strs[i].startsWith(prefix))
           {
            // short hoga prefix ke duara remove krenge last character ko
               prefix = prefix.substring(0, prefix.length()-1);
                

                // agar prefix khali rehta hai toh return khali string krega
               if(prefix.isEmpty())
               {
                 return "";
               }
           } 
        }
        return prefix;
    }
    public static void main(String[] args)
    {
        String[] strs = {"flower","flow","flight"};
        System.out.println("Longest Common Prefix : "+longestCommonPrefix(strs));
    }
}