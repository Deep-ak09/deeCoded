class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[n];
        int i = 0, j = n-1, k = n-1;
        while( k>=0 ) {         
            int a = nums[i] * nums[i] ;
            int b = nums[j] * nums[j] ; 
            if( a > b ) {
                ans[k] = a;
                k--;
                i++;
            } 
            else if ( a < b) {
                ans[k] = b;
                j--;
                k--;
            }
            else {
                ans[k] = a;
                j--;
                k--;
            }
        }
        return ans;        
    }
}