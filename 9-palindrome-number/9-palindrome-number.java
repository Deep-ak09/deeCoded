class Solution {
    public boolean isPalindrome(int x) {
            int sum=0;int y=0;
            int z=x;
        while(x>=1){
                y=x%10;
                sum = sum*10+y;
                x/=10;
        }
            if(sum==z){
                    return true;
            }
        return false;
    }
}