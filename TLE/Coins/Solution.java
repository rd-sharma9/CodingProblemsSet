package TLE.Coins;

import java.util.*;



public class Solution {

 



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

         while(t-- > 0){

            long n = sc.nextLong();
            long k = sc.nextLong();

            if(n == 0){
              System.out.println("NO");
              continue;
            }

            if(n%2 == 0 || n%k == 0){
              System.out.println("YES");
              continue;
            }

            if((n-k)%2 == 0){
              System.out.println("YES");

            }

            else {
              System.out.println("NO");
            }


            }

  
            }
            
 
            

    }

 
    


