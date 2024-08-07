class Solution {
     public static int[] twoSum(int[] nums, int target) {
	        HashMap<Integer, Integer> numss = new HashMap<>();

	        for(int i=0; i<nums.length; i++){

	            int numss1 = nums[i];

	            int apple = target-numss1;

	            if(numss.containsKey(apple))
	            {
	                return new int[] {numss.get(apple), i};
	            }

	            numss.put(numss1,i);
	        }

	        throw new IllegalArgumentException("No two sum solution");
	    }

	    public static void main(String[] args)
	    {
	        int[] nim = {2, 7, 11, 15};

	        int target = 9;

	        int[] result = twoSum(nim, target);

	         System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
	    }
}