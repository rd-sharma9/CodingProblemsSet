import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0){
            int n = sc.nextInt();
            int [] nums = new int[n];
            List<Integer> b = new ArrayList<>();

            for(int i=0; i<n; i++){
               nums[i] = sc.nextInt();
                
            }

            b.add(nums[0]);

            for(int i=1; i<n; i++){
                
                if(nums[i] >= nums[i-1] ){
                    b.add(nums[i]); continue;
                }
                
                else {
                    // int min = Math.min(nums[i], nums[i-1]);
                    b.add(1);
                }

                b.add(nums[i]);
            }
            System.out.println(b.size());
            for(Integer num : b){
                System.out.print(num + " ");
            }
           





        }
    }

}