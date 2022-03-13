class Solution {
   public static void reverse (int[] arr, int left, int right) {                       
    if ( arr.length == 1 )                                           
        return;                                                                     
    while ( left < right ) {                                                        
        int temp = arr[left];                                                       
        arr[left] = arr[right];                                                     
        arr[right] = temp;                                                          
        left++;                                                                     
        right--;                                                                    
    }                                                                               
}                                                                                   
                                                                                 
public static void rotate (int[] arr, int k) {                                      
    // k is greater then length of array  or not  we do this in order to get min val
    k = k % arr.length;                                                             
    //length of first part                                                          
    int a = arr.length - k;                                                         
    // reversing left part                                                          
    reverse(arr, 0, a - 1);                                                         
    // reversing right part                                                         
    reverse(arr, a, arr.length - 1);                                                
    // reversing whole array                                                        
    reverse(arr, 0, arr.length - 1);                                                
}                                                                                   
}
