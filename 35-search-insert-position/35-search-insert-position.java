class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0;
            int h=nums.length;
        int m=nums.length/2;
            if(target>nums[h-1]) return h;
            if(target<nums[l]) return l;
            while(h>l){
                    if(nums[m]>target) h = m;
                    if(nums[m]<target) l = m;
                    if(nums[m]<target&&nums[m+1]>target) return m+1;
                    if(nums[m]==target) return m;
                    m=(l+h)/2;
            }
            return m;
    }
}