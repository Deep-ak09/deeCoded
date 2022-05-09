class Solution {
    public List<String> letterCombinations(String digits) {
            List<String> list = new LinkedList<>();
            if(digits.isEmpty()) return list;
            String pDigits = "";
            list = combinations(pDigits,digits);
           return list;
    }
       
    public List<String> combinations(String pDigits ,String digits){
        if(digits.length()==0){
                List<String> list = new LinkedList<>();
                list.add(pDigits);
                return list;
           }
               
            List<String> list = new LinkedList<>();
                int digit = digits.charAt(0)-'0';
            
                if(digit==7){
                        char z ='a';
                        for(int i = (digit-2)*3; i<(digit-1)*3; i++){
                                char ch = (char)('a'+i);
                                z=ch;
               list.addAll(combinations(pDigits+ch,digits.substring(1)));
                }
                             char ch = (char)(z+1);
               list.addAll(combinations(pDigits+ch,digits.substring(1)));
                }else if(digit==9){
                      char []arr = {'w','x','y','z'};  
                              for(int i=0;i<4;i++){
                                                                                                                         list.addAll(combinations(pDigits+arr[i],digits.substring(1)));  
                        }
                }
                else if(digit==8){
                        System.out.println("chal rha hai");
                        char []arr = {'t','u','v'};
                        for(int i=0;i<3;i++){
                                                                                                                         list.addAll(combinations(pDigits+arr[i],digits.substring(1)));  
                        }
                }else{
                        
                for(int i = (digit-2)*3; i<(digit-1)*3; i++){
                       char ch = (char)('a'+i);
                    list.addAll(combinations(pDigits+ch,digits.substring(1)));
                }
            
                }
                return list;
            
        }
}