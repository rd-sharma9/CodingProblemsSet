import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();

        int annaCount = a + (int) Math.ceil((double)c/2);
        int katieCount = b +  (c - (int) Math.ceil((double)c/2));

          

          if(annaCount>katieCount) System.out.println("First");

          else System.out.println("Second");


        }
    }


 












}