import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        int t=s.nextInt();

        while(t-->0){

            int n=s.nextInt();

            int arr[]=new int[n];

            for(int i=0;i<n;i++){

                arr[i]=s.nextInt();

            }

            int res=0;

            boolean b=false;

            for(int i=0;i<256;i++){

                int sum=0;

                for(int j=0;j<n;j++){

                    sum^=arr[j]^i;

                }

                if(sum==0){

                   b=true;

                   res=i;

                   break;

                }

            }

            System.out.println(!b?"-1":res);

        }

    }

} 