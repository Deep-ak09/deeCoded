class Solution {
    public boolean isPowerOfThree(int n) {
            if(n==1) return true;
            return powerOf(n);
    }
        public boolean powerOf(int n){
                if(n==0||n%3!=0) return false;
                if(n/3==1){    
                    if(n%3==0){
                         return true;
                    }else{ 
                           if(n%3!=0&&n/3==1) return false;
                    }    
                }
                 return isPowerOfThree(n/3);
        }
}