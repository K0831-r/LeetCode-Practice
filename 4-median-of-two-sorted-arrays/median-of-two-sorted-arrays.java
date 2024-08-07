class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2)
	{
		if(nums1.length > nums2.length)	
		{
			return findMedianSortedArrays(nums2, nums1);
		}
		
		int m = nums1.length;
		int n = nums2.length;
		
		int mn = 0, max = m, halfLen = (m + n + 1) / 2;
		
		while(mn <=max) {
			int i = (mn + max) / 2;
			int j = halfLen - i;
			
			if(i < m && nums1[i] < nums2[j - 1]) {
				mn = i + 1;  } // agar i hamara chota rha toh must increse krna hoga
			else if(i > 0 && nums1[i - 1] > nums2[j]) { max = i - 1; }  // agar i bigger rha toh must decrese krna hoga
				
			else {
				// i is perfect
				int maxOfLeft;
				if(i==0) { maxOfLeft = nums2[j - 1]; }
					
				else if(j==0) { maxOfLeft = nums1[i - 1]; }
					
				else { maxOfLeft = Math.max(nums1[i - 1], nums2[j - 1]); }
				
				if((m + n) % 2 == 1) 
				{ return maxOfLeft; }
				
				int minOfRight;
				if(i == m) {minOfRight = nums2[j];}
				else if(j == n) {minOfRight = nums1[i];}
				else {minOfRight = Math.min(nums1[i], nums2[j]); }
				
				return (maxOfLeft + minOfRight) / 2.0;
			}
		}
		
		throw new IllegalArgumentException("Input Arrays are not sorted");
	}
	
	public static void main(String[] args) {
		
		Solution s = new Solution();
		int[] nums1 = {1, 3};
		int[] nums2 = {2};
		
		System.out.println("Median: "+s.findMedianSortedArrays(nums1, nums2));
		
		int[] nums1b = {1, 2};
		int[] nums2b = {3, 4};
		System.out.println("Median: "+s.findMedianSortedArrays(nums1b, nums2b));
	}
}