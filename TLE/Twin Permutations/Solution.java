import java.util.*;



public class Solution {

 



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

         while(t-- > 0){

            int n = sc.nextInt();


            int[] nums = new int[n];
            List<Integer> bs = new ArrayList<>();

            for(int i=0; i<n; i++){
               nums[i] = sc.nextInt();
               int bi = n+1 - nums[i];
               bs.add(bi);
            }

            for(Integer num : bs){
              System.out.print(num + " ");
            }




 
            }
            
 
            

    }

 
    }

