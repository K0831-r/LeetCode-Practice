class Solution {
    public static int romanToInt(String s) {
        // Define a map to store Roman Numeral characters and their corresponding
      Map<Character, Integer> romanToInteger = new HashMap<>();
        romanToInteger.put('I', 1);
        romanToInteger.put('V', 5);
        romanToInteger.put('X', 10);
        romanToInteger.put('L', 50);
        romanToInteger.put('C', 100);
        romanToInteger.put('D', 500);
        romanToInteger.put('M', 1000);

        // initialize the total 0;
        int total = 0;

        // Loop through the string
        for(int i=0; i< s.length(); i++){
            int currentValue = romanToInteger.get(s.charAt(i));

            // check if there is a next character and if the current value is less than the next value 
            if(i < s.length() -1){
                int nextValue = romanToInteger.get(s.charAt(i + 1));

                if(currentValue < nextValue){
                    total -= currentValue; // subtract the value 
                }else{
                    total += currentValue;// add current value
                }
            }else{
                total += currentValue;// add the last charater's value
            }
        }
        return total;
    }

    public static void main(String[] args){
        System.out.println("Roman numeral IV converts to: "+romanToInt("IV"));
    }
}