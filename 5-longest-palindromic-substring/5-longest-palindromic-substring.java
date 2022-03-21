class Solution {

public String longestPalindrome(String s) {
    
       if(s.length() == 1)
			 return s;
       
       String max_Sub = "";
		
	     for (int i = 0; i < s.length()-1; i++) {
	      String currentSubOdd = 	CheckPalindrome(s,i,i);
                     // For Odd substring Palindrome length like bab
	      String currentSubEven = 	CheckPalindrome(s,i,i+1);
                     // For Even substring Palindrome length like baba
	      
	      if(currentSubOdd.length() > max_Sub.length())
	    	  max_Sub = currentSubOdd;
	      
	      if(currentSubEven.length() > max_Sub.length())
	    	  max_Sub = currentSubEven;

            }
	     
	   return max_Sub;
}

	public String CheckPalindrome(String s, int left, int right) {
	
   while(left>=0 && right < s.length() && s.charAt(left) == s.charAt(right))
		{							
				--left;
				++right;
		}
	 
	 return s.substring(left+1,right);
}
}