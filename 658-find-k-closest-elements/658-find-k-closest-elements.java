class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        LinkedList<Integer> result = new LinkedList<>();
        int ahead, behind;
        int ret = Arrays.binarySearch(arr, x);
        if (ret >= 0) {
            ahead = ret + 1;
            behind = ret;
        } else {
            ret = -(ret + 1);
            behind = ret - 1;
            ahead = ret;
        }
        int count = 0;
        while(count < k) {
            if (ahead == arr.length)
                result.addFirst(arr[behind--]);
            else if (behind < 0)
                result.addLast(arr[ahead++]);
            else {
                if (x - arr[behind] <=  arr[ahead] - x)
                    result.addFirst(arr[behind--]);
                else
                    result.addLast(arr[ahead++]);
            }
            count++;  
        }
        return result;
    }
}