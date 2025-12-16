import java.util.*;



public class Solution {

 



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();



        while (t-- > 0) {

            int n = sc.nextInt();

            List<Integer> nums = new ArrayList<>();
            for(int i=0; i<n; i++){
                int num = sc.nextInt();
                nums.add(num);
            }

            int op = 0;

            // int i=0;
            // int j = 1;


            for(int i=0; i<nums.size(); i++){
                for(int j= i+1; j<nums.size(); j++){
                    if(nums.get(i) > nums.get(j)){
                        nums.remove(j);
                        op++;
                        j--;
                    }
                }
            }

            System.out.println(op);
            

        }

    }

}
