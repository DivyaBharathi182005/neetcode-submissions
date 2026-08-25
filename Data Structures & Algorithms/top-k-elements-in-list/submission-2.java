class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency
        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int[] result = new int[k];

        // Find k highest frequencies
        for (int x = 0; x < k; x++) {

            int max = 0;
            int number = 0;

            for (int key : map.keySet()) {

                if (map.get(key) > max) {
                    max = map.get(key);
                    number = key;
                }
            }

            result[x] = number;

            // Remove so we don't select it again
            map.remove(number);
        }

        return result;
    }
}


//      class Solution { 
    // public int[] topKFrequent(int[] nums, int k) { 
 
      //  int[] freq = new int[256]; 
 
        // Count frequency 
       // for (int i = 0; i < nums.length; i++) { 
   //         freq[nums[i]]++; 
 //       } 
 
 //       int[] result = new int[k]; 
 
        // Find k highest frequencies 
 //       for (int x = 0; x < k; x++) { 
 
     //       int max = 0; 
     //       int index = -1; 
 
       //     for (int i = 0; i < freq.length; i++) { 
 
       //         if (freq[i] > max) { 
         //           max = freq[i]; 
         //           index = i; 
         //       } 
 //           } 
 
         //   result[x] = index; 
 
            // Don't select this element again 
   //         freq[index] = 0; 
   //     } 
 
   //     return result; 
 //   } 
//}