package TLE.BlankSpace;

import java.util.*;



public class Solution {

 



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

         while(t-- > 0){

            int n = sc.nextInt();

            int[] arr = new int[n];

            for(int i=0; i<n; i++){
              arr[i] = sc.nextInt();
            }


            int maxSeg = 0, currentSeg = 0;


            for(int i=0; i<n; i++){
              if(arr[i] == 0){
                currentSeg++;
              }

              else {
                currentSeg = 0;
              }

              maxSeg = Math.max(maxSeg, currentSeg);
            }

            System.out.println(maxSeg);

 
            }
            
 
            

    }

 
    }


