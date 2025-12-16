import java.util.ArrayList;
import java.util.List;

class Solution {
    
    // Function to remove duplicates from a GUARANTEED sorted array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        
        int n = arr.length;
        if (n == 0) {
            return new ArrayList<>();
        }
        
        // i is the 'write' pointer: it tracks the position of the last unique element found.
        int i = 0; 
        
        // j is the 'read' pointer: it iterates through the rest of the array.
        for (int j = 1; j < n; j++) {
            
            // Check if the element at j is different from the last unique element at i.
            if (arr[j] != arr[i]) {
                
                // 1. Move the write pointer to the next position.
                i++;
                
                // 2. Write the new unique element from j to position i.
                // Note: If i and j are adjacent, this is a self-copy (arr[i+1] = arr[i+1]).
                arr[i] = arr[j]; 
            }
            // If arr[j] == arr[i], it's a duplicate, so we skip it (only j advances).
        }
        
        // The unique elements are now stored from arr[0] to arr[i].
        
        // Extract the result into the required ArrayList.
        ArrayList<Integer> resultList = new ArrayList<>();
        
        // The total number of unique elements is i + 1.
        for (int k = 0; k <= i; k++) {
            resultList.add(arr[k]);
        }
        
        return resultList;
    }
}