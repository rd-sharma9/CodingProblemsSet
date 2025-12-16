class Solution1 {
  
    public static boolean containsAllSameElements(int[] arr) {
    // 1. Handle Edge Cases: Empty or single-element array
    if (arr == null || arr.length <= 1) {
        return true;
    }

    // 2. Establish Reference: Get the value of the first element
    int firstElement = arr[0];

    // 3. Iterate and Compare: Start from the second element (index 1)
    for (int i = 1; i < arr.length; i++) {
        // 4. Early Exit: If any element does not match the first, return false
        if (arr[i] != firstElement) {
            return false;
        }
    }

    // 5. Success: If the loop finishes, all elements are the same
    return true;
}
  
  
    public int getSecondLargest(int[] arr) {
        // code here
        
        if(containsAllSameElements(arr)){
            return -1;
        } 
        
        
        int lar = Integer.MIN_VALUE;
        int sL = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length; i++){
            
            if(arr[i] > lar){
                sL = lar;
                lar = arr[i];
            }
            
            else if(arr[i] != lar && arr[i] > sL){
                sL = arr[i];
            }
            
            
        }
        
        
     
        
        
        return sL;             
        
    }
}