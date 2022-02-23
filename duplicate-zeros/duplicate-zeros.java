class Solution {
    
            public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                // for (int k = i; k < arr.length - 1; k++) {
                shifting(arr, i);
                i++;
                // }
            }
        }
    }

    public void shifting(int[] arr, int i) {
        for (int j = 0; j < arr.length - 1; j++) {
            if (arr.length - j - 1 > i)
                arr[arr.length - j - 1] = arr[arr.length - j - 2];
        }
    }
}