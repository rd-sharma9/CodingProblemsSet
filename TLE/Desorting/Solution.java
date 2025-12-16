import java.util.*;



public class Solution {

 



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

         while(t-- > 0){

            int n = sc.nextInt();

            int[] nums = new int[n];


            for(int i=0; i<n; i++){
               nums[i] = sc.nextInt();
            }

           

            int minDiff = nums[1] - nums[0];
            int k=0,m=1;

            for(int i=2; i<n; i++){
               if((nums[i] - nums[i-1]) < minDiff){
                 minDiff = nums[i] - nums[i-1]; 
                 k = i-1;
                 m = i;
               }
            }

            if(minDiff < 0){
              System.out.println(0);
              continue;
            }
           
            int op = minDiff/2 + 1;

            System.out.println(op);
 
            }
            
    }

    


    

 
    }

