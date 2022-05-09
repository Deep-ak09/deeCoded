class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ret=new ArrayList<>();
        if(digits==null || digits.length()==0){
            return ret;
        } 
        char[][] map=new char[10][];
        map[2]=new char[]{'a','b','c'};
        map[3]=new char[]{'d','e','f'};
        map[4]=new char[]{'g','h','i'};
        map[5]=new char[]{'j','k','l'};
        map[6]=new char[]{'m','n','o'};
        map[7]=new char[]{'p','q','r','s'};
        map[8]=new char[]{'t','u','v'};
        map[9]=new char[]{'w','x','y','z'};
        char[] arr=new char[digits.length()];
        
        recur(digits,0,map,ret,arr);
        return ret;
    }
    
    private void recur(String digits, int index, char[][] map, 
                       List<String> ret, char[] arr){
        if(index==arr.length){
            ret.add(String.valueOf(arr));
            return;
        }
        char cur=digits.charAt(index);
        for(char c:map[cur-'0']){
            arr[index]=c;
            recur(digits, index+1, map, ret, arr);
        }
    }
}