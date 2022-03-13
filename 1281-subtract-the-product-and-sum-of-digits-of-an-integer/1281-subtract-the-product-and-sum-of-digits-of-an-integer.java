class Solution {
    public int subtractProductAndSum(int n) {
            int x = 1 ;
            int z=0;
         while(n>=1){
                 int y = n%10;
                 z+=y;
                 x*=y;
                 n/=10;
         }
            return x-z;
}
}