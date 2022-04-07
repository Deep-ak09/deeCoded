class Solution {
    public boolean isPowerOfTwo(int n) {
            if(n<=0) return false;
        // if (n == 1)
        //     return true;
        return helper(n);
    }

    public static boolean helper(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 2 == 1) {
            return false;
        }
        return helper(n / 2);
    }
}