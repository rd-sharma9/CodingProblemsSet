import java.util.Scanner;
 
public class debug {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int [] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }

        int minimumValue = Math.abs(nums[0]);

        for (int i =1; i < nums.length; i++) {
            if(Math.abs(nums[i]) < minimumValue){
                minimumValue = Math.abs(nums[i]);
            }
        }

        System.out.println(minimumValue);



        sc.close();
    }

 

}
