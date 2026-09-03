class Solution {
    public int[] replaceElements(int[] arr) {
       int[] output = new int[arr.length];

for (int i = 0; i < arr.length; i++) {

    int max = -1;

    for (int j = i + 1; j < arr.length; j++) {

        if (arr[j] > max) {
            max = arr[j];
        }
    }

    output[i] = max;
}
return output;
        
    }
}