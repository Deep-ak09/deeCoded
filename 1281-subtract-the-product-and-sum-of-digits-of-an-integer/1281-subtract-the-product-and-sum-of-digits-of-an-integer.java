class Solution {
    public int subtractProductAndSum(int n) {
            int x = 1 ;
            int z=0;
         while(n>=1){
                 z+=n%10;
                 x*=n%10;
                 n/=10;
         }
            return x-z;
}
}