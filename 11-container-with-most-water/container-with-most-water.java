class Solution {
    public static int maxArea(int[] height) {
       int l = 0;
       int r = height.length-1;
       int max1=0;

       while(l<r){
        // Iss Container mein calculate krenge width or height kitni hai
        int width = r-l;
        int currentHeight=Math.min(height[l],height[r]);
        int currentArea=width * currentHeight;

        
        // calculate hone ke baad hum update krenge maximum area 
        max1 = Math.max(max1, currentArea);

       
        // move kreneg pointer ke side or pointing kreneg chota line ke liye
        if(height[l]<height[r]){
            l++;
        }else{
            r--;
        }

       } 
       return max1;
    }
    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Maximum Area : "+maxArea(height));
    }
}