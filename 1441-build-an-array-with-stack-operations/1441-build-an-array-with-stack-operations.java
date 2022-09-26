class Solution {
    public List<String> buildArray(int[] target, int n) {
            List<String> list = new ArrayList<>();
            int j = 0;
        for(int i = 0; i<target[target.length-1]; i++){
                list.add("Push");
                if(i+1!=target[j]){
                        System.out.println("Here"+i+"||"+j);
                        list.add("Pop");
                        j--;
                }
                j++;
        }
            return list;
    }
}