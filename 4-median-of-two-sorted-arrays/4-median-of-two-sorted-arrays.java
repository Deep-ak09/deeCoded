class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x = nums1.length;
            int y= nums2.length;
            int [] arr = new int[x+y];
            for(int i = 0; i<x+y;i++){
                    if(i<x){
                            arr[i] = nums1[i];
                    }else{
                            arr[i] = nums2[i-x];
                    }
            }
            Arrays.sort(arr);
            if((x+y)%2==0){
                    return ((double)arr[(x+y)/2]+(double)arr[(x+y-1)/2])/2;
            }else{
                    return (double)arr[(x+y)/2];
            }
    }
}