class Solution {
    public String longestPalindrome(String s) {
        int i = s.length();
        if (i == 1 || i == 0)
            return s;
        String z = "";
        String max = "";
        for (int j = 0; j < s.length(); j++) {
            i = s.length();
            z = s;
            z = z.substring(j, i);
            while (i > j && (i - j - 1) < z.length()) {
                    if (max.length() > (i - j - 1))
                        break;
                if (isPalindrome(z)) {
                    if (z.length() > max.length()) {
                        max = z;
                        break;
                    }
                } else {
                    // System.out.println(z);
                    z = z.substring(0, i - j - 1);
                }
                i--;
            }
        }
        return max;
    }
        public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}