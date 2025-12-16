package TLE.ArrayColouring;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            
          int n = sc.nextInt();

          int[] nums = new int[n];

          for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
          }

          
          int sum = 0;

          for(int i=0; i<n; i++){
             
            sum += nums[i];
    
          }

          if(sum % 2 == 0){
            System.out.println("YES");
          }

          else {
            System.out.println("NO");
          }

        }
    }



}
