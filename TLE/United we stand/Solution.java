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
           List<Integer> b = new ArrayList<>();

           for (int i = 0; i <n; i++) {
              nums[i] = sc.nextInt();
           }


           List<Integer> c = new ArrayList<>();
           int minimum = nums[0];
           for (int i = 1; i <n; i++) {
                if(nums[i] < minimum){
                    minimum = nums[i];
                }
           }

           for (int i = 0; i < n; i++) {
                if(nums[i] == minimum){
                    b.add(nums[i]);
                }

                else {
                    c.add(nums[i]);
                }
           }


         if(!b.isEmpty() && !c.isEmpty()){
          

          System.out.print(b.size() +" ");
          System.out.println(c.size());

          for(Integer num : b){
            System.out.print(num + " ");
          }

          System.out.println();

          for(Integer num :c){
            System.out.print(num + " ");
          }

        }

        else {
            System.out.println(-1);
        }




        }
    }

}