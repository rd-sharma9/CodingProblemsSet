import java.util.*;



public class Solution {

 



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

         while(t-- > 0){

            int n = sc.nextInt();

            int[]nums = new int[n];

            int minOne = 0;
            int plusOne = 0;
            int op = 0;
            int sum = 0;

            for(int i=0; i<n; i++){
               nums[i] = sc.nextInt();
               sum +=  nums[i];
               if(nums[i] == 1) plusOne++;
               else minOne++;
            }


            if(sum>0 && (minOne%2 == 0)){
              System.out.println(0);
              continue;
            }

            if(sum > 0 && minOne%2 != 0){
               System.out.println(1);
               continue;
            }


            int k = (int) Math.ceil((double)(minOne - plusOne)/2);

            if((minOne-k) %2 != 0) k++;

            System.out.println(k);


            }

  
            }
            
 
            

    }

 
    

