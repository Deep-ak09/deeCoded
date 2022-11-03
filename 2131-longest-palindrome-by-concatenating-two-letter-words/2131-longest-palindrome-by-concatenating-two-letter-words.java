class Solution {
     public int longestPalindrome(String[] words) {
        Map<String,Integer> map = new HashMap<>();
        int pair=0;
        int sym=0;
        for(String w:words) {
            String rev = w.charAt(1)+""+w.charAt(0);
            if(map.getOrDefault(rev,0)>0) {
                pair++;
                map.put(rev,map.getOrDefault(rev,0)-1);
                if(rev.equals(w)) {
                    sym--;
                }
            } else {
                map.put(w,map.getOrDefault(w,0)+1);
                if(rev.equals(w)) {
                    sym++;
                }
            }
        }
        return pair*4+(sym>0?2:0);
    }
}