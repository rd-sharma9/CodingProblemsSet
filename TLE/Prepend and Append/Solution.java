import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int t=sc.nextInt();

        while(t-->0){

            int n = sc.nextInt();
            
            String s = sc.next();

            char[] a= s.toCharArray();

            int i=0, j= a.length-1;

            for(int k=0; k<=n/2; k++){
                if(a[i] != a[j]){
                    i++;
                    j--;
                }
            }

            if(i>j){
                System.out.println(0);
                continue;
            }
            int shortLength = j-i+1;

            System.out.println(shortLength);
        }

    }

}
