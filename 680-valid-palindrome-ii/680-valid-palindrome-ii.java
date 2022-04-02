class Solution {
    public boolean validPalindrome(String s) {
                char ch[]=s.toCharArray();
                int l=0;
                int r=ch.length-1;
                while(l<=r)
                        {
                                if(ch[l]!=ch[r])
                                        {
                                        return ispal(ch,l+1,r) || ispal(ch,l,r-1);
                                        }
                                l++;
                                r--;
                        }
                        return true;
                }
public boolean ispal(char[] ch,int l,int r)
        {
        while(l<=r)
                {
                if(ch[l]!=ch[r])
                                {
                                return false;
                                }
                l++;
                r--;
                }
        return true;
        }
}


