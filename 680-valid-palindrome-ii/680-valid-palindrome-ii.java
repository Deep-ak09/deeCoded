class Solution {
    public boolean validPalindrome(String s) {
        return determinePalindrome(s,0);
    }
    /**
     *  In this method we compare characters of {param}s from beginning and end.
     *  Initially, diff is zero. When we face a unmatched characters we face two possibilities
     *  either s(i,j-1) are not in palindrome or s(i+1,j) so we perform recursion again with diff+1
     *  when ever diff > 1, program stops recursion.
     *  If two possibilities have more than 1 differences we get false || false returning false
     *  else if atleast one possibility is valid palindrome we get false || true => true.
     */
    boolean determinePalindrome(String s,int diff){
        int i=0;
        int j=s.length()-1;
        int localDiff=diff;
        while(i<=j){            
            if(s.charAt(i)!=s.charAt(j))
            {
                localDiff++;
                if(localDiff>1)
                    return false;
                boolean choiceB = determinePalindrome(s.substring(i,j),localDiff);
                boolean choiceA = determinePalindrome(s.substring(i+1,j+1),localDiff);
                return choiceA||choiceB;
            }   
            i++;
            j--;
        }
        return true;
    }
    
}


