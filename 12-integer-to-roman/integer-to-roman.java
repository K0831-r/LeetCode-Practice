class Solution {
    public static String intToRoman(int num) {
        // define the values and their corresponding Roman numeral symbols
        int[] values=    {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] symbols={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        
        // Initialize a StringBuilder to build the Roman numerals result
        StringBuilder result = new StringBuilder();

       // Iterate through each value and symbol
        for(int i=0; i<values.length; i++){

            while(num >= values[i]){
                // while the current value can be subtracted from num
                num -= values[i]; // subtract the value from num
                result.append(symbols[i]); // Append the corresponding Roman numeral symbol
            }
        }

        return result.toString(); // Convert StringBuilder to String and return.
    }
    public static void main(String[] args){
        int num = 1994;
        System.out.println("Roman Numbers "+intToRoman(num));
    }
}