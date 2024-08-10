class Solution {
    public String convert(String s, int numRows) {
        
        // handle krenge edge case ko or hame zigzag ki need nahi hai 
        if(numRows == 1 || numRows > s.length()){

            return s;
        }

        // initialize krenge ek list jo StringBuilder ke through har ek pankit ke liye  
        StringBuilder[] rows = new StringBuilder[numRows];

        for(int i = 0; i < numRows; i++){
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        
        // traverse the string, adding characters to the approtiate row.(string ko paar krenge     orwords ko jodenge)
        for(char c : s.toCharArray()){
            rows[currentRow].append(c);


            
            // change the direction when hitting the top or bottom row
            
            if(currentRow == 0 || currentRow == numRows - 1){
                goingDown = !goingDown;
            }

            currentRow += goingDown ? 1 : -1;
        }

       // combine all rows into one string
        StringBuilder result = new StringBuilder();

        for(StringBuilder row: rows){
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args){

        Solution s1 = new Solution();

        String s = "PAYPALISHIRING";

        int numRows = 3;
        System.out.println(s1.convert(s, numRows));

        numRows = 4;
        System.out.println(s1.convert(s, numRows));
    }
}