import java.util.*;



public class Solution {

 



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

         while(t-- > 0){

            int n = sc.nextInt();

            int x = sc.nextInt();
            
            if(n % x != 0){
              System.out.println(1);
              System.out.println(n);
            }

            else { 
              System.out.println(2);
              System.out.print(1 + " ");
              System.out.println(n-1);
            }




 
            }
            
 
            

    }

 
    }

